/*
 * CurseAPI library - Java abstraction layer for Curse's feed & SOAP API
 * Copyright (C) 2018  Thiakil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.thiakil.curseapi;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class Murmur2Hash {
	private static final long SEED = 1;
	private static final int BUFFER_SIZE = 65536;
	private static final long UINT_MASK = 0xFFFFFFFFL;
	private static final int UNSIGNED_MASK = 0xff;

	public static long computeNormalizedFileHash(String path) throws IOException {
		return Murmur2Hash.computeFileHash(path, true);
	}

	public static long computeFileHash(String path, boolean normalizeWhitespace) throws IOException {
		FileChannel ch = null;
		try {
			ch = FileChannel.open(Paths.get(path), StandardOpenOption.READ);
			long len = normalizeWhitespace ? computeNormalizedLength(Channels.newInputStream(ch.position(0)), null) : ch.size();
			return computeHash(new BufferedInputStream(Channels.newInputStream(ch.position(0))), len, true);
		} finally {
			if (ch != null) ch.close();
		}
	}

	public static long computeHash(String input, boolean normalizeWhitespace) throws IOException {
		return Murmur2Hash.computeHash(input.getBytes(StandardCharsets.UTF_8), normalizeWhitespace);
	}

	public static long computeHash(byte[] input, boolean normalizeWhitespace) throws IOException {
		return Murmur2Hash.computeHash(new ByteArrayInputStream(input), 0L, normalizeWhitespace);
	}

	public static long computeHash(InputStream input, long precomputedLength, boolean normalizeWhitespace) throws IOException {
		long length = precomputedLength != 0 ? precomputedLength : input.available();
		if (precomputedLength == 0L & normalizeWhitespace) {
			if (!input.markSupported()) {
				//input = new BufferedInputStream(input);
				throw new IllegalArgumentException("Stream must support mark() to calculate size on the fly!");
			}
			input.mark(Integer.MAX_VALUE);
			length = Murmur2Hash.computeNormalizedLength(input, null);
			input.reset();
		}

		final long m = 0x5bd1e995L;
		final int r = 24;

		// Initialize the hash to a 'random' value
		long hash = ((SEED ^ length) & UINT_MASK);

		// Mix 4 bytes at a time into the hash
		long length4 = length >>> 2;

		for (int i = 0; i < length4; i++) {
			//final int i4 = i << 2;

			long k = (getByte(input, normalizeWhitespace) & UNSIGNED_MASK);
			k |= (getByte(input, normalizeWhitespace) & UNSIGNED_MASK) << 8;
			k |= (getByte(input, normalizeWhitespace) & UNSIGNED_MASK) << 16;
			k |= (getByte(input, normalizeWhitespace) & UNSIGNED_MASK) << 24;

			k = ((k * m) & UINT_MASK);
			k ^= ((k >>> r) & UINT_MASK);
			k = ((k * m) & UINT_MASK);

			hash = ((hash * m) & UINT_MASK);
			hash = ((hash ^ k) & UINT_MASK);
		}

		// Handle the last few bytes of the input array
		//int offset = length4 << 2;
		if ((length & 3) > 0) {
			byte[] data = new byte[4];

			switch (input.read(data, 0, 4)) {
				case 3:
					hash ^= ((data[2] << 16) & UINT_MASK);

				case 2:
					hash ^= ((data[1] << 8) & UINT_MASK);

				case 1:
					hash ^= (data[0] & UINT_MASK);
					hash = ((hash * m) & UINT_MASK);
			}
		}

		hash ^= ((hash >>> 13) & UINT_MASK);
		hash = ((hash * m) & UINT_MASK);
		hash ^= hash >>> 15;

		return hash;
	}

	public static long computeNormalizedHash(String input) throws Exception {
		return Murmur2Hash.computeHash(input, true);
	}

	public static long computeNormalizedHash(byte[] input) throws Exception {
		return Murmur2Hash.computeHash(input, true);
	}

	public static long computeNormalizedHash(InputStream input, long precomputedLength) throws IOException {
		return Murmur2Hash.computeHash(input, precomputedLength, true);
	}

	public static long computeNormalizedLength(InputStream input, byte[] buffer) throws IOException {
		long len = 0;
		if (buffer == null) buffer = new byte[BUFFER_SIZE];

		while (true) {
			int bytesRead = input.read(buffer, 0, BUFFER_SIZE);

			if (bytesRead < 1) return len;

			for (int index = 0; index < bytesRead; ++index) {
				if (!Murmur2Hash.isWhitespaceCharacter(buffer[index])) ++len;
			}
		}
	}

	private static boolean isWhitespaceCharacter(int b) {
		return b == 9 || b == 10 || b == 13 || b == 32;

	}

	private static int getByte(InputStream data, boolean skipWS) throws IOException {
		if (!skipWS) return data.read();
		int b;
		do {
			b = data.read();
		} while (isWhitespaceCharacter(b));
		return b;
	}
}

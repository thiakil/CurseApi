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

package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.FileStatus;

public class FileStatusAdaptor extends BeanEnumAdaptor<FileStatus> {
	public static final FileStatusAdaptor INSTANCE = new FileStatusAdaptor();
	
	private FileStatusAdaptor(){
		super(
				FileStatus.Normal,
				FileStatus.SemiNormal,
				FileStatus.Reported,
				FileStatus.Malformed,
				FileStatus.Locked,
				FileStatus.InvalidLayout,
				FileStatus.Hidden,
				FileStatus.NeedsApproval,
				FileStatus.Deleted,
				FileStatus.UnderReview,
				FileStatus.MalwareDetected,
				FileStatus.WaitingOnProject,
				FileStatus.ClientOnly
		);
	}
}

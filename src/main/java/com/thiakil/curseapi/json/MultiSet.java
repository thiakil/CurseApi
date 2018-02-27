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

package com.thiakil.curseapi.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

/**
 * Basic implementation of a multiset where one key maps to many values (in a set)
 * @param <KEYTYPE>
 * @param <ELEMENT>
 */
public class MultiSet<KEYTYPE,ELEMENT> extends HashMap<KEYTYPE, Set<ELEMENT>> {
	
	private final Supplier<Set<ELEMENT>> listProvider;
	
	public MultiSet(Supplier<Set<ELEMENT>> listProvider){
		this.listProvider = listProvider;
	}
	
	public MultiSet(){
		this(HashSet::new);
	}
	
	/**
	 * Adds value to the set for key
	 * @param key hashmap key
	 * @param value set element
	 * @return this, for chaining
	 */
	public MultiSet<KEYTYPE,ELEMENT> putValue(KEYTYPE key, ELEMENT value) {
		computeIfAbsent(key, k->listProvider.get()).add(value);
		return this;
	}
}

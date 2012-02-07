/*
 * Copyright (C) 2011 Marius Giepz
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free 
 * Software Foundation; either version 2 of the License, or (at your option) 
 * any later version.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 *
 */
package org.saiku.adhoc.model.master;

public class SaikuLabel implements SaikuElement{
	
	private String uid;

	private SaikuElementFormat format;

	private String value;

	public SaikuElementFormat getElementFormat() {
		return format;
	}

	public void setElementFormat(SaikuElementFormat format) {
		this.format = format;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.saiku.adhoc.model.master.SaikuElement#setUid(java.lang.String)
	 */
	@Override
	public void setUid(String uid) {
		this.uid = uid;
	}

	/* (non-Javadoc)
	 * @see org.saiku.adhoc.model.master.SaikuElement#getUid()
	 */
	@Override
	public String getUid() {
		return uid;
	}
	
	

}

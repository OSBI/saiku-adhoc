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
package org.saiku.adhoc.service.cda;

import java.io.OutputStream;

import org.saiku.adhoc.exceptions.CdaException;
import org.saiku.adhoc.model.master.SaikuMasterModel;

public interface ICdaAccessor {

	public abstract String doQuery(SaikuMasterModel model, String id,
			String outputType) throws CdaException;

	public abstract void doQuery(SaikuMasterModel query, String sessionId, String string, OutputStream output);

}
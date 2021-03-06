/**
 * Copyright 2013 Cesar Diego Chacòn Ramirez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.com.tahurikiller.entity;

import org.json.JSONObject;

/**
 * <h1>Credential</h1>
 * <p>
 * Entity what group the basic property for persistence with Google OAuth.
 * </p>
 * 
 * @author Tahuri Killer
 * 
 */
public class GoogleCredential {

	private String token_access;
	private String token_type;
	private Integer token_expires_in;

	/**
	 * 
	 * @param jsonCredential
	 *            String with data of Google's Credential in format JSON
	 */
	public GoogleCredential(String jsonCredential) {
		JSONObject token = new JSONObject(jsonCredential);
		setToken_access(token.getString("access_token"));
		setToken_expires_in(token.getInt("expires_in"));
		setToken_type(token.getString("token_type"));
	}

	/**
	 * <p>
	 * Return the token of access provided for Google OAuth.
	 * </p>
	 * 
	 * @return String With the token of access.
	 */
	public String getToken_access() {
		return token_access;
	}

	/**
	 * <p>
	 * Return the valid time of the token.
	 * </p>
	 * 
	 * @return Integer With the valid time of token.
	 */
	public Integer getToken_expires_in() {
		return token_expires_in;
	}

	/**
	 * <p>
	 * Return the type of token.
	 * </p>
	 * 
	 * @return String With type of token.
	 */
	public String getToken_type() {
		return token_type;
	}

	/**
	 * <p>
	 * Replaces or initialize the last token of access.
	 * </p>
	 * 
	 * @param token_de_acceso
	 *            This is new token of access.
	 */
	private void setToken_access(String token_of_access) {
		this.token_access = token_of_access;
	}

	/**
	 * <p>
	 * Replaces the previous expiration time for the new expiration time passed
	 * as parameter.
	 * </p>
	 * 
	 * @param el_token_expira_en
	 *            Time the token will remain valid.
	 */
	private void setToken_expires_in(Integer token_remain) {
		this.token_expires_in = token_remain;
	}

	/**
	 * <p>
	 * Replaces the token's type for the new token's type passed as parameter.
	 * </p>
	 * 
	 * @param tipo_de_token
	 *            Type of token.
	 */
	private void setToken_type(String type_of_token) {
		this.token_type = type_of_token;
	}

}

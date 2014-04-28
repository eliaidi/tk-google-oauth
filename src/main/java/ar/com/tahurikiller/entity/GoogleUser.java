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
 * <h1>User</h1>
 * <p>
 * Entity what it have the basic properties for user
 * </p>
 * 
 * @author Tahuri Killer
 * 
 */
public class GoogleUser {
	private String id;
	private String email;
	private Boolean verified_email;
	private String name;
	private String given_name;
	private String family_name;
	private String urlImage;
	private String linkProfile;
	private String gender;
	private String locale;
	private String timezone;

	/**
	 * 
	 * @param jsonUser
	 *            String with data of Google's user information in format JSON
	 */
	public GoogleUser(String jsonUser) {
		JSONObject user = new JSONObject(jsonUser);
		setId(user.getString("id"));
		setEmail(user.getString("email"));
		setVerified_email(user.getBoolean("verified_email"));
		setName(user.getString("name"));
		setGiven_name(user.getString("given_name"));
		setFamily_name(user.getString("family_name"));
		setUrlImage(user.getString("picture"));
		setLinkProfile(user.getString("link"));
		setGender(user.getString("gender"));
		setLocale(user.getString("locale"));
		setTimezone(user.getString("timezone"));
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the family_name
	 */
	public String getFamily_name() {
		return family_name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the given_name
	 */
	public String getGiven_name() {
		return given_name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the linkProfile
	 */
	public String getLinkProfile() {
		return linkProfile;
	}

	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the timezone
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * @return the image
	 */
	public String getUrlImage() {
		return urlImage;
	}

	/**
	 * @return the verified_email
	 */
	public Boolean getVerified_email() {
		return verified_email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	private void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param family_name
	 *            the family_name to set
	 */
	private void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	private void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param given_name
	 *            the given_name to set
	 */
	private void setGiven_name(String given_name) {
		this.given_name = given_name;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	private void setId(String id) {
		this.id = id;
	}

	/**
	 * @param linkProfile
	 *            the linkProfile to set
	 */
	private void setLinkProfile(String linkProfile) {
		this.linkProfile = linkProfile;
	}

	/**
	 * @param locale
	 *            the locale to set
	 */
	private void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @param timezone
	 *            the timezone to set
	 */
	private void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * @param urlImage
	 *            the urlImage to set
	 */
	private void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	/**
	 * @param verified_email
	 *            the verified_email to set
	 */
	private void setVerified_email(Boolean verified_email) {
		this.verified_email = verified_email;
	}

}

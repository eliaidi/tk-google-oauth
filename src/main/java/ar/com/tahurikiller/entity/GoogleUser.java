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
	private String name;
	private String email;
	private String urlImage;
	private String linkProfile;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the image
	 */
	public String getUrlImage() {
		return urlImage;
	}

	/**
	 * @return the linkProfile
	 */
	public String getLinkProfile() {
		return linkProfile;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param urlImage
	 *            the urlImage to set
	 */
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	/**
	 * @param linkProfile
	 *            the linkProfile to set
	 */
	public void setLinkProfile(String linkProfile) {
		this.linkProfile = linkProfile;
	}

}

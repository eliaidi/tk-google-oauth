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

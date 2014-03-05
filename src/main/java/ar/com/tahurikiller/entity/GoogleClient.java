package ar.com.tahurikiller.entity;

/**
 * <h1>Client</h1>
 * <p>
 * Entity that grouped the properties basic of the client for interact with Google OAuth
 * </p>
 * 
 * @author tahuri
 *
 */
public class GoogleClient {
	
	private String client_id;
	private String client_secret;
	private String redirect_uri;
	private String grant_type;
	
	/**
	 * @return the client_id
	 */
	public String getClient_id() {
		return client_id;
	}
	
	/**
	 * @return the client_secret
	 */
	public String getClient_secret() {
		return client_secret;
	}
	
	/**
	 * @return the redirect_uri
	 */
	public String getRedirect_uri() {
		return redirect_uri;
	}
	
	/**
	 * @return the grant_type
	 */
	public String getGrant_type() {
		return grant_type;
	}
	
	/**
	 * @param client_id the client_id to set
	 */
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	
	/**
	 * @param client_secret the client_secret to set
	 */
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	
	/**
	 * @param redirect_uri the redirect_uri to set
	 */
	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}
	
	/**
	 * @param grant_type the grant_type to set
	 */
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
}

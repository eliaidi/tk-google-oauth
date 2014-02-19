package ar.com.tahurikiller.entidades;

/**
 * <h1>
 * Credential</h1>
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
	private String token_expires_in;
	private String token_id;

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
	 * @return String With the valid time of token.
	 */
	public String getToken_expires_in() {
		return token_expires_in;
	}

	/**
	 * <p>
	 * Return the id of token.
	 * </p>
	 * 
	 * @return String With the id of token.
	 */
	public String getToken_id() {
		return token_id;
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
	public void setToken_access(String token_de_acceso) {
		this.token_access = token_de_acceso;
	}

	/**
	 * <p>
	 * Replaces the previous expiration time for the new expiration time passed as parameter.
	 * </p>
	 * 
	 * @param el_token_expira_en
	 *            Time the token will remain valid.
	 */
	public void setToken_expires_in(String el_token_expira_en) {
		this.token_expires_in = el_token_expira_en;
	}

	/**
	 * <p>
	 * Reemplaza el id de token anterior con el pasado por parametro, este id de
	 * token es provisto por Google OAuth.
	 * </p>
	 * 
	 * @param id_token
	 *            Id del token.
	 */
	public void setToken_id(String id_token) {
		this.token_id = id_token;
	}

	/**
	 * <p>
	 * Reemplaza el tipo de token por el provisto en el parametro, este tipo de
	 * token es provisto por Google OAuth
	 * </p>
	 * 
	 * @param tipo_de_token
	 *            Tipo de token.
	 */
	public void setToken_type(String tipo_de_token) {
		this.token_type = tipo_de_token;
	}

}

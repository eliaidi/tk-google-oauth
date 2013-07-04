package ar.com.tahurikiller.entidades;

/**
 * <h1>
 * Credencial</h1>
 * <p>
 * Entidad que agrupa los datos basicos para mantener una conecc&oacute;n con
 * Google OAuth.
 * </p>
 * 
 * @author Tahuri Killer
 * 
 */
public class GoogleCredencial {

	private String token_access;
	private String token_type;
	private String token_expires_in;
	private String token_id;

	/**
	 * <p>
	 * Retorna el Token de acceso provisto por Google OAuth, para acceder a los
	 * datos del usuario que se intento logear.
	 * </p>
	 * 
	 * @return String con el Token de Acceso.
	 */
	public String getToken_access() {
		return token_access;
	}

	/**
	 * <p>
	 * Retorna el Tiempo que el token permanecera valido.
	 * </p>
	 * 
	 * @return String con el timpo que el token permanecera valido.
	 */
	public String getToken_expires_in() {
		return token_expires_in;
	}

	/**
	 * <p>
	 * Retorna el id del token.
	 * </p>
	 * 
	 * @return String con el id del token.
	 */
	public String getToken_id() {
		return token_id;
	}

	/**
	 * <p>
	 * Retorna el tipo de token.
	 * </p>
	 * 
	 * @return String con tipo de token.
	 */
	public String getToken_type() {
		return token_type;
	}

	/**
	 * <p>
	 * Reemplaza el anterior token de acceso o lo inicializa. Este token es
	 * provisto por Google OAuth.
	 * </p>
	 * 
	 * @param token_de_acceso
	 *            Es el nuevo token de acceso.
	 */
	public void setToken_access(String token_de_acceso) {
		this.token_access = token_de_acceso;
	}

	/**
	 * <p>
	 * Reemplaza el anterior Tiempo de expiraci&oacute;n por el tiempo pasado
	 * como parametro, estos tiempos de expiraci&oacute;n son provistos por
	 * Google OAuth.
	 * </p>
	 * 
	 * @param el_token_expira_en
	 *            Tiempo que el token permanecera valido.
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

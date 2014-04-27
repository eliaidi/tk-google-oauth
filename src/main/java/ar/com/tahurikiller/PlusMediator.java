package ar.com.tahurikiller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import ar.com.tahurikiller.entity.GoogleCredential;

/**
 * <h1>Mediator</h1>
 * <p>
 * This Class is the mediator with Google Plus
 * </p>
 * 
 * @author tahuri
 * 
 */
public class PlusMediator {

	private GoogleCredential credential;

	private String url;

	/**
	 * 
	 * @param credential
	 *            of type {@link GoogleCredential}
	 * @param url
	 *            of type {@link String}
	 */
	public PlusMediator(GoogleCredential credential, String url) {
		setCredential(credential);
		setUrl(url);
	}

	/**
	 * <p>
	 * Call get of Google Plus for get Information User
	 * </p>
	 * 
	 * @return
	 * @throws IOException
	 */
	public String callGetForGetInformationUser() throws IOException {
		String respuesta = "";
		String datResp = "";
		URLConnection conn = (new URL(URLEncoder.encode(getUrl()
				+ getCredential().getToken_access(), "UTF-8")))
				.openConnection();
		BufferedReader io = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		while ((datResp = io.readLine()) != null) {
			respuesta += datResp;
		}
		return respuesta;
	}

	/**
	 * @return the credential
	 */
	private GoogleCredential getCredential() {
		return credential;
	}

	/**
	 * @return the url
	 */
	private String getUrl() {
		return url;
	}

	/**
	 * @param credential
	 *            the credential to set
	 */
	private void setCredential(GoogleCredential credential) {
		this.credential = credential;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	private void setUrl(String url) {
		this.url = url;
	}
}

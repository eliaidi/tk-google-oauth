package ar.com.tahurikiller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import ar.com.tahurikiller.entity.GoogleClient;

/**
 * <h1>Mediator</h1>
 * <p>
 * This Class is the mediator with Google
 * </p>
 * 
 * @author tahuri
 * 
 */
public class GoogleMediator {

	private URL url;

	private GoogleClient client;

	/**
	 * 
	 * @param client
	 *            for be used
	 * @param url
	 *            for be used
	 */
	public GoogleMediator(GoogleClient client, URL url) {
		setClient(client);
		setUrl(url);
	}

	/**
	 * <p>
	 * Called for post a Google OAuth for get credentials
	 * </p>
	 * 
	 * @param code
	 *            the code of autorization
	 * 
	 */
	public String callPostWithCredential(String code) throws IOException {
		String respuesta = "";
		try {
			String dato = "";
			URLConnection conn = getUrl().openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter writer = new OutputStreamWriter(
					conn.getOutputStream());
			writer.write(getClient().getParamsForGoogleOAuth(code));
			writer.close();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			while ((dato = reader.readLine()) != null) {
				respuesta += dato;
			}
		} catch (IOException e) {
			throw new IOException(
					"Fail in the obtain of credentials - Connection was not open");
		}
		return respuesta;
	}

	/**
	 * @return the client
	 */
	private GoogleClient getClient() {
		return client;
	}

	/**
	 * @return the url
	 */
	private URL getUrl() {
		return url;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	private void setClient(GoogleClient client) {
		this.client = client;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	private void setUrl(URL url) {
		this.url = url;
	}
}

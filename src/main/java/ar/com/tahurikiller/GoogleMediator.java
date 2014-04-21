package ar.com.tahurikiller;

import java.net.URL;

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

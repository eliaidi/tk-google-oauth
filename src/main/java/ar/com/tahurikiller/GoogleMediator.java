package ar.com.tahurikiller;

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

	private GoogleClient client;

	/**
	 * 
	 * @param client
	 *            for be used
	 */
	public GoogleMediator(GoogleClient client) {
		setClient(client);
	}

	/**
	 * @return the client
	 */
	private GoogleClient getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	private void setClient(GoogleClient client) {
		this.client = client;
	}
}

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
package ar.com.tahurikiller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import ar.com.tahurikiller.entity.GoogleClient;
import ar.com.tahurikiller.entity.GoogleCredential;

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
	 *            for be used of type {@link GoogleClient}
	 * @param url
	 *            for be used of type {@link java.net.URL}
	 */
	public GoogleMediator(GoogleClient client, URL url) {
		setClient(client);
		setUrl(url);
	}

	/**
	 * <p>
	 * Call post of Google OAuth for get credentials
	 * </p>
	 * 
	 * @param code
	 *            of autorization
	 * @return {@link GoogleCredential}
	 * @throws IOException
	 */
	public GoogleCredential callPostForGetCredentials(String code)
			throws IOException {
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
		return new GoogleCredential(respuesta);
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

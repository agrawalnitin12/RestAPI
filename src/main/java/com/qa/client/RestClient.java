package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	// Get Method without Headers
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url); // http get request
		CloseableHttpResponse closeableHttpResponse = HttpClient.execute(httpget); // hit the GET URL
		return closeableHttpResponse;
	}

	//Get Method with Headers
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url); // http get request
		
		
		CloseableHttpResponse closeableHttpResponse = HttpClient.execute(httpget); // hit the GET URL
		return closeableHttpResponse;
	}
}
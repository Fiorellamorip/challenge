package com.challenge.apirest.controller;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.constraints.AssertTrue;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import static com.challenge.algorithm.Constantes.URL_API;
import static com.challenge.algorithm.Constantes.MSG_TEST;
import static com.challenge.algorithm.Constantes.MSG_DECRYPTED_TEST;
import static com.challenge.algorithm.Constantes.SERVER;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ApiRestTest {
	@LocalServerPort
	int randomServerPort;

	@Test
	public void testGetMessageDecrypted() 
	{

		RestTemplate restTemplate = new RestTemplate();

		final String baseUrl = SERVER + randomServerPort + URL_API+MSG_TEST;
		URI uri;
		try {
			uri = new URI(baseUrl);
			ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
			//Verify request succeed
			Assert.assertEquals(200, result.getStatusCodeValue());
			Assert.assertEquals(true, result.getBody().contains(MSG_DECRYPTED_TEST));
		} catch (URISyntaxException e) {
			Assert.fail();
		}


	}
	/*@Test
	public void testPostMessage() throws URISyntaxException, IncorrectFormatException
	{
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = SERVER+randomServerPort+URL_API;
		URI uri = new URI(baseUrl);
		Mensaje msg = new Mensaje(MSG_TEST);

		HttpHeaders headers = new HttpHeaders();

		HttpEntity<Mensaje> request = new HttpEntity<>(msg);
			ResponseEntity<String> result =restTemplate.postForEntity(uri, msg, String.class);
			Assert.assertEquals(201, result.getStatusCodeValue());
			//Assert.assertEquals(true, result.getBody().contains(MSG_DECRYPTED_TEST));

			//Assert.fail();
			//Assert.assertEquals(400, ex.getRawStatusCode());
			//Assert.assertEquals(true, ex.getResponseBodyAsString().contains(""));


	}*/
}


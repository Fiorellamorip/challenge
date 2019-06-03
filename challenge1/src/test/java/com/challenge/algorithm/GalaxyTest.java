package com.challenge.algorithm;
import org.junit.Test;

import com.challenge.algorithm.Galaxy;
import com.challenge.services.exceptions.IncorrectFormatException;

import static org.junit.Assert.*;
public class GalaxyTest {

	@Test
	public void testDesencriptaGalaxy() throws IncorrectFormatException {
		Coordenada myUnit = new Galaxy("6f9c15fa");

		String result = myUnit.desencripta();

		assertEquals("73", result);

	}
	@Test(expected = IncorrectFormatException.class)
	public void testInvalidFormatGalaxy() throws IncorrectFormatException {
		Coordenada myUnit = new Galaxy("6f9c15fz");
		myUnit.desencripta();
	}
}


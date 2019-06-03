package com.challenge.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.challenge.algorithm.Planet;
import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;

public class PlanetTest {

	@Test
	public void testDesencriptaPlanet() throws IncorrectFormatException {
		Coordenada myUnit = new Planet("36218d76c2d9");

		String result = myUnit.desencripta();

		assertEquals("dc9876321", result);

	}
	
	@Test(expected = IncorrectFormatException.class)
	public void testInvalidFormatPlanet() throws IncorrectFormatException {
		Coordenada myUnit = new Planet("6f9c15fz");
		myUnit.desencripta();
	}

}

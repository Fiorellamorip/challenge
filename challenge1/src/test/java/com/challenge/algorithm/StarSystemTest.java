package com.challenge.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.challenge.algorithm.StarSystem;
import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;

public class StarSystemTest {

	@Test
	public void testDesencriptaStarSystem() throws IncorrectFormatException {
		Coordenada myUnit = new StarSystem("4415","afab");

		String result = myUnit.desencripta();
		System.out.println(result);
		assertEquals("46", result);

	}

	@Test(expected = IncorrectFormatException.class)
	public void testInvalidFormatStarSystem() throws IncorrectFormatException {
		Coordenada myUnit = new StarSystem("6f9c15fz","123");
		myUnit.desencripta();
	}

}

package com.challenge.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.challenge.algorithm.Quadrant;
import com.challenge.services.exceptions.IncorrectFormatException;

public class QuadrantTest {

	   @Test
	    public void testDesencriptaQuadrant() throws IncorrectFormatException  {
		   Coordenada myUnit = new Quadrant("ef51");

	        String result = myUnit.desencripta();

	        assertEquals("15", result);

	    }
		@Test(expected = IncorrectFormatException.class)
		public void testInvalidFormatQuadrant() throws IncorrectFormatException {
			Coordenada myUnit = new Quadrant("6f9c15fz");
			myUnit.desencripta();
		}

}

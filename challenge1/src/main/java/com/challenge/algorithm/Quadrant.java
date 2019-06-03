package com.challenge.algorithm;

import com.challenge.services.exceptions.IncorrectFormatException;
import static com.challenge.algorithm.Constantes.HEX;

public class Quadrant implements Coordenada{
	String quadrant;

	public Quadrant(String quadrant) {
		this.quadrant = quadrant;
	}

	public String desencripta() throws IncorrectFormatException {
		int desencriptado = 0;
		String s;
		int part = 0;
		char c;
		for (int i = 0; i < quadrant.length(); i++) {
			c = quadrant.charAt(i);
			s = Character.toString(c);
			try{
				part = Integer.parseInt(s, HEX);
				if(part>desencriptado)
					desencriptado = part;
			} catch (NumberFormatException e) {
				throw new IncorrectFormatException("Quadrant must be a hexadecimal");
			}
			catch (Exception e)
			{
				throw new IncorrectFormatException("Incorrect format for Quadrant");
			}
		}
		return Integer.toString(desencriptado);
	}

}

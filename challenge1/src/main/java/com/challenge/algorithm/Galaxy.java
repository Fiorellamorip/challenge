package com.challenge.algorithm;

import static com.challenge.algorithm.Constantes.HEX;

import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;

public class Galaxy implements Coordenada{
	String cadena;

	Galaxy(String cadena) {
		this.cadena = cadena;
	}

	public String desencripta() throws IncorrectFormatException {
		int desencriptado = 0;
		String s;
		int part = 0;
		char c;
		for (int i = 0; i < cadena.length(); i++) {
			c = cadena.charAt(i);
			s = Character.toString(c);
			try {
				part = Integer.parseInt(s, HEX);
				desencriptado += part;
			} catch (NumberFormatException e) {
				throw new IncorrectFormatException("Galaxy must be a hexadecimal");
			}
			catch (Exception e)
			{
				throw new IncorrectFormatException("Incorrect format for Galaxy");
			}

		}
		return  Integer.toString(desencriptado);
	}

}

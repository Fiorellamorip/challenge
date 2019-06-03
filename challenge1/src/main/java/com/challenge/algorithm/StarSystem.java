package com.challenge.algorithm;

import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;
import static com.challenge.algorithm.Constantes.HEX;

public class StarSystem implements Coordenada {
	String star1;
	String star2;


	public StarSystem(String star1, String star2) {
		this.star1 = star1;
		this.star2 = star2;
	}

	public String desencripta() throws IncorrectFormatException{
		int desencriptado = 0;

		String s_star1;
		String s_star2;
		int part1 = 0;
		int part2 = 0;
		char c_star1;
		char c_star2;
		if(star1.length()!=star2.length())
			throw new IncorrectFormatException("The third and fourth group doesnt has the same size");

		for (int i = 0; i < star1.length(); i++) {
			c_star1 = star1.charAt(i);
			c_star2 = star2.charAt(i);
			s_star1 = Character.toString(c_star1);
			s_star2 = Character.toString(c_star2);
			try {
				part1 = Integer.parseInt(s_star1, HEX);
				part2 = Integer.parseInt(s_star2, HEX);
				if(part1>part2)
					desencriptado+=part1;
				else
					desencriptado+=part2;
			} catch (NumberFormatException e) {
				throw new IncorrectFormatException("Star System must be a hexadecimal");
			}
			catch (Exception e)
			{
				throw new IncorrectFormatException("Incorrect format for Star System");
			}
		}
		return Integer.toString(desencriptado);
	}

}

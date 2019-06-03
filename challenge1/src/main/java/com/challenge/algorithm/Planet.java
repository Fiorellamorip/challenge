package com.challenge.algorithm;

import java.util.ArrayList;
import static com.challenge.algorithm.Constantes.HEX;
import java.util.Collections;
import java.util.List;

import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;

public class Planet implements Coordenada{
	String planet;

	public Planet(String planet) {
		this.planet = planet;
	}

	public String desencripta() throws IncorrectFormatException  {
		String hex = "";
		List<Integer> list = new ArrayList<Integer>(planet.length());
		String s;
		int part = 0;
		char c;
		for (int i = 0; i < planet.length(); i++) {
			c = planet.charAt(i);
			s = Character.toString(c);
			try {
			part = Integer.parseInt(s, HEX);
			if (!list.contains(part))
				list.add(part);
			
		} catch (NumberFormatException e) {
			throw new IncorrectFormatException("Planet must be a hexadecimal");
		}
		catch (Exception e)
		{
			throw new IncorrectFormatException("Incorrect format for Planet");
		}

		}
		Collections.sort(list, Collections.reverseOrder());
		for (int actual : list)
			hex += Integer.toHexString(actual);
		return hex;

	}
}

package com.challenge.algorithm;

import com.challenge.services.exceptions.IncorrectFormatException;
import static com.challenge.algorithm.Constantes.POS_GALAXY;
import static com.challenge.algorithm.Constantes.POS_QUADRANT;
import static com.challenge.algorithm.Constantes.POS_STARSYSTEM_1;
import static com.challenge.algorithm.Constantes.POS_STARSYSTEM_2;
import static com.challenge.algorithm.Constantes.POS_PLANET;
import static com.challenge.algorithm.Constantes.NUM_COORDENADAS;
import static com.challenge.algorithm.Constantes.SEPARADOR_COORDENADAS;

public class Cifrado {
	Coordenada galaxy;
	Quadrant quadrant;
	StarSystem starSystem;
	Planet planet;

	public Cifrado(String mensaje) throws IncorrectFormatException {
		String[] parts=mensaje.split(SEPARADOR_COORDENADAS);
		if(parts.length!=NUM_COORDENADAS) 
			throw new IncorrectFormatException("the number of coordinates must be 5");
		galaxy=new Galaxy(parts[POS_GALAXY]);
		quadrant=new Quadrant(parts[POS_QUADRANT]);
		starSystem=new StarSystem(parts[POS_STARSYSTEM_1],parts[POS_STARSYSTEM_2]);
		planet=new Planet(parts[POS_PLANET]);
	}


	public String desencriptarGalaxy() throws IncorrectFormatException {
		String mensajeDesencriptado="";	
		mensajeDesencriptado=galaxy.desencripta();
		return mensajeDesencriptado;
	}
	public String desencriptarQuadrant() throws IncorrectFormatException {
		String mensajeDesencriptado="";	
		mensajeDesencriptado=quadrant.desencripta();
		return mensajeDesencriptado;
	}
	public String desencriptarStarSystem() throws IncorrectFormatException {
		String mensajeDesencriptado="";	
		mensajeDesencriptado=starSystem.desencripta();
		return mensajeDesencriptado;
	}
	public String desencriptarPlanet() throws IncorrectFormatException {
		String mensajeDesencriptado="";	
		mensajeDesencriptado=planet.desencripta();
		return mensajeDesencriptado;
	}
}

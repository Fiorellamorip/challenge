package com.challenge.services.model;


import com.challenge.algorithm.Cifrado;
import com.challenge.services.exceptions.IncorrectFormatException;
import com.challenge.services.exceptions.ResourceNotFoundException;

/**
 * @author fiorella.mori
 *
 */
/**
 * @author fiorella.mori
 *
 */
public class Mensaje {
	String id;
	String galaxy;
	String quadrant;
	String starSystem;
	String planet;


	public	Mensaje(String cifrado) throws IncorrectFormatException  {
		setId(cifrado);
		desencriptar();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setGalaxy(String galaxy) {
		this.galaxy = galaxy;
	}
	public String getGalaxy() {
		return galaxy;
	}
	public void setQuadrant(String quadrant) {
		this.quadrant = quadrant;
	}
	public String getQuadrant() {
		return quadrant;
	}
	public void setStarSystem(String starSystem) {
		this.starSystem = starSystem;
	}
	public String getStarSystem() {
		return starSystem;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public String getPlanet() {
		return planet;
	}



	public void desencriptar() throws IncorrectFormatException {
		Cifrado cif=new Cifrado(id);
		galaxy=cif.desencriptarGalaxy();
		quadrant=cif.desencriptarQuadrant();
		starSystem=cif.desencriptarStarSystem();
		planet=cif.desencriptarPlanet();
	}
}

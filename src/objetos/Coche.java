package objetos;

import herency.*;
import java.util.*;

public class Coche extends Vehicle{

	/***
	 * Creacion de las variables del coche
	 */
	protected Rueda delanteras;
	protected Rueda traseras;
	protected ArrayList<Persona> arrayPersonas = new ArrayList();

	/**
	 * @param marca
	 * @param color
	 * @param matricula
	 * @param delanteras
	 * @param traseras
	 */
	public Coche(String marca, String color, String matricula, Rueda delanteras, Rueda traseras) {
		super(marca, color, matricula);
		this.delanteras = delanteras;
		this.traseras = traseras;
	}

	/**
	 * @return the delanteras
	 */
	public Rueda getDelanteras() {
		return delanteras;
	}

	/**
	 * @param delanteras the delanteras to set
	 */
	public void setDelanteras(Rueda delanteras) {
		this.delanteras = delanteras;
	}

	/**
	 * @return the traseras
	 */
	public Rueda getTraseras() {
		return traseras;
	}

	/**
	 * @param traseras the traseras to set
	 */
	public void setTraseras(Rueda traseras) {
		this.traseras = traseras;
	}
	
	public void addPersona(Persona persona) {
		this.arrayPersonas.add(persona);
		System.out.println("--Persona introducida--");
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", matricula=" + matricula + "]";
	}

	//metodo abstracto heredado de la clase Vehicle
	public String controlarMatricula(String matricula) {

		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matrícula válida");
			return matricula;

		} else {

			System.out.println("Matrícula inválida, se va a añadir una matricula por defecto.");
			return "Seat";
		}
	}

}

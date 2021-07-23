package objetos;

import herency.Vehicle;

public class Bike extends Vehicle {
	/***
	 * Creacion de las variables
	 */
	protected Rueda delantera;
	protected Rueda trasera;

	/**
	 * @param marca
	 * @param color
	 * @param matricula
	 * @param delantera
	 * @param trasera
	 */
	public Bike(String marca, String color, String matricula, Rueda delantera, Rueda trasera) {
		super(marca, color, matricula);
		this.delantera = delantera;
		this.trasera = trasera;
	}

	/**
	 * @return the delantera
	 */
	public Rueda getDelantera() {
		return delantera;
	}

	/**
	 * @param delantera the delantera to set
	 */
	public void setDelantera(Rueda delantera) {
		this.delantera = delantera;
	}

	/**
	 * @return the trasera
	 */
	public Rueda getTrasera() {
		return trasera;
	}

	/**
	 * @param trasera the trasera to set
	 */
	public void setTrasera(Rueda trasera) {
		this.trasera = trasera;
	}


	//metodo abstracto heredado de la clase Vehicle
	@Override
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

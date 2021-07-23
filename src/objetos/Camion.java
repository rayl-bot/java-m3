package objetos;

import herency.Vehicle;

public class Camion extends Vehicle {

	protected Rueda delanteras;
	protected Rueda traseras;

	/**
	 * @param marca
	 * @param color
	 * @param matricula
	 * @param delanteras
	 * @param traseras
	 */
	public Camion(String marca, String color, String matricula, Rueda delanteras, Rueda traseras) {
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
	
	@Override
	public String toString() {
		return "Camion [marca=" + marca + ", color=" + color + ", matricula=" + matricula + "]";
	}

	@Override
	public String controlarMatricula(String matricula) {
		// TODO Auto-generated method stub

		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matrícula válida");
			return matricula;

		} else {

			System.out.println("Matrícula inválida, se va a añadir una matricula por defecto.");
			return "Seat";
		}
	}

}

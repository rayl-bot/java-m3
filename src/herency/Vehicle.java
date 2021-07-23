package herency;

public abstract class Vehicle {
	/***
	 * Creacion de las variables globales
	 */
	protected String marca;
	protected String color;
	protected String matricula;

	/**
	 * @param marca
	 * @param color
	 * @param matricula
	 */
	public Vehicle(String marca, String color, String matricula) {
		super();
		this.marca = marca;
		this.color = color;
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// creacion del metodo abstracto para las clases hijas
	public abstract String controlarMatricula(String matricula);
}

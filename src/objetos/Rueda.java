package objetos;

public class Rueda extends Coche {
	/***
	 * Creacion de las variables
	 */
	protected String marca;
	protected double diametro;

	/**
	 * Constructor por defecto
	 */
	public Rueda() {
		super();
	}

	/**
	 * @param marca
	 * @param diametro
	 */
	public Rueda(String marca, double diametro) {
		super();
		this.marca = marca;
		this.diametro = diametro;
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
	 * @return the diametro
	 */
	public double getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

}

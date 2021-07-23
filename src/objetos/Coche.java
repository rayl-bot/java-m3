package objetos;

public class Coche {
	/***
	 * Creacion de las variables del coche
	 */
	protected String marca;
	protected String color;
	protected String matricula;
	protected Rueda delanteras;
	protected Rueda traseras;

	/**
	 * Cosntructor por defecto
	 */
	public Coche() {
	}

	/**
	 * Cosntructor con dos variables por defecto
	 * 
	 * @param matricula
	 */
	public Coche(String matricula) {
		this.matricula = matricula;
		this.color = "Blanco";
		this.marca = "Seat";
	}

	/**
	 * @param marca
	 * @param color
	 * @param matricula
	 */
	public Coche(String marca, String color, String matricula) {
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
	
	public String controlarMatricula(String matricula) {
		
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
	        System.out.println("Matrícula válida");
	        return matricula;

	    }else{

	        System.out.println("Matrícula inválida, se va a añadir una matricula por defecto.");
	        return "Seat";
	    }      
	}
	

}

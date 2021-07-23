package herency;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected String dateNaciemiento;
	protected String licencia;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dateNaciemiento
	 * @param licencia
	 */
	public Persona(String nombre, String apellidos, String dateNaciemiento, String licencia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dateNaciemiento = dateNaciemiento;
		this.licencia = licencia;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dateNaciemiento
	 */
	public String getDateNaciemiento() {
		return dateNaciemiento;
	}

	/**
	 * @param dateNaciemiento the dateNaciemiento to set
	 */
	public void setDateNaciemiento(String dateNaciemiento) {
		this.dateNaciemiento = dateNaciemiento;
	}

	/**
	 * @return the licencia
	 */
	public String getLicencia() {
		return licencia;
	}

	/**
	 * @param licencia the licencia to set
	 */
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

}

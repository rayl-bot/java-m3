package objetos;

import herency.Persona;

public class Conductor extends Persona {
	protected String ID;
	protected String tipoLicencia;
	protected String nombreCompleto;
	protected String dateCaducidad;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dateNaciemiento
	 * @param licencia
	 * @param iD
	 * @param tipoLicencia
	 * @param nombreCompleto
	 * @param dateCaducidad
	 */
	public Conductor(String nombre, String apellidos, String dateNaciemiento, String licencia, String iD,
			String tipoLicencia, String nombreCompleto, String dateCaducidad) {
		super(nombre, apellidos, dateNaciemiento, licencia);
		ID = iD;
		this.tipoLicencia = tipoLicencia;
		this.nombreCompleto = nombreCompleto;
		this.dateCaducidad = dateCaducidad;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the tipoLicencia
	 */
	public String getTipoLicencia() {
		return tipoLicencia;
	}

	/**
	 * @param tipoLicencia the tipoLicencia to set
	 */
	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * @return the dateCaducidad
	 */
	public String getDateCaducidad() {
		return dateCaducidad;
	}

	/**
	 * @param dateCaducidad the dateCaducidad to set
	 */
	public void setDateCaducidad(String dateCaducidad) {
		this.dateCaducidad = dateCaducidad;
	}

}

package objetos;

import herency.Persona;

public class Titular extends Persona {
	protected String ID;
	protected String tipoLicencia;
	protected String nombreCompleto;
	protected String dateCaducidad;
	protected boolean seguro;
	protected boolean garaje;

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
	public Titular(String nombre, String apellidos, String dateNaciemiento, String licencia, String iD,
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

	/**
	 * @return the seguro
	 */
	public boolean isSeguro() {
		return seguro;
	}

	/**
	 * @return the garaje
	 */
	public boolean isGaraje() {
		return garaje;
	}

	
	public void garajeTrue() {
		this.garaje = true;
	}
	
	public void garajeFalse() {
		this.garaje = false;
	}
	
	public void seguroTrue() {
		this.seguro = true;
	}
	
	public void seguroFalse() {
		this.seguro = false;
	}

}

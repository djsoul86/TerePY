package caia;

import java.util.Date;

import py.gov.aduana.webservices.Autenticacion;

public class DatosTicketDTO {
	private Autenticacion autenticacion = new Autenticacion();
	private Date fechaInicio;
	private Date fechaFin;

	public Autenticacion getAutenticacion() {
		return autenticacion;
	}

	public void setAutenticacion(Autenticacion autenticacion) {
		this.autenticacion = autenticacion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
}

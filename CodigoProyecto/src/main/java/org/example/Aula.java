package org.example;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Aula.java
//  @ Date : 03/05/2022
//  @ Author : 
//
//


import java.util.ArrayList;
import java.util.HashMap;

public class Aula implements IAula {
	private String nombreCentro;
	private String idInterno;
	private Integer aforo;
	private Integer tipoAula;
	private GUI_Subscripcion guiSubscripcion;
	/*public PDI PDI;

	public CAula c_Aula;
	public PAS PAS;
	public Elemento elemento;
	public void monitorizarSensores() {
	
	}*/


	public Aula() {
		guiSubscripcion=new GUI_Subscripcion(this);
	}
	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getIdInterno() {
		return idInterno;
	}

	public void setIdInterno(String idInterno) {
		this.idInterno = idInterno;
	}

	public Integer getAforo() {
		return aforo;
	}

	public void setAforo(Integer aforo) {
		this.aforo = aforo;
	}

	public Integer getTipoAula() {
		return tipoAula;
	}

	public void setTipoAula(Integer tipoAula) {
		this.tipoAula = tipoAula;
	}


	@Override
	public void Aula(String nombreCentro, String idInterno, Integer aforo, Integer tipoAula){
			this.nombreCentro = nombreCentro;
			this.idInterno = idInterno;
			this.aforo = aforo;
			this.tipoAula = tipoAula;
		}


	@Override
	public void destroy() {
	
	}
}

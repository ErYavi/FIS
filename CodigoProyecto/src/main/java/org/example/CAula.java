package org.example;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : CAula.java
//  @ Date : 03/05/2022
//  @ Author : 
//
//




public class CAula implements ICAula {
	public Aula Aula;
	private GUI_CAula guiCAula;


	public CAula(){
		guiCAula = new GUI_CAula(this);}



	public void CAula(String nombreCentro, String idInterno, Integer aforo, Integer tipoAula) {
	
	}
	
	public void destroy() {
	
	}
	
	public void obtener() {
	
	}

	public GUI_CAula getGUI() {
		return guiCAula;
	}
}

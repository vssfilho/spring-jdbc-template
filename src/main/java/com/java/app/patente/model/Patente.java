package com.java.app.patente.model;

import java.util.Date;

public class Patente {

	private Integer id;
	private String nuPub;
	private String nuPedidoInternacional;
	private Date dtPublicacao;
	
	public Patente() {
		
	}
	
	public Patente(Integer id, String nuPub, String nuPedidoInternacional, Date dtPublicacao) {
		this.id = id;
		this.nuPub = nuPub;
		this.nuPedidoInternacional = nuPedidoInternacional;
		this.dtPublicacao = dtPublicacao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}
	
	public String getNuPub() {
		return nuPub;
	}
	
	public void setNuPub(String nuPub) {
		this.nuPub = nuPub;
	}
	
	public String getNuPedidoInternacional() {
		return nuPedidoInternacional;
	}
	
	public void setNuPedidoInternacional(String nuPedidoInternacional) {
		this.nuPedidoInternacional = nuPedidoInternacional;
	}
	
	public Date getDtPublicacao() {
		return dtPublicacao;
	}
	
	public void setDtPublicacao(Date dtPublicacao) {
		this.dtPublicacao = dtPublicacao;
	}

	@Override
	public String toString() {
		return "Patente {id=" + id + ", nuPub=" + nuPub + ", nuPedidoInternacional=" + nuPedidoInternacional
				+ ", dtPublicacao=" + dtPublicacao + "}";
	}
	
}

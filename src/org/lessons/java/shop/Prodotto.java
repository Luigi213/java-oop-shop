package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	Random rdm = new Random();
	private int codice = rdm.nextInt(100);
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto(String nome, String descrizione, double prezzo, double iva){
		setNam(nome);
		setDes(descrizione);
		setPr(prezzo);
		setIva(iva);
	}
	public int getCod() {
		return codice;
	}
	public String getNam() {
		return nome;
	}
	public void setNam(String nome) {
		this.nome = nome;
	}
	public String getDes() {
		return descrizione;
	}
	public void setDes(String descrizione) {
		this.descrizione = descrizione;
	} 
	public double getPr() {
		return prezzo;
	}
	public void setPr(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public String padL() {
		return String.format("%8s", codice).replace(' ', '0');
	}
	@Override
	public String toString() {
		return "codice: " + codice 
				+ " nome: " + nome 
				+ " descrizione: " + descrizione 
				+ " prezzo: " + prezzo 
				+ " iva: " + iva;
	}
}

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto(String nome, String descrizione, double prezzo, double iva){
		Random rdm = new Random();
		codice = rdm.nextInt(100);
		setNam(nome);
		setDes(descrizione);
		setPr(prezzo);
		setIva(iva);
	}
	public int getCod() {
		return codice;
	}
	public String getPad() {		
		String str = "" + codice;
		for(int i =0; i<9-str.length(); i++) {
			str = "0" + str;

		}
		return str;
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
	public double getIvaPr() {
		return getPr() * ( 1 + getIva() / 100f);
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
		return "codice: " + getCod() 
				+ " nome: " + getNam() 
				+ " nomepad: " + getPad()
				+ " descrizione: " + getDes() 
				+ " prezzo: " + getPr() 
				+ " iva: " + getIva()
				+ " iva plus: " + getIvaPr();
	}
}

package org.lessons.java.shop;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva){
		setCod(codice);
		setNam(nome);
		setDes(descrizione);
		setPr(prezzo);
		setIva(iva);
	}
	public int getCod() {
		return codice;
	}
	public void setCod(int codice) {
		this.codice = codice; 
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
		return String.format("%10s", codice).replace(' ', '0');
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

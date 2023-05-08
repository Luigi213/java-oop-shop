package org.java.conto;

public class Conto {
	private int conto = 88;
	private String nome;
	private double saldo;
	
	public Conto(String nome) {
		setNome(nome);
	}
	public int getConto() {
		return conto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return "conto: " + conto 
				+ " nome: " + nome
				+ " saldo " + saldo;
	}
}

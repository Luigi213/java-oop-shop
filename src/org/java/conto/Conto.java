package org.java.conto;

import java.util.Random;
import java.util.Scanner;

public class Conto {
	private String conto;
	private String nome;
	private double saldo;
	
	public Conto(String nome) {
		Random rdm = new Random();
		conto = "" + rdm.nextInt(1, 1001);
		setNome(nome);
	}
	public String getConto() {
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
	public String getFormSaldo() {
		return String.format("%.2f", getSaldo());
	}
	public void versamenti(int soldi) {
		if(soldi < 0) return;
		saldo += soldi;
	}
	public boolean prelievo(int soldi) {
		if(soldi < 0) return false;
		if(soldi <= saldo) {
			saldo -= soldi;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "conto: " + getConto()
				+ " nome: " + getNome()
				+ " saldo: " + getSaldo();
	}
}

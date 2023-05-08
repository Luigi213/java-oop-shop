package org.java.conto;

import java.util.Random;
import java.util.Scanner;

public class Conto {
	private int conto;
	private String nome;
	private double saldo;
	
	public Conto(String nome, String type) {
		Random rdm = new Random();
		conto = rdm.nextInt(1000);
		setNome(nome);
		if(type.equals("versamento")) {
			saldo = saldo + versamenti();
		} else if( type.equals("prelievo")) {
			saldo = prelievo();
		}else {
			System.out.println("Non hai scelto niente");;
		}
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
	public int versamenti() {
		Scanner in = new Scanner(System.in);
		System.out.println("Quanto vuoi versare?");
		int soldi = in.nextInt();
		in.close();
		return soldi;
	}
	public int prelievo() {
		Scanner in = new Scanner(System.in);
		System.out.println("Quanto vuoi prelevare?");
		int soldi = in.nextInt();
		if(soldi > saldo) {
			in.close();
			return soldi;
		}
		in.close();
		return soldi;
	}
	@Override
	public String toString() {
		return "conto: " + getConto()
				+ " nome: " + getNome()
				+ " saldo: " + getSaldo();
	}
}

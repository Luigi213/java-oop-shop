package org.java.conto;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Che metodo vuoi usare?");
		String answer = in.nextLine();
		if(answer.equals("versamento")) {
			Conto c = new Conto("Michele", "versamento");
			System.out.println(c);
		} else if(answer.equals("prelievo")) {
			Conto c = new Conto("Michele", "prelievo");
			System.out.println(c);
		} else {
			System.out.println("Nessun metodo scelto");
		}
	
		in.close();
		
	}
}

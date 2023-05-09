package org.java.conto;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String name = in.nextLine();
		
		Conto conto = new Conto(name);
		
		
		while(true) {
			System.out.println("Che metodo vuoi usare?");
			System.out.println("1 - Versamento");
			System.out.println("2 - Prelievo");
			System.out.println("3 - Uscire");
			
			int sc = in.nextInt();
			
			if(sc < 1 && sc > 3) {
				continue;
			}
			
			switch (sc) {
				case 1: {				
					System.out.println("Quanto vuoi versare?");
					int soldi = in.nextInt();
					conto.versamenti(soldi);
				}
				break;
				case 2: {
					System.out.println("Quanto vuoi prelevare?");
					int soldi = in.nextInt();
					boolean sal = conto.prelievo(soldi);
					System.out.println(sal ? "Prelevati" : "Non hai abbastanza soldi");
				}
				break;
				default:
					System.out.println("Arrivederci");
					return;										
			}
		}		
	}
}

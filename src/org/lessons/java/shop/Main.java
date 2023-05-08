package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		Prodotto p = new Prodotto("Pizza", "Margherita", 18, 10);
		
		System.out.println("codice: " + p.getCod());
		System.out.println("codice: " + p.padL());
		System.out.println("nome: " + p.getNam());
		System.out.println("descrizione: " + p.getDes());
		System.out.println("prezzo: " + p.getPr());
		System.out.println("iva: " + p.getIva() + "%");
		System.out.println(p.toString());
	}
}

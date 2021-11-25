package it.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto();
		prodotto1.setNome("Iphone");
		prodotto1.setDescrizione("di modello 13 da 256GB");
		prodotto1.setPrezzo(999.0);
		prodotto1.setIva(0.22);
		System.out.println("Il prodotto è un: " + prodotto1.getNome() + " " + prodotto1.getDescrizione() + "\nil prezzo è di: " + prodotto1.getPrezzo() + " € senza Iva " + "\ncon iva inclusa invece il prezzo è pari a: " + prodotto1.prezzoConIva() + " €");
		/* prova per verifica validazioni
		prodotto1.setNome(null);
		prodotto1.setDescrizione("");
		prodotto1.setPrezzo(0);
		prodotto1.setIva(0.24);
		System.out.println(prodotto1.getNome() + " " + prodotto1.getDescrizione() + " " + prodotto1.getPrezzo() + " " + prodotto1.prezzoConIva() + " " + prodotto1.getIva()); */
}
	}
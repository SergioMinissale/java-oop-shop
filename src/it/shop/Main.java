package it.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotto1 = new Prodotto();
		prodotto1.setNome("Telefono");
		prodotto1.setDescrizione("di marca Apple, modello Iphone 13 da 256GB");
		prodotto1.setPrezzo(999.0);
		prodotto1.setIva(0.22);
		System.out.println("Il prodotto con ID " + prodotto1.getCodice() + "\nnome esteso: " + prodotto1.nomeEsteso()
				+ "\nè un " + prodotto1.getNome() + " " + prodotto1.getDescrizione() + "\nIl prezzo è di: "
				+ prodotto1.getPrezzo() + " € senza Iva " + "\nCon iva inclusa invece il prezzo è pari a: "
				+ prodotto1.prezzoConIva() + " €");
		/*
		 * prova per verifica validazioni prodotto1.setNome(null);
		 * prodotto1.setDescrizione(""); prodotto1.setPrezzo(0); prodotto1.setIva(0.24);
		 * System.out.println(prodotto1.getNome() + " " + prodotto1.getDescrizione() +
		 * " " + prodotto1.getPrezzo() + " " + prodotto1.prezzoConIva() + " " +
		 * prodotto1.getIva());
		 */
	}
}
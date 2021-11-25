package it.shop;
import java.util.Random;

public class Prodotto {
	
	// attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	// costruttore
	public Prodotto() {
		this.codice = generaCodice();
		this.prezzo = prezzo();
		this.iva = prezzoConIva();
	}
	
	// gettere e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nomeNonValido(nome)) {
			System.out.println("Il nome non è valido");
		} else {
			// errore
			this.nome = nome;
		}
		
		
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if(prezzoValido(prezzo)) {
			this.prezzo = prezzo;
		} else {
			// errore
			System.out.println("Il prezzo inserito non è valido");
		}
		
		
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		if(ivaValida(iva)) {
			this.iva = iva;
		} else {
			// errore
			System.out.println("Iva inserita non valida");
		}
		
		
	}

	public int getCodice() {
		return codice;
	}

	// metodo che genera codice casuale
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(); 
	}
	
	// metodo per il prezzo del prodotto
	public double prezzo() {
		return prezzo;
	}

	// metodo per il prezzo con iva
	public double prezzoConIva() {
		double prezzoConIva = prezzo * iva;
		return prezzoConIva; // avrei potuto scrivere direttamente ---> return prezzo*iva;
	}
	
	// metodo nome esteso, nome prodotto + codice
	public String nomeEsteso() {
	return nome + codice;
	}
	
	// metodo per validare nome
	private boolean nomeNonValido(String nome) {
		return nome == null || nome.length() == 0;
	}
	
	// metodo per validare prezzo
	private boolean prezzoValido(double prezzo) {
		return prezzo > 0;
	}
	
	// metodo per validare iva
	private boolean ivaValida(double iva) {
		return iva == 0.22 && iva == 0.004;
	}
}

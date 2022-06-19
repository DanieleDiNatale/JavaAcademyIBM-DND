package ESERCIZIO2;

//estenzione classe

public class Lavoratore extends Persona {
	
	//attributi: mansione e stipendio
	
	protected String mansione;
	protected double stipendio;
	
	//costruttore parametrizzato
	
	public Lavoratore(String nome, String cognome, String anno_nascita, String luogo_nascita,
			String indirizzo_residenza, String email, String numb_telefono, String mansione, double stipendio) {
		super(nome, cognome, anno_nascita, luogo_nascita, indirizzo_residenza, email, numb_telefono);
		this.mansione = mansione;
		this.stipendio = stipendio;
	}
	
	//metodi getter e setter
	

	public String getMansione() {
		return mansione;
	}

	public void setMansione(String mansione) {
		this.mansione = mansione;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	//Ridefinisco il metodo stampaDati stampando tutti i dati del lavoratore tramite il metodo toString 
	@Override
	public String toString() {
		return "Lavoratore [mansione=" + mansione + ", stipendio=" + stipendio + ", nome=" + nome + ", cognome="
				+ cognome + ", anno_nascita=" + anno_nascita + ", luogo_nascita=" + luogo_nascita
				+ ", indirizzo_residenza=" + indirizzo_residenza + ", email=" + email + ", numb_telefono="
				+ numb_telefono + "]";
	}

	@Override
	public void stampaDati(String nome, String cognome, String anno_nascita, String luogo_nascita,
			String indirizzo_residenza, String email, String numb_telefono) {
		// TODO Auto-generated method stub
		
	}

	

}

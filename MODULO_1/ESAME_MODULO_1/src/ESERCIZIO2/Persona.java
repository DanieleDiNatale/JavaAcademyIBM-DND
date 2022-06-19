package ESERCIZIO2;

public abstract class Persona {
	
	//attributi: nome, cognome, anno di nascita, luogo di nascita, indirizzo di residenza, email, telefono

	protected String nome;
	protected String cognome;
	protected String anno_nascita;
	protected String luogo_nascita;
	protected String indirizzo_residenza;
	protected String email;
	protected String numb_telefono;
	
	//Costruttore Parametrizzato 
	public Persona(String nome, String cognome, String anno_nascita, String luogo_nascita, String indirizzo_residenza,
			String email, String numb_telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.anno_nascita = anno_nascita;
		this.luogo_nascita = luogo_nascita;
		this.indirizzo_residenza = indirizzo_residenza;
		this.email = email;
		this.numb_telefono = numb_telefono;
	}
	
	
	//Metodi getter e setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getAnno_nascita() {
		return anno_nascita;
	}

	public void setAnno_nascita(String anno_nascita) {
		this.anno_nascita = anno_nascita;
	}

	public String getLuogo_nascita() {
		return luogo_nascita;
	}

	public void setLuogo_nascita(String luogo_nascita) {
		this.luogo_nascita = luogo_nascita;
	}

	public String getIndirizzo_residenza() {
		return indirizzo_residenza;
	}

	public void setIndirizzo_residenza(String indirizzo_residenza) {
		this.indirizzo_residenza = indirizzo_residenza;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumb_telefono() {
		return numb_telefono;
	}

	public void setNumb_telefono(String numb_telefono) {
		this.numb_telefono = numb_telefono;
	}

	public void stampaDati(String nome, String cognome, String anno_nascita, String luogo_nascita, String indirizzo_residenza,
			String email, String numb_telefono) {
	}
	
	
	
}

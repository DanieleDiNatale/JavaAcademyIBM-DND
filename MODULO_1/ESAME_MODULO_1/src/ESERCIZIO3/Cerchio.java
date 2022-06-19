package ESERCIZIO3;

public  class Cerchio implements Poligono {
	
	public double raggio;

	//Get&Set
	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	//Costruttore
	
	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}
	
	//DICHIRAZIONE METODO
	public double geTarea() 
	{
	return (raggio * raggio * Math.PI);
	}

}

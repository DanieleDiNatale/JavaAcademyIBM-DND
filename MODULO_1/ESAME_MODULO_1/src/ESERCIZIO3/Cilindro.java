package ESERCIZIO3;

public class Cilindro extends Cerchio{
	

	public double altezza;

	
	public Cilindro(double raggio) {
		super(raggio);
	}
	
	
	//Get & Set
	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	

	//Costruttore
	public Cilindro(double raggio, double altezza) {
		super(raggio);
		this.altezza = altezza;
	}
	
	
	public double GetVolume()
	 {
	 return (geTarea() * 4.0 * raggio) / 3.0;
	 }

	

}

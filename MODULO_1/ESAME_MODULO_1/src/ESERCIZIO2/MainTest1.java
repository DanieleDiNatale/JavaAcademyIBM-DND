package ESERCIZIO2;

public  class MainTest1 {

	public static void main(String[] args) {
	
		Lavoratore dato = new Lavoratore("Marco","Di_Natale","26/05/2000","Via delle rose n26","danieledinatale4567@gmail.com","+39 3519103355","Operatore CCNL LV.3",null, 20.0);
		
	  System.out.println(dato.stampaDati());
		
	}
	
	//Metodo per la stampa dei dati
	public static void stampaDati(Persona a,Lavoratore b) {
		
		try 
		{
			System.out.println("Dati Lavoratore:"+a.toString()+b);
		}
		catch(Exception e) 
		{
		   System.out.println("Attenzione alcuni valori non sono corretti controla tutti i valori"+e);
		}
		
		
		
	}



}

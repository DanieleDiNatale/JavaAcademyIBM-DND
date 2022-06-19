package Esercizio1;

public class TrovaM {

	public static void main(String[] args) {
		
		int[]arr= {547, 87, 1, 24, 4, 9, 54, 37, 26, 19};
		int min = arr[0];
		int i;
		
		//Trovo il valore minimo del array 
		
		for ( i = 1; i < arr.length; i++) {
			
			if ( arr[i] < min )
				
				min = arr[i] ;
		}
		
		//Stampo a video 
		
		System.out.println("Il minimo e' " + min);

		
	}

}

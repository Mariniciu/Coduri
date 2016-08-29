/**
 * 
 */
package randomarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Radu
 *
 */
public class RandomArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*ArrayList<Integer>listarray = new ArrayList <Integer>();
				
				
				int i=0;
		while (i<6) {
			listarray.add((int)(1 +(Math.random()*(49-1))));
			i++;
		}

				System.out.println( "ArrayList: " + listarray);*/
		
		
		
		ArrayList<Integer> valori = new ArrayList<Integer>();
		 
		// populare
		for (int i = 0; i < 20; i++) {
		   valori.add( (int)(Math.random()*50+1)  );   
		}
		 
		System.out.println(valori);
		 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduceti un numar intre 1 si 50:");
		int nrCautat = keyboard.nextInt();
		 
		/*// cautare valori
		for (int i = 0; i<valori.size(); i++) {
		   if (valori.get(i) == nrCautat) {
		      System.out.println("Numarul a fost gasit");
		      
		      */
// search alternativ
		      
		      for (Integer integer : valori) {
		    	  if (integer == nrCautat){
		      }
		    	  System.out.println("Numarul a fost gasit");
		      keyboard.close();
	

}
	}
}
/**
 * 
 */
package esercizio_2;

/**
 * @author Chiara
 *
 */
public class ProvaDipendente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dipendente dip1 = new Dipendente("001", 1000, 30);
        dip1.stampa();
        //System.out.println(dip1.toString());
        System.out.println("Questo mese la sua paga sara':" +dip1.paga(30) +" euro");

	}

}

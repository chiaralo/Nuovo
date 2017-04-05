/**
 * 
 */
package esercizio_2;

/**
 * @author Chiara
 *
 */
public class Dipendente_A extends Dipendente {
	
	int malattia = 0;
	
	
	public Dipendente_A(String mat, double s, double st, int mal){
		super(mat, s, st);
		this.malattia = mal;
	}
	
	public int prendimalattia(int gg_mal_presi){
		
		return malattia + gg_mal_presi;
		
	}
	
	public double paga(int ore_straordinario){
		
		double p = super.paga(ore_straordinario);
		
		if ( malattia == 0 ){
		return p;
		}else {
			p = p - malattia*15;
			return p;
		}
		
		
	}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

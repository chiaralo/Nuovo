/**
 * 
 */
package esercizio_2;

/**
 * @author Chiara
 *
 */
public class Dipendente {
	
    public String matricola;
    public double stipendio;
    public double straordinario;
    
    public Dipendente(String m, double s, double st){
        
        this.matricola = m;
        this.stipendio = s;
        this.straordinario = st;
    
}

    public double getStipendio(){
        return stipendio;
    }
    
    public double paga(int ore_straordinario){
        double salario = stipendio + (ore_straordinario * straordinario);
        return salario;
    }
    
    public void stampa(){
        System.out.println("Il dipendente ha la matricola:"+matricola+","+"con stipendio:"+stipendio+" e straordinario:"+straordinario);
    }
    
      public String toString() {
        String stampa = "Dipendente con matricola:" + this.matricola + ", stipendio base:"+this.stipendio+" e straordinario:"+this.straordinario;
        return stampa;
    }
    


}

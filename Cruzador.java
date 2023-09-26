
package matheus_oliveira_gustavo_estlin;

public class Cruzador extends Naviodeguerra{
    public int num_canhoes;
    
    public Cruzador(int tripulantes, String nome, double blindagem, double ataque, int num_canhoes){
        super(tripulantes, nome, blindagem, ataque);
        this.num_canhoes = num_canhoes;
        
    }

    public int getNum_canhoes() {
        return num_canhoes;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }
    
    @Override
    public void poderDeFogo(){
        double formula;
        
       // Math.sqrt(this.getNum_canhoes());
        formula = (this.getAtaque() * Math.sqrt(this.getNum_canhoes()) );
        System.out.println("\nFormula: "+formula);
    }
    
}

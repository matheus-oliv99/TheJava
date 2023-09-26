
package matheus_oliveira_gustavo_estlin;

public class PortaAvioes extends Naviodeguerra{
    public int numAvioes;

    public PortaAvioes(int tripulantes, String nome, double blindagem, double ataque, int numAvioes) {
        super(tripulantes, nome, blindagem, ataque);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }
    
    
    @Override
    public void poderDeFogo(){
        double resultado; 
        resultado = this.getAtaque()* (this.getNumAvioes()*this.getNumAvioes());
        System.out.println("\nRESULTADO: "+resultado);
    }
    
}


package matheus_oliveira_gustavo_estlin;

public class Naviodeguerra extends Navio{
    public double blindagem;
    public double ataque;

    public Naviodeguerra(int tripulantes, String nome, double blindagem, double ataque){
        super(tripulantes, nome);
        this.ataque = ataque;
        this.blindagem = blindagem;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public String getNome() {
        return nome;
    }
    
    public void poderDeFogo(){
        System.out.println("\nInformações ataque navio de guerra: ");
        System.out.println("Ataque: "+this.getAtaque());
    }
    public void exibirArmas(){
        this.poderDeFogo();
        this.exibirInfo();
        System.out.println("\nBlindagem: "+this.getBlindagem());
    }
    
    
}

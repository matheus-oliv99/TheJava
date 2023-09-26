
package matheus_oliveira_gustavo_estlin;

public class Navio {
    public int tripulantes;
    public String nome;

    public Navio(int tripulantes, String nome) {
        this.tripulantes = tripulantes;
        this.nome = nome;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public String getNome() {
        return nome;
    }
    
    
    public void exibirInfo(){
        System.out.println("Navio informações:");
        System.out.println("\nTripulantes: "+this.tripulantes);
        System.out.println("\nNome: "+this.nome);
        
    }
}


package matheus_oliveira_gustavo_estlin;

public class NavioMercante extends Navio{
    public double capacidadeCarga;
    public double carga;

    public NavioMercante(int tripulantes, double capacidadeCarga, double carga, String nome) {
        super(tripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public int getTripulantes() {
        return tripulantes;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void CargaTotal(){
        double volume;
        
        volume = (this.getCarga()/this.getCapacidadeCarga());
        
        System.out.println("\nVolume navio mercante: "+volume);
    }
    
}

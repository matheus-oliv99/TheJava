/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus_oliveira_gustavo_estlin;

public class Matheus_Oliveira_Gustavo_Estlin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      NavioMercante objMercante = new NavioMercante(5, 20, 50, "Fragata"); 
      Naviodeguerra objGuerra = new Naviodeguerra(40, "Barba negra", 1000, 200);
      Cruzador objCruzador = new Cruzador(50, "Cruza cruza", 500, 100, 20);
      PortaAvioes objAvioes = new PortaAvioes(110, "Varig", 1000, 100, 16);
      
      objMercante.exibirInfo();
      objMercante.CargaTotal();
      
      objGuerra.exibirInfo();
      objGuerra.exibirArmas();
      
      objCruzador.poderDeFogo();
      
      objAvioes.poderDeFogo();
      
    }
    
}

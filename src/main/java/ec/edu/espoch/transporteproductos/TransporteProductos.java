/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.transporteproductos;

import ec.edu.espoch.transporteproductos.clases.Avion;
import ec.edu.espoch.transporteproductos.clases.Carro;
import ec.edu.espoch.transporteproductos.clases.Moto;
import ec.edu.espoch.transporteproductos.clases.Vehiculos;

/**
 *
 * @author SO-LAB1-PC28
 */
public class TransporteProductos {

    public static void main(String[] args) {
        
     
        Vehiculos carro = new Carro();
        Vehiculos moto = new Moto();
        Vehiculos avion = new Avion();

        // Uso del polimorfismo estático (sobrecarga)
        System.out.println("Cálculo de distancia para un carro:");
        System.out.println("Distancia (solo velocidad): " + carro.calcularDistancia(100));
        System.out.println("Distancia (velocidad y tiempo): " + carro.calcularDistancia(100, 2));
        System.out.println("Distancia (con eficiencia): " + carro.calcularDistancia(100, 2, 0.8));
       
        // Uso del polimorfismo dinámico (sobrescritura)
        System.out.println("\nMétodos polimórficos dinámicos:");
        Vehiculos[] vehiculos = {carro, moto, avion};
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].transportar(); // Resuelto dinámicamente en tiempo de ejecución
        }
    }
}

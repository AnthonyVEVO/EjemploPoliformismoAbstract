/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transporteproductos.clases;

/**
 *
 * @author SO-LAB1-PC28
 */
public abstract class Vehiculos {
    
    public abstract String transportar();
    
    public double calcularDistancia(double velocidad){
    return velocidad*1;
    }
    public double calcularDistancia(double velocidad , double tiempo){
    return velocidad * tiempo;
    }
    public double calcularDistancia(double velocidad, double tiempo, double c ){
    return velocidad*tiempo*c;
    }
    
}

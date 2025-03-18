/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario-1
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    private double gasolina;
    
    
    //CONSTRUCTOR POR DEFAULT
    public Automovil(){
        gasolina=0;
    }
    
    //GETTERS Y SETTERS o MUTADORES
    public double getGasolina(){
        return this.gasolina;
    }
    
    public void setGasolina(double gasolina) throws Exception{
        //REGLA DE NEGOCIO
        if (gasolina>=0 && gasolina<=100) {
            this.gasolina = gasolina;
        }
        else
        {
            throw new Exception("La gasolina debe estar entre 0 y 100");
        }
    }
    
    public String verDetalles()
    {
        return "Estanque:"+ gasolina;
    }
}

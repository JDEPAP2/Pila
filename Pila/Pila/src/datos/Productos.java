/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author jose.escobar
 */
public class Productos extends Base{
    
    private String nombre;
    private int cantidad;
    private double valor;

    public Productos() {
    }

    public Productos(String nombre, int cantidad, double valor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }
    
    
    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Base copy(){
        return new Productos(nombre, cantidad, valor);
    }

    @Override
    public String toString() {
        return "Productos(" + "nombre: " + nombre + ", cantidad: " + cantidad + ", valor: " + valor + ')';
    }
    
    
}

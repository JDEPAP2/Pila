/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.Pila;
import static modelo.OperacionesPila.pilaDuplicada;
/**
 *
 * @author jose.escobar
 */
public class MainPila {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Productos> losProductos = new Pila<>();
        losProductos.apilar(new Productos("espinaca", 5, 3000));
        losProductos.apilar(new Productos("ahuyama", 2, 2000));
        losProductos.apilar(new Productos("manzana", 1, 15000));
        losProductos.apilar(new Productos("pistachos", 50, 5500));
        losProductos.apilar(new Productos("esparragos", 10, 8000));
        
        Productos elementoEliminado = losProductos.desapilar();
        System.out.println("\nElemento eliminado: "+ elementoEliminado +"\n");
                
        Pila<Productos> pilaDuplicada = pilaDuplicada(losProductos);
        System.out.println("Pila: " + losProductos.toString() + "\n\nPila Duplicada: " + pilaDuplicada.toString());

    }
    
}

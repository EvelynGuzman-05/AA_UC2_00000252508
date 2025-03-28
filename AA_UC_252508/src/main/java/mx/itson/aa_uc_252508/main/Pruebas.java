/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc_252508.main;

import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.burbuja;
import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.insercion;

/**
 *
 * @author Evelyn Guzman
 */
public class Pruebas {
    
    public static void main(String[] args) {
        int[] a = {5, 3, 8, 1}; // Arreglo original
        
        // Llamar al método burbuja
        int[] copiaBurbuja = a.clone(); // Crea una clonación del arreglo original
        System.out.print("Arreglo ordenado (Método burbuja): ");
        System.out.println(java.util.Arrays.toString(burbuja(copiaBurbuja))); 

        // Llamar al método inserción
        int[] copiaInsercion = a.clone(); // Crea una clonación del arreglo original
        System.out.print("Arreglo ordenado (Método inserción): ");
        System.out.println(java.util.Arrays.toString(insercion(copiaInsercion))); 
        
        
    }
}

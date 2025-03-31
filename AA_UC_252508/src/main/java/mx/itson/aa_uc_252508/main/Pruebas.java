/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc_252508.main;

import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.burbuja;
import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.insercion;
import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.seleccion;
import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.quicksort;

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
        
        // Llamar al método selección
        int[] copiaSeleccion= a.clone(); // Crea una clonación del arreglo original
        System.out.print("Arreglo ordenado (Método Selección): ");
        System.out.println(java.util.Arrays.toString(seleccion(copiaSeleccion))); 
        
         // Llamar al método selección
        int[] copiaQuick= a.clone(); // Crea una clonación del arreglo original
        System.out.print("Arreglo ordenado (Método QuickSort): ");
        System.out.println(java.util.Arrays.toString(quicksort(copiaQuick, 0, copiaQuick.length - 1)));
        
    }
}

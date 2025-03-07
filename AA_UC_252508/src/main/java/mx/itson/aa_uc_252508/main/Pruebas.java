/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aa_uc_252508.main;

import static mx.itson.aa_uc_252508.algoritmos.Ordenamientos.burbuja;

/**
 *
 * @author Evelyn Guzman
 */
public class Pruebas {
    
    public static void main(String[] args) {
        int[] arreglo = {5, 3, 8, 1}; // Arreglo 
        int[] resultado = burbuja(arreglo); // Llamar al método
        System.out.print("Arreglo ordenado(Método burbuja): ");
        System.out.println(java.util.Arrays.toString(resultado));
    }
}

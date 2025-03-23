/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc_252508.algoritmos;

/**
 *
 * @author Evelyn Guzman
 */
public class Ordenamientos {
//
    /**
     * Método para el ordenamiento de burbuja
     * @param a Arreglo de enteros
     * @return un arreglo ordenado
     */
    public static int[] burbuja(int[] a){
        
        // Ciclo externo para las pasadas
        for (int i = 1; i < a.length; i++) { // 1 + n + n --> 2n + 1
             // Comparación entre elementos adyacentes
            for (int j = 0; j < a.length -i; j++) { //n + (n x n) + (n x n) --> 2n²+ n
                //Comparación
                        if (a[j]>a[j+1]) { // n 
                           // Intercambio simple
                            int aux = a[j]; // 1 
                            a[j] = a[j+1]; // n
                            a[j+1] = aux; // n
                }
            }
        }
        return a; // 1
    } // 2n² + 6n + 3 ----> O(n²)
    
    
    /**
     * Método para el ordenamiento de inserción
     * @param a Arreglo de enteros
     */
    public static int[] insercion(int[] a){
        
        for(int i=1;i<a.length;i++){ // 1 + n + n --> 2n + 1
            int key = a[i]; // n
            int j = i-1; // n 
            while (a[j]>key){ // n²
                a[j+1] = a[j]; // n²
                j--; // n²
            }
            a[j+1] = key; // n
        }
        return a; // 1
        
    } // 3n² + 5n + 2 ----> O(n²)
    
    
    
    
    
    
    
    
   
    
    
    
    
    

}

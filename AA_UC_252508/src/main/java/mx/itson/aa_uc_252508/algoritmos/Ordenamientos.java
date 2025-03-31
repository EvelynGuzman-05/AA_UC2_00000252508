/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.aa_uc_252508.algoritmos;

/**
 *
 * @author Evelyn Guzman
 */
public class Ordenamientos {

    
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
           
            while (j >= 0 && a[j] > key) {  // n + n²
                a[j + 1] = a[j]; // n²
                j--; // n²
            }
            a[j+1] = key; // n
        }
        return a; // 1
        
    } // 3n² + 6n + 1 ---> O(n²)
    
    
    /**
     * Método para el ordenamiento de selección
     * @param a Arreglo de enteros
     * @return Arreglo de enteros ordenado
     */
    public static int[] seleccion(int[] a) {
    int n = a.length; // 1

    for (int i = 0; i < n - 1; i++) { // 1 + (n-1) + (n-1) --> 2n - 1
        int minIndex = i; // 1

        for (int j = i + 1; j < n; j++) { // n + n² + n²--> 2n² + n
            if (a[j] < a[minIndex]) { // n²
                minIndex = j; // n²
            }
        }

        // Intercambio de elementos
        int aux = a[minIndex]; // n
        a[minIndex] = a[i]; // n
        a[i] = aux; // n
        }
        return a; // 1
    
    } // 4n² + 6n + 2 ---> O(n²)


    
    /**
     * Método para el ordenamiento QuickSort
     * @param a Arreglo de enteros
     * @param desde Índice inicial del subarreglo a ordenar.
     * @param hasta Índice final del subarreglo a ordenar.
     */
    public static void quicksort(int[] a, int desde, int hasta) {
    if (desde < hasta) {  // 1
        int indicePivote = particionar(a, desde, hasta);  // f(n)
        quicksort(a, desde, indicePivote - 1);  // T(n-1)
        quicksort(a, indicePivote + 1, hasta);  // No entra en el peor de los caso (lista vacía)
    }
    } // 5n² + n / 2 + O(1) --> O(n²)

    private static int particionar(int[] arreglo, int desde, int hasta) {
    int pivote = arreglo[hasta]; // 1
    int i = desde - 1; // 1

    for (int j = desde; j < hasta; j++) { // 1 + (n-1) + (n-1) ---> 2n - 1
        if (arreglo[j] < pivote) { // n - 1
            i++; // n - 1
            int aux = arreglo[i]; // n - 1
            arreglo[i] = arreglo[j]; // n - 1
            arreglo[j] = aux; // n - 1
        }
    }

    int aux = arreglo[i + 1]; // 1
    arreglo[i + 1] = arreglo[hasta]; // 1
    arreglo[hasta] = aux; // 1

    return i + 1; // 1
    } // 6n + 10 --> O(n)

    
    
    
    
    
   
    
    
    
    
    

}

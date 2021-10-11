/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja1_05020;

/**
 *
 * @author EFRA
 */
public class Burbuja1_05020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {19, 7, 99, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int contador;
                    contador = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = contador;
                }
                // Si no regresa al for j
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr en la posicion " + i + " = " + arr[i]);
        }
    }
    
}

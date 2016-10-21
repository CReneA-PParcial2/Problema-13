/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg13;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*PROGRAMA QUE LEA 30 ENTEROS, LOS GUARDE EN UN ARREGLO
        CALCULE SU PROMEDIO Y MUESTRE CA CANTIDAD DE DATOS POR ENCIMA
        Y POR DEBAJO DEL PROMEDIO, ADEMAS DE LOS RESULTADOS
        */
        int [] arreglo = new int [30];
        int promedio;
        arreglo = llenarArreglo(arreglo);
        promedio = calcularPromedio(arreglo);
        mostrarResultado(arreglo, promedio);
    }
    
    public static int[] llenarArreglo(int[]a){
        Scanner entradaNumero = new Scanner(System.in);
        int i=0;
        while(i<a.length){
            System.out.println("Introduce el numero que se guardara en la ubicacion: [" + i + "]");
            a[i]= entradaNumero.nextInt();
            i++;
        }
        return a;
    }
    
    public static int calcularPromedio (int[]a){
        int maximo = 0, minimo = 0;
        for (int i=1; i<a.length; i++){
            maximo = a[i] + maximo;
        }
        maximo = (maximo/minimo);
        System.out.println("El promedio de los numeros ingresados es: " + maximo);
        return maximo;
    }
    
    public static void mostrarResultado(int[]a, int promedio){
        int calificacion1 = 0, calificacion2 = 0;
        for (int i=0; i<a.length; i++)
            if(a[i]<promedio){
                calificacion1++;
            }else{
                calificacion2++;
            }
        System.out.println("El numero de calificaciones POR ENCIMA del promedio son: " + calificacion1);
        System.out.println("El numero de calificaciones POR DEBAJO del promedio son:" + calificacion2);
    }
}

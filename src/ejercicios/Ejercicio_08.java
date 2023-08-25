package ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        int numeroCalcular;
        System.out.println("Valor mas grande de un Array");

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular : ");
        numeroCalcular =  input.nextInt();

        int[] arrayNumeros = new int[numeroCalcular];
        //llenar el array con los numero aleatorios
        for (int i = 0; i < numeroCalcular; i++){
            arrayNumeros[i] = (int)(Math.random()*100);
        }
        //imprimie el array con los numero aleatorios.
        for (int j = 0; j < numeroCalcular; j++){
            System.out.println(arrayNumeros[j]);
        }

        //buscar e imprimir el numero mayor
        int numeroMayor = 0;

        for (int j = 1; j < numeroCalcular; j++){
            if (arrayNumeros[j] >= numeroMayor ){
                numeroMayor = arrayNumeros[j];
            }
        }
        System.out.println("El numero mayor es : " + numeroMayor);
    }
}

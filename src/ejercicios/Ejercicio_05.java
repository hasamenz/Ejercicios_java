package ejercicios;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese el numero");
        numero = input.nextInt();
        int listaNumeros[] = new int[numero];

        for (int i = 0; i < numero; i++){
            listaNumeros[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < listaNumeros.length; i++){
            System.out.println("El numero en la posicion " + i +" es : "+ listaNumeros[i]);
        }

    }
}

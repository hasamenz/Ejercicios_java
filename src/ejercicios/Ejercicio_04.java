package ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        System.out.println("Numeros Impares : ");
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero : ");
        numero = input.nextInt();

        for(int n = 0; n <= numero; n++){
            if (!(n % 2 == 0)){
                System.out.println(n);
            }
        }
    }
}

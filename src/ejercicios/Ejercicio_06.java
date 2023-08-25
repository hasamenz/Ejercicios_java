package ejercicios;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la figura : ");
        numero = input.nextInt();

        for (int i = 0; i < numero; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}

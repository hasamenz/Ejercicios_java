package ejercicios;
import java.util.Scanner;
public class ChangeValueOfArray {
    public static void main(String[] args) {
        System.out.println("Invertir el array.");
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        numero = input.nextInt();

        int[] arrayNumeros = new int[numero];

        //llenar el array con numeros randon
        for (int i = 0; i < numero; i++){
            arrayNumeros[i] = (int)(Math.random() * 100);
        }
        //imprimir los datos del array
        for (int j = 0; j < numero; j++){
            System.out.println(arrayNumeros[j]);
        }
        System.out.println("*****************************************");
        //invertir el array generado
        for (int i = 0; i < arrayNumeros.length; i++){
            System.out.println(arrayNumeros[(arrayNumeros.length-1) - i]);
        }
    }
}

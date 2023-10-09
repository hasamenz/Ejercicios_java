package ejercicios.CalculateGeometricFigures;

import java.util.Scanner;

public class GetFirstNumberArray {
    public static void main(String[] args) {
        String numeroIngresado;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        numeroIngresado = input.nextLine();
        
        char elementos[];
        elementos = numeroIngresado.toCharArray();

        //El primer y ultimo elemento
        System.out.println("El numero es : " +numeroIngresado);
        System.out.println("El primer elemento del numero es :: " +elementos[0]);
        System.out.println("El ultimo elemento del numero es : " +elementos[elementos.length -1]);
    }
}

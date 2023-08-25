package ejercicios;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        System.out.println("Juego adivina el numero");
        int numeroAdividar;
        int intentos = 0;
        boolean encontrado = true;
        Scanner input = new Scanner(System.in);

        //numero aleatorio
        int numero = (int)(Math.random() * 100);
        //System.out.println(numero);

        while (encontrado){
            intentos++;
            System.out.println("Ingrese el numero a adivinar : Rango 1 - 100");
            numeroAdividar = input.nextInt();

            if (numeroAdividar <= 0 || numeroAdividar > 100){
                System.out.println("El numero debe estar en el rango de 1 - 100 | !Intente nuevamente¡");
            }else {
                System.out.println("Numero Ingresado : " +numeroAdividar);
                if (numeroAdividar == numero){
                    System.out.println("Felicitaciones, encontro el numero !!!");
                    encontrado = false;
                }else {
                    if (numeroAdividar > numero){
                        //System.out.println(numero);
                        System.out.println("El numero elegido mayor que el numero escondido");
                        System.out.println();
                    } else if (numeroAdividar < numero) {
                        //System.out.println(numero);
                        System.out.println("El numero elegido es menor que el numero escondido.");
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("Completado en " +intentos + " Intentos.");
    }
}

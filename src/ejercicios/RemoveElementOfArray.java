package ejercicios;
import java.util.Scanner;
public class RemoveElementOfArray {
    public static void main(String[] args) {
        int numeroEliminar;
        int numeros[] = new int[10];
        numeros[0] = 12;
        numeros[1] = 4;
        numeros[2] = 15;
        numeros[3] = 7;
        numeros[4] = 2;
        numeros[5] = 1;
        numeros[6] = 17;
        numeros[7] = 67;
        numeros[8] = 10;
        numeros[9] = 41;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero a eliminar : ");
        numeroEliminar = scan.nextInt();

        for (int i = 0; i < numeros.length; i++){
            if (i == numeroEliminar){
                continue;
            }
            System.out.println("Los numeros son  = " +i+ "  " +numeros[i]);
        }
    }
}

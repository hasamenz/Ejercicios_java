package ejercicios;

import java.util.Scanner;

public class FlyTodocode {
    public static void main(String[] args) {
        System.out.println("Solucion nro 6 modulo array TODOCODE");
        System.out.println("Carga de la Matriz de vuelos.");

        int vuelos[][] = new int[6][3];
        Scanner input = new Scanner(System.in);

        for (int f =  0; f < 6; f++){
            for (int c = 0; c < 3;c++){
                System.out.println("Ingrese la cantidad de asientos para el destino " + f + " asiento " +c);
                vuelos[f][c] = input.nextInt();
            }
        }
        // ingresar en numero de asiento
        Scanner input2 = new Scanner(System.in);
        String mensaje = "";
        int destino,horario,cantBoletos;

        while (!mensaje.equalsIgnoreCase("finish")){
            System.out.println("Ingrese el destino a viajar : ");
            destino = input.nextInt();

            System.out.println("Ingrese el horario a viajar : ");
            horario = input.nextInt();

            System.out.println("Ingrese la cantidad de boletos a comprar : ");
            cantBoletos =  input.nextInt();


            // venta de vuelos

            if (destino >= 5){
                if (horario >= 2){
                    if (vuelos[destino][horario] >= cantBoletos){
                        System.out.println("Su reserva fue realziada con exito.");
                        vuelos[destino][horario] = vuelos[destino][horario] - cantBoletos;
                    }else {
                        System.out.println("No hay asientos disponibles.");
                    }
                }else {
                    System.out.println("Ingrese un numero de destino entre 0 - 2");
                }
            }else {
                System.out.println("Ingrese un dato de destino entre 0 - 5");
            }

            System.out.println("¿Desea continiar comprando? - Ingrese finish para terminar / si para continuar");

        }

    }
}

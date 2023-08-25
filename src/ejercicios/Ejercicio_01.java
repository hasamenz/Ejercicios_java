package ejercicios;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 01");
        System.out.println("Cantidad de dinero que recibe un trabajador.");

        double sueldoXhora = 7.5;
        short horasTrabajadas;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas en la semana : ");
        horasTrabajadas = input.nextShort();

        if (horasTrabajadas <= 40){
            System.out.println("No realizo horas extra su pago es : " +(horasTrabajadas * sueldoXhora));
        } else if (horasTrabajadas > 40 && horasTrabajadas <= 48) {
            System.out.println("Realizo "+(horasTrabajadas - 40)+ " horas extra su pago es : " +(horasTrabajadas * (sueldoXhora * 2)));
        } else if (horasTrabajadas > 48) {
            System.out.println("Realizo "+(horasTrabajadas - 40)+ " horas extra su pago es : " +(horasTrabajadas * (sueldoXhora * 3)));
        }
    }
}

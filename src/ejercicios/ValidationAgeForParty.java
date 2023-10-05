package ejercicios;

import java.util.Scanner;

public class ValidationAgeForParty {
    public static void main(String[] args) {
        System.out.println("Fiesta de 15 años");

        short edad;
        String traeRegalo = "no";

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la edad del participante de la fiesta : ");
        edad = input.nextShort();


        if (edad >= 15){
            System.out.println("Como es mayor de Edad se va hacer una validacion extra...");
            System.out.println("Trae Regalo, seleccione : SI / NO");
            String consumeEnter = input.nextLine();
            traeRegalo = input.nextLine();

            if (traeRegalo.equalsIgnoreCase("si")){
                System.out.println("Puede ingresar, es mayor de edad y trae regalos.");
            }else {
                System.out.println("No Puede ingresar, es mayor de edad y NO trae regalos.");
            }
        }else {
            System.out.println("Puede ingresar al ser menor de edad.");
        }
    }
}

package ejercicios;
import java.util.Scanner;
public class CalculateLitersOfWater {
    public static void main(String[] args) {
        System.out.println("Calcular el pago de Agua.");
        int cantidadLitros;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de litros de agua consumidos : ");
        cantidadLitros = input.nextInt();

        if (cantidadLitros < 50){
            System.out.println("La cantidad de litros es menor a 50 el pago total es : 10" );
        } else if(cantidadLitros > 50 && cantidadLitros < 200){
            System.out.println("El precio del agua es : Precio Fijo = 10 \n" +
                    "Cantidad de litros consumidos = "+cantidadLitros+"\n" +
                    "Precio por litro : 0.5 " +(cantidadLitros - 50) * 0.5+ "\n" +
                    "Total : "+(10 +(cantidadLitros - 50) * 0.5) );
        } else if (cantidadLitros > 200) {
            System.out.println("El precio del agua es : Precio Fijo = 10 \n" +
                    "Cantidad de litros consumidos = "+cantidadLitros+"\n" +
                    "Precio por litro : 1.5 = " +(cantidadLitros - 50) * 1.5+ "\n" +
                    "Total : "+(10 +(cantidadLitros - 50) * 1.5) );
        }
    }
}

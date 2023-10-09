package ejercicios;
import java.util.Scanner;
public class FindFactorialNumber {
    public static void main(String[] args) {
        System.out.println("Resolver Factorial");
        int numeroCalcular;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero para saber su factorial : ");
        numeroCalcular = input.nextInt();
        Factorial factorial = new Factorial();
        System.out.println(factorial.resolverFactorial(numeroCalcular));
    }
    public static class Factorial {
        double resolverFactorial(int n){
            double contador = 1;
            for (int i = 2; i <= n; i++ ){
                contador = contador * i;
            }
            return contador;
        }
    }
}

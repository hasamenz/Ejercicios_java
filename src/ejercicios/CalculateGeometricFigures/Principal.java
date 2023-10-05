package ejercicios.CalculateGeometricFigures;

public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();


        rectangulo.setAltura(15);
        rectangulo.setAncho(12);
        rectangulo.setColor("rojo");

        circulo.setRadio(5);
        circulo.setColor("Azul");

        triangulo.setLogitudLadoA(16);
        triangulo.setLogitudLadoB(18);
        triangulo.setLogitudLadoC(12);
        triangulo.setColor("Amarillo");


        System.out.println("El area del Cuadrado es: " +rectangulo.CalcularArea());
        System.out.println("El area del Circulo es: " +circulo.CalcularArea());
        System.out.println("El area del Triangulo es: " +triangulo.CalcularArea());


    }
}

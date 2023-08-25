package ejercicios.Ejercicio_11;

public class Triangulo extends Figura{
    private double logitudLadoA;
    private double logitudLadoB;
    private double logitudLadoC;

    public Triangulo(double logitudLadoA, double logitudLadoB, double logitudLadoC) {
        this.logitudLadoA = logitudLadoA;
        this.logitudLadoB = logitudLadoB;
        this.logitudLadoC = logitudLadoC;
    }

    public Triangulo() {
    }

    public double getLogitudLadoA() {
        return logitudLadoA;
    }

    public void setLogitudLadoA(double logitudLadoA) {
        this.logitudLadoA = logitudLadoA;
    }

    public double getLogitudLadoB() {
        return logitudLadoB;
    }

    public void setLogitudLadoB(double logitudLadoB) {
        this.logitudLadoB = logitudLadoB;
    }

    public double getLogitudLadoC() {
        return logitudLadoC;
    }

    public void setLogitudLadoC(double logitudLadoC) {
        this.logitudLadoC = logitudLadoC;
    }

    @Override
    public double CalcularArea() {
        double s = (this.logitudLadoA + this.logitudLadoB + this.logitudLadoC) / 2 ;
        return Math.sqrt((s*(s - this.logitudLadoA)*(s - this.logitudLadoB)*(s - this.logitudLadoC)));
    }
}

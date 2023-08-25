package ejercicios.Ejercicio_11;

public abstract class Figura {
    private String color;
    private boolean rellenaColor;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellenaColor() {
        return rellenaColor;
    }

    public void setRellenaColor(boolean rellenaColor) {
        this.rellenaColor = rellenaColor;
    }

    public abstract double CalcularArea();
}

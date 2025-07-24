package entities;
import Enum.Color;

public abstract class Shape { // uma classe abstrata serve apenas para delegar funcoes, nunca para ser instanciada
    private Color color;

    public Shape(){}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}

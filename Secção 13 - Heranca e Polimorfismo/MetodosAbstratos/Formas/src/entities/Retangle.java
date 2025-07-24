package entities;
import Enum.Color;
public class Retangle extends Shape{ /* quando precisa-se utilizar uma classe abstrata o metodo abstrato da superclasse (Shape)
                                        precisa ser implementado*/
    private Double width;
    private Double height;

    public Retangle(){}

    public Retangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

}

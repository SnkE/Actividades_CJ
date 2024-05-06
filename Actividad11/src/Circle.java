public class Circle implements Shape {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return  Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radio;
    }
}

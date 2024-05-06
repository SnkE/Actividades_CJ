public class Square implements Shape {
    private double tamanio;

    public Square(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public double getArea() {
        return tamanio * tamanio;
    }

    @Override
    public double getPerimeter() {
        return 4 * tamanio;
    }
}
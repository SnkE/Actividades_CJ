import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("..::: Bienvenido a este programa :D :::..");
        do {

            System.out.println("Seleccionar figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    handleCircle(scanner);
                    break;
                case 2:
                    handleTriangle(scanner);
                    break;
                case 3:
                    handleSquare(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }


    private static void handleCircle(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circle circle = new Circle(radio);
        printCalculationResults(circle, scanner);
    }


    private static void handleTriangle(Scanner scanner) {
        System.out.print("Ingrese el lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3 del triángulo: ");
        double lado3 = scanner.nextDouble();
        Triangle triangle = new Triangle(lado1, lado2, lado3);
        printCalculationResults(triangle, scanner);
    }


    private static void handleSquare(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double tamanio = scanner.nextDouble();
        Square square = new Square(tamanio);
        printCalculationResults(square, scanner);
    }


    private static void printCalculationResults(Shape shape, Scanner scanner) {
        System.out.println("Seleccione la propiedad a calcular:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int propertyChoice = scanner.nextInt();

        switch (propertyChoice) {
            case 1:
                System.out.println("El área es: " + shape.getArea());
                break;
            case 2:
                System.out.println("El perímetro es: " + shape.getPerimeter());
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
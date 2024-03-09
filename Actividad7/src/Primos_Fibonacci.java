//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Primos_Fibonacci {
        private int cantidadNumeros;

    public static void main(String[] args) {
        int cantidadNumeros = 17;
        Primos_Fibonacci num = new Primos_Fibonacci(cantidadNumeros);
        num.imprimirNumerosPrimos();
        System.out.println();
        num.imprimirFibonacci();
    }
        public Primos_Fibonacci(int cantidadNumeros) {
            this.cantidadNumeros = cantidadNumeros;
        }

        public int[] calcularNumerosPrimos()
        {
            int[] numerosPrimos = new int[cantidadNumeros];
            int count = 0;
            int num = 2;
            while (count < cantidadNumeros) {
                boolean esPrimo = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    numerosPrimos[count] = num;
                    count++;
                }
                num++;
            }
            return numerosPrimos;
        }

        public int[] calcularFibonacci() {
            int[] fibonacci = new int[cantidadNumeros];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            for (int i = 2; i < cantidadNumeros; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            return fibonacci;
        }

        public void imprimirNumerosPrimos() {
            int[] numerosPrimos = calcularNumerosPrimos();
            System.out.print("Números primos:\n");
            for (int i = 0; i < cantidadNumeros - 1; i++) {
                System.out.print(numerosPrimos[i] + ", ");
            }
            System.out.println(numerosPrimos[cantidadNumeros - 1]);
        }

        public void imprimirFibonacci() {
            int[] fibonacci = calcularFibonacci();
            System.out.print("Sucesión de Fibonacci:\n");
            for (int i = 0; i < cantidadNumeros - 1; i++) {
                System.out.print(fibonacci[i] + ", ");
            }
            System.out.println(fibonacci[cantidadNumeros - 1]);
        }

}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        System.out.println("..:::Bienvenido a este codigo sobre las cartas del Poker:::..");
        showMenu();
    }

    public static void showMenu(){
        Deck deck= new Deck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione cualquier opcion:");
        System.out.println("1. Mezclar Deck:");
        System.out.println("2. Sacar una carta:");
        System.out.println("3. Carta al azar");
        System.out.println("4. Generar una mano de 5 cartas");
        System.out.println("0. Salir");
        String opcion= scanner.nextLine();
        switch(opcion){
            case "1":
                System.out.println("------------Shuffle:-----------");
                deck.suffle();

                break;
            case "2":
                System.out.println("------------Head:--------------");
                deck.head();
                break;
            case "3":
                System.out.println("------------Pick:--------------");
                deck.pick();
                break;
            case "4":
                System.out.println("------------Hand:--------------");
                deck.hand();
                break;
            case "0":
                System.out.println("-------------------------------");
                System.out.println("..:::Hecho por Emilio Sonck Patiño:::.");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                showMenu();
                break;

        }
    }

}
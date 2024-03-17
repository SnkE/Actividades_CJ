//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Deck deck= new Deck();
        System.out.println("..:::Bienvenido a este codigo sobre las cartas del Poker:::..");
        System.out.println("------------Shuffle:-----------");
        deck.suffle();
        System.out.println("------------Head:--------------");
        deck.head();
        System.out.println("------------Pick:--------------");
        deck.pick();
        System.out.println("------------Hand:--------------");
        deck.hand();
        System.out.println("-------------------------------");
        System.out.println("..:::Hecho por Emilio Sonck Patiño:::.");
    }
}
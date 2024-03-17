import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cartas;

    public Deck(){
        cartas= new ArrayList<>();
        Inicializar();

    }

    private void Inicializar() {
        String[] palos = {"Treboles", "Corazones", "Picas", "Diamantes"};
        String[] valores = {"A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos) {
            String[] colores;
            if (palo.equals("Treboles") || palo.equals("Picas")) {
                colores = new String[]{"Negro"};
            } else {
                colores = new String[]{"Rojo"};
            }
            for (String color : colores) {
                for (String valor : valores) {
                    cartas.add(new Card(palo, color, valor));
                }
            }
        }
    }

    public void suffle(){
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck");
    }

    public void head(){
        Card primeraCarta= cartas.remove(0);
        System.out.println(primeraCarta+"\n"+"Quedan "+cartas.size()+" cartas en deck");
    }

    public void pick(){
        Random aleatorio= new Random();
        int index = aleatorio.nextInt(cartas.size());
        Card CartaSeleccionada = cartas.remove(index);
        System.out.println(CartaSeleccionada+"\n"+"Quedan "+cartas.size()+" cartas en deck");
    }

    public void hand(){
        for(int i=1;i<=5;i++){
            Card carta=cartas.remove(0);
            System.out.println(carta);
        }
        System.out.println("Quedan "+cartas.size()+" cartas en deck");
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {

    private String Palo;
    private String Color;
    private String Valor;

    public Card(String Palo, String Color, String Valor){
        this.Color=Color;
        this.Palo=Palo;
        this.Valor=Valor;
    }

    @Override
    public String toString(){
        return Palo+","+Color+","+Valor;
    }

}

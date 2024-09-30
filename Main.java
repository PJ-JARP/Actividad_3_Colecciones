//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        //impresión de métodos de clase Deck.

        Deck deck = new Deck(); //objeto deck.
        deck.shuffle();
        deck.head();
        deck.pick();
        Card[] mano = deck.hand();

        }
    }

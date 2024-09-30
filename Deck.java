import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    // atributo
    private List<Card> cards;

    // se inicia el Constructor para inicializar el mazo con las 52 cartas
    public Deck() {
        cards = new ArrayList<>(); //creacion de objeto arraylist.
        String[] palos = {"corazones", "picas", "tréboles", "diamantes"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos) {
            for (String valor : valores) {
                String color = (palo.equals("corazones") || palo.equals("diamantes")) ? "rojo" : "negro";
                cards.add(new Card(palo, color, valor));
            }
        }
    } //fin de constructor e inicialización de variables.

    // Barajar el mazo e imprimir un mensaje
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("_______________Comienzas con 52 varajas.________________");
        System.out.println("________________________________________________________");
        System.out.println("Se mezcla el DECK ");
    }

    // Obtener y remover la primera carta, imprimir un mensaje
    public Card head() {
        System.out.println("_________________________head_______________________________");
        Card card = cards.remove(0);
        System.out.println("* Esta es la primera carta: " + card + "\nTe Quedan " + cards.size() + " cartas en el deck.");
        return card;
    }

    // Obtener y remover una carta aleatoria, imprimir un mensaje
    public Card pick() {
        System.out.println("_________________________pick_______________________________");
        int randomIndex = (int) (Math.random() * cards.size()); //operación de número aleatorio.
        Card card = cards.remove(randomIndex);
        System.out.println("* Se remueve una carta leatoria...");
        System.out.println(card + "\nQuedan " + cards.size() + " cartas en el deck.");
        return card;
    }

    // Obtener hand: regresará un arreglo de cinco cartas del deck, las
    // cartas deberán removerse del deck.
    // El método deberá imprimir en pantalla un mensaje con el
    //  siguiente formato: remover cinco cartas, imprimir un mensaje
    // */
    public Card[] hand() {
        System.out.println("_________________________hand_______________________________");
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = cards.remove(0);
            System.out.println(hand[i]);
        }
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        return hand;
    }
}




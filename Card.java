public class Card {

    // Atributos de la carta
    private String palo;
    private String color;
    private String valor;

    // Constructor para inicializar una carta
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    // Métodos getters para acceder a los atributos
    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    //metodo toString para tener un formato de la carta main.
    @Override
    public String toString() {
        return valor + " de " + palo + " (" + color + ")";
    }

}

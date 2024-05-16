public class Carta {
    int valor;
    String naipe;
    public Carta (int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }
    @Override
    public String toString () {
        return valor + " de " + naipe;
    }
}

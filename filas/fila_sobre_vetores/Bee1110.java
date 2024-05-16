import java.util.Scanner;
public class Bee1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            Fila entrada = new Fila(n);
            Fila descartados = new Fila(n);
            for (int i=1; i<=n; i++) {
                entrada.enfileira(i);
            }
            while (entrada.getTamanho() >= 2) {
                descartados.enfileira(entrada.desinfileira());
                entrada.enfileira(entrada.desinfileira());
            }
            System.out.println("Discarded cards: " + descartados);
            System.out.println("Remaining card: " + entrada.getSobrou());
            n = scanner.nextInt();
        }
        scanner.close();
    }
    
}
class Fila {
    private int[] dados;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public static final int CAPACIDADE_MINIMA = 10;

    public Fila (int capacidade) {
        dados = capacidade >= 10 ? new int[capacidade] : new int[CAPACIDADE_MINIMA];
        primeiro = 0;
        ultimo = dados.length - 1;
        tamanho = 0;
    }

    public Fila () {
        this(CAPACIDADE_MINIMA);
    }
    public int getTamanho() {
        return tamanho;
    }
    public int getSobrou() {
        return dados[primeiro];
    }
    public boolean estaVazia () {
        return tamanho == 0;
    }
    public boolean estaCheia () {
        return tamanho == dados.length;
    }
    int proximaPosicao (int posicao) {
        return (posicao + 1) % dados.length;
    }
    public boolean enfileira (int i) {
        if (estaCheia()) return false;
        ultimo = proximaPosicao(ultimo);
        dados[ultimo] = i;
        tamanho++;
        return true;
    }
    public int desinfileira () {
        if (estaVazia()) return -1;
        int temp = dados[primeiro];
        primeiro = proximaPosicao(primeiro);
        tamanho--;
        return temp;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "fila vazia";
        String s = "";
        int cont = primeiro;
        do {
            s = s + dados[cont] + ", ";
            cont = proximaPosicao(cont);
        } while (cont != ultimo);
        s += dados[ultimo];
        return s;
    }
 }

public class Fila {
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
            s = s + dados[cont] + " ";
            cont = proximaPosicao(cont);
        } while (cont != proximaPosicao(ultimo));
        return s;
    }
    public void mostraVetor() {
        if (estaVazia()) 
            System.out.print ("_ _ _ _ _ _ _ _ _ _ ");
        else if (primeiro <= ultimo) {
            for (int i=0; i<primeiro; i++)
                System.out.print ("_ ");
            for (int i=primeiro; i<=ultimo; i++)
                System.out.print (dados[i] + " ");
            for (int i=ultimo+1; i<dados.length; i++)
                System.out.print ("_ ");
        }
        else {
            for (int i=0; i<=ultimo; i++)
                System.out.print (dados[i] + " ");
            for (int i=ultimo + 1; i< primeiro; i++)
                System.out.print ("_ ");
            for (int i = primeiro; i<dados.length; i++)
                System.out.print (dados[i] + " ");
        }
        System.out.println();
    }
 }










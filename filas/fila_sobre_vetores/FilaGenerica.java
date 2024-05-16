public class FilaGenerica <E> {
    private E[] dados;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public static final int CAPACIDADE_MINIMA = 10;

    public FilaGenerica (int capacidade) {
        if (capacidade > 10)
            dados = (E[]) new Object [capacidade];
        else 
            dados = (E[]) new Object [CAPACIDADE_MINIMA];
        primeiro = 0;
        ultimo = dados.length - 1;
        tamanho = 0;
    }

    public FilaGenerica () {
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
    public boolean enfileira (E i) {
        if (estaCheia()) return false;
        ultimo = proximaPosicao(ultimo);
        dados[ultimo] = i;
        tamanho++;
        return true;
    }
    public E desinfileira () {
        if (estaVazia()) return null;
        E temp = dados[primeiro];
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










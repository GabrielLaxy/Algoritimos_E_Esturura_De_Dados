import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Fila f = new Fila();
        Random r = new Random();
        do {
            if (r.nextBoolean()) {
                if (!f.estaCheia()) f.enfileira(r.nextInt(10));
            }
            else {
                if (!f.estaVazia()) System.out.println("\n" + f.desinfileira() + " saiu");
            }
            System.out.println(f);
            f.mostraVetor();
        } while (!f.estaVazia());
    }
}

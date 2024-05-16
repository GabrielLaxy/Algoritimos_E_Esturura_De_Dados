import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random random = new Random();
        int[] v = new int[12];
        ABB abb = new ABB();
        for (int i=0; i<12; i++) {
            v[i] = random.nextInt(20) + 1;
            System.out.print(v[i] + " ");
            abb.insere(v[i]);
        }
        System.out.println("\na arvore:\n" + abb.stringInOrder());
        System.out.println("\nnivel: " + abb.nivel());
        System.out.println("\ntotal de nos: " + abb.numeroNos());
        System.out.println("\nMaior valor: " + abb.maior());
        System.out.println("\nMaior por recursao: " + abb.chamaMaiorRec());
        System.out.println("\nTemos " + abb.folhas() + " folhas");
    }
}

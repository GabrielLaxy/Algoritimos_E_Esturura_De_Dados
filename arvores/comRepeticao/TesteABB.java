import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(501) + 5;
        System.out.println("\nn = " + n);
        int[] v = new int[n];
        ABB abb = new ABB();
        for (int i=0; i<n; i++) {
            v[i] = random.nextInt(n/5) + 1;
            System.out.print(v[i] + " ");
            abb.insere(v[i]);
        }
        System.out.println("\na arvore:\n" + abb.stringEmOrdem());
        System.out.println("\nnivel: " + abb.nivel());
        System.out.println("\nnumero de nos: " + abb.numeroNos());
    }
}

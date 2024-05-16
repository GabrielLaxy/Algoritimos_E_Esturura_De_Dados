import java.util.Scanner;

public class TesteRandomico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("escolha o tamanho do vetor: ");
        int n = scanner.nextInt();
        while (n>0) {
            MeuVetor v1 = new MeuVetor(n);
            v1.preencheVetor();
            System.out.println(v1);
            System.out.print ("escolha o tamanho do vetor, 0 encerra: ");
            n = scanner.nextInt();
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuVetor v1;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();
        while (n > 0) {
            v1 = new MeuVetor(n);
            v1.preencheVetor();
            //System.out.println(v1);
            System.out.print("digite um valor para busca: ");
            double x = sc.nextDouble();
            Retorno r = v1.buscaSimples(x);
            if (r.getAchou()) {
                System.out.println(x + " encontrado na busca simples");
            }
            else {
                System.out.println(x + " nao encontrado pela busca simples");
            }
            System.out.println("busca simples realizou " + r.getCont() + " comparacoes");
            System.out.println("\nordenando...");
            v1.insertionsort();
            r = v1.buscaBinaria(x);
            if (r.getAchou()) {
                System.out.println(x + " encontrado na busca binaria");
            }
            else {
                System.out.println(x + " nao encontrado pela busca binaria");
            }
            System.out.println("busca binaria realizou " + r.getCont() + " comparacoes");
            System.out.print("\ndigite o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}

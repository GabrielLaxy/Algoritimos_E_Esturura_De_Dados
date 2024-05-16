import java.util.Date;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        MeuVetor v1;
        Scanner sc = new Scanner(System.in);
        int tamanho;
        System.out.print("digite um tamanho para o vetor de teste, 0 encerra: ");
        tamanho = sc.nextInt();
        while (tamanho > 0) {
            v1 = new MeuVetor(tamanho);

            v1.preencheVetor();
            //System.out.println("\nprimeiro vetor gerado:\n" + v1);
            long inicio = new Date().getTime();
            v1.bubbleSort();
            long fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo Bubble:\n" + v1);
            System.out.println("tamanho: " + tamanho + " Bubble demorou " + (fim - inicio) + " ms");
            
            v1.preencheVetor();
            //System.out.println("\nsegundo vetor gerado:\n" + v1);
            inicio = new Date().getTime();
            v1.insertionsort();
            fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo Insertion:\n" + v1);
            System.out.println("tamanho: " + tamanho + " Insertion demorou " + (fim - inicio) + " ms");

            v1.preencheVetor();
            //System.out.println("\terceiro vetor gerado:\n" + v1);
            inicio = new Date().getTime();
            v1.selectionsort();
            fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo Selection:\n" + v1);
            System.out.println("tamanho: " + tamanho + " Selection demorou " + (fim - inicio) + " ms");
            
            System.out.print("digite novo tamanho para o vetor, 0 encerra: ");
            tamanho = sc.nextInt();
        }
        sc.close();
    }
}

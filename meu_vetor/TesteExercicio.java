import java.util.Random;
public class TesteExercicio {
    public static void main(String[] args) {
        Random random = new Random();
        MeuVetor v = new MeuVetor(20);
        Retorno retorno = v.encontraMaior();
        if (!retorno.getAchou()) {
            System.out.println("vetor vazio");
        }
        else {
            System.out.println ("maior = " + retorno.getCont());
        }
        if (v.removeMaior()) {
            System.out.println("maior removido");
            System.out.println(v);
        }
        else {
            System.out.println("vetor estava vazio");
        }
        for (int i=0; i<20; i++) {
            v.adiciona(random.nextInt(100));
        }
        System.out.println(v);
        retorno = v.encontraMaior();
        if (!retorno.getAchou()) {
            System.out.println("vetor vazio");
        }
        else {
            System.out.println ("maior = " + retorno.getCont());
        }
        if (v.removeMaior()) {
            System.out.println("maior removido");
            System.out.println(v);
        }
        else {
            System.out.println("vetor estava vazio");
        }
    }
}
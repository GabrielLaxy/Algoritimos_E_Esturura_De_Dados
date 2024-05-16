import java.util.Random;
public class TesteExercicio {
    public static void main(String[] args) {
        Random random = new Random();
        Lista lista =  new Lista();
        Retorno retorno = lista.encontraMaior();
        if (!retorno.getAchou()) {
            System.out.println("lista vazia");
        }
        else {
            System.out.println ("maior = " + retorno.getContador());
        }
        if (lista.removeMaior()) {
            System.out.println("maior removido");
            System.out.println(lista);
        }
        else {
            System.out.println("lista estava vazia");
        }
        for (int i=0; i<20; i++) {
            lista.insereInicio(random.nextInt(100));
        }
        System.out.println(lista);
        retorno = lista.encontraMaior();
        if (!retorno.getAchou()) {
            System.out.println("lista vazia");
        }
        else {
            System.out.println ("maior = " + retorno.getContador());
        }
        if (lista.removeMaior()) {
            System.out.println("maior removido");
            System.out.println(lista);
        }
        else {
            System.out.println("lista estava vazia");
        }
    }
}
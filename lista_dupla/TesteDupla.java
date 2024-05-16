import java.util.Random;
public class TesteDupla {
    public static void main(String[] args) {
        Random random = new Random();
        ListaDupla lDupla = new ListaDupla();
        do {
            if (random.nextBoolean()) { //inserção
                if (random.nextBoolean()) { //no inicio
                    System.out.println("inseriu inicio");
                    lDupla.insereInicio(random.nextInt(10));
                }
                else { //no fim
                    System.out.println("inseriu fim");
                    lDupla.insereFim(random.nextInt(10));
                }
            }
            else if (!lDupla.estaVazia()) { //remoção
                if (random.nextBoolean()) { //no final
                    System.out.println(lDupla.removeFim() + " saiu do fim da lista");
                }
                else { //no inicio
                    System.out.println(lDupla.removeInicio() + " saiu do inicio da lista");
                }
            }
            System.out.println(lDupla);
        } while (!lDupla.estaVazia());
    }
}

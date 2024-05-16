public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println(lista);

        for (int i=1; i<10; i+=2) {
            lista.insereInicio(i);
            System.out.println(lista);
        }
        for (int i=2; i<=10; i+=2) {
            lista.insereFim(i);
            System.out.println(lista);
        }
        if (lista.estaVazia()) {
            System.out.println("lista vazia, nao ha o que remover");
        }
        else {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println(lista);
        }
        if (lista.estaVazia()) {
            System.out.println("lista vazia, nao ha o que remover");
        }
        else {
            System.out.println(lista.removeFim() + " foi removido do fim");
            System.out.println(lista);
        }
        // while (!lista.estaVazia()) {
        //     System.out.println(lista.removeInicio() + " foi removido do inicio");
        //     System.out.println(lista);
        // }
        // while (!lista.estaVazia()) {
        //     System.out.println(lista.removeFim() + " foi removido do fim");
        //     System.out.println(lista);
        // }
    }
}

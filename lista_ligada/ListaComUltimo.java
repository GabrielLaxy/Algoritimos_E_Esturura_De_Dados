public class ListaComUltimo extends Lista{
    private No ultimo;
    //construtor padrão
    public No getUltimo() {
        return ultimo;
    }
    @Override
    public void insereFim (int i) {
        No novo = new No(i);
        if (estaVazia()) {
            setPrimeiro(novo);
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    @Override
    public int removeFim () {
        int i = ultimo.getInfo();
        if (getPrimeiro() != ultimo) { //tem mais que um elemento
            No aux = getPrimeiro();
            while (aux.getProximo() != ultimo) {
                aux = aux.getProximo();
            }
            aux.setProximo(null);
            ultimo = aux;
        }
        else {
            ultimo = null;
            setPrimeiro(null);
        }
        return i;
    }
    //exercício
    //insere inicio
    //remove inicio
}

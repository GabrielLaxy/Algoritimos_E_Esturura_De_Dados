public class Pilha {
    private No topo;
    //construtor padrão 
    public boolean estaVazia() {
        return topo == null;
    }
    public void push(int info) {
        No novo = new No(info);
        if (!estaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }
    public int pop () {
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }
    @Override
    public String toString() {
        String s = "pilha: ";
        if (estaVazia()) {
            s += "vazia";
        }
        else { 
            No aux = topo;
            while (aux != null) { //percorrer até o final
                s += aux + "\n";
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s + "\n";
    }
    
}

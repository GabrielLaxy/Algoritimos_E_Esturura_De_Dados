public class PilhaChar {
    private NoChar topo;
    //construtor padrão 
    public boolean estaVazia() {
        return topo == null;
    }
    public void push(char info) {
        NoChar novo = new NoChar(info);
        if (!estaVazia()) {
            novo.setProximo(topo);
        }
        topo = novo;
    }
    public char pop () {
        char temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }
}

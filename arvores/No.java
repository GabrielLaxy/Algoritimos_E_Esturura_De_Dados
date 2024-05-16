public class No {
    private int info;
    private No esquerda;
    private No direita;
    public No(int info) {
        this.info = info;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }
    @Override
    public String toString() {
        return "[" + info + "]";
    }
    
}
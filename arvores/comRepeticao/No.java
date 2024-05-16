public class No {
    private int info;
    private int quantidade;
    private No esquerda;
    private No direita;
    public No(int info) {
        this.info = info;
        this.quantidade = 1;
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
    public int getQuantidade() {
        return quantidade;
    }
    public void somaQuantidade() {
        quantidade++;
    }
    public void subtraiQuantidade() {
        quantidade--;
    }
    @Override
    public String toString() {
        return "[info=" + info + ", quantidade=" + quantidade + "]";
    }
    
}
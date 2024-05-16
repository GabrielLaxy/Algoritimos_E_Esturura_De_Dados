public class ABB {
    private No raiz;
    boolean estaVazia() {
        return raiz == null;
    }
    public void insere (int i) {
        if (estaVazia())
            raiz = new No(i);
        else 
            insereRec (i, raiz);
    }
    public void insereRec (int i, No atual) {
        if (i == atual.getInfo()) {
            atual.somaQuantidade();
        }
        else if (i < atual.getInfo()) {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new No(i));
            else 
                insereRec(i, atual.getEsquerda());
        }
        else {
            if (atual.getDireita() == null)
                atual.setDireita(new No(i));
            else
                insereRec(i, atual.getDireita());
        }
    }
    public String stringEmOrdem() {
        if (estaVazia()) return "arvore vazia";
        return stringEmOrdemRec(raiz);
    }
    public String stringEmOrdemRec (No atual) {
        if (atual == null) return "";
        
        String s = "";

        s += stringEmOrdemRec(atual.getEsquerda());

        for (int i=1; i <= atual.getQuantidade(); i++)
            s += atual.getInfo() + " ";

        s += stringEmOrdemRec(atual.getDireita());
        
        return s;
    }
    public int nivel () {
        if (estaVazia()) return 0;
        return nivelRec(raiz);
    }
    int nivelRec (No atual) {
        if (atual.getEsquerda() == null && atual.getDireita() == null) 
            return 0;
        int nivelEsq=0, nivelDir=0;
        if (atual.getEsquerda() != null)
            nivelEsq = nivelRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            nivelDir = nivelRec(atual.getDireita());
        return nivelEsq > nivelDir ? nivelEsq + 1 : nivelDir + 1;
    }
    public int numeroNos () {
        if (estaVazia()) return 0;
        return numeroNosRec(raiz);
    }
    int numeroNosRec (No atual) {
        if (atual == null) return 0;
        return numeroNosRec(atual.getEsquerda()) + 1 + numeroNosRec(atual.getDireita()); 
    }
}

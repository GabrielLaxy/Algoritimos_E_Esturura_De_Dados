public class ABB {
    private No raiz;
    public boolean estaVazia () {
        return raiz == null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (estaVazia()) 
            raiz = novo;
        else
            insereRec (novo, raiz);
    }
    void insereRec (No novo, No atual) {
        if (novo.getInfo() <= atual.getInfo()) {
            if (atual.getEsquerda() == null) 
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
        else {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        }
    }
    public String stringInOrder() {
        if (estaVazia()) return "arvore vazia";
        return stringRecInOrder(raiz);
    }
    String stringRecInOrder(No atual) {
        if (atual != null) 
            return stringRecInOrder (atual.getEsquerda()) +
            " " + atual.getInfo() + " " +
            stringRecInOrder (atual.getDireita());
        return "";
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
    public int maior () {
        if (estaVazia()) return -1;
        No aux = raiz;
        while (aux.getDireita() != null) {
            aux = aux.getDireita();
        }
        return aux.getInfo();
    }

    public int chamaMaiorRec () {
        if (estaVazia()) return -1;
        return maiorRec(raiz);
    }
    int maiorRec (No atual) {
        if (atual.getDireita() == null) 
            return atual.getInfo();
        return maiorRec(atual.getDireita());
    }
    public int folhas () {
        if (estaVazia()) return 0;
        return folhasRec(raiz);
    }

    int folhasRec (No atual) {
        if (atual == null) return 0;
        if (atual.getEsquerda()==null && atual.getDireita()==null) return 1;
        return folhasRec(atual.getEsquerda()) + folhasRec(atual.getDireita());
    }

    public int sucessor (int i) {
        if (estaVazia()) return -1;

        if (referencia(i) == null) return -1;
    }
    public No referencia (int i) {
        if (raiz.getInfo() == i) return raiz;
        if (i > raiz.getInfo()) return referenciaRec(i, raiz.getDireita());
        return refereciaRec(i, raiz.getEsquerda());
    }
}


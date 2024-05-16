public class Lista {
    private No primeiro;
    //construtor padrão 
    public No getPrimeiro () {
        return primeiro;
    }
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int info) {
        No novo = new No(info);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "vazia";
        }
        else { 
            No aux = primeiro;
            while (aux != null) { //percorrer até o final
                s += aux;
                aux = aux.getProximo();
            }
            s += "//";
        }
        return s + "\n";
    }
    public void insereFim(int info) {
        No novo = new No(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            No aux = primeiro;
            while (aux.getProximo() != null) { //percorre até o último
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    public int removeInicio () {
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }
    public int removeFim () {
        int temp;
        if (primeiro.getProximo() == null) {//a lista tem um elemento só
            temp = primeiro.getInfo();
            primeiro = null;
        }
        else {
            No aux = primeiro;
            while (aux.getProximo().getProximo() != null) { //percorre até o penúltimo
                aux = aux.getProximo();
            }
            temp = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return temp;
    } 
    public boolean removePrimeiraOcorrencia(int x) {
        if (estaVazia()) return false;
        if (primeiro.getInfo() == x) {
            primeiro = primeiro.getProximo();
            return true;
        }
        No atual = primeiro.getProximo();
        No anterior = primeiro;
        boolean achou = false;
        while (atual != null && !achou) {
            if (atual.getInfo() == x) {
                achou = true;
            }
            else { //continua procurando
                anterior = atual;
                atual = atual.getProximo();
            }
        }
        if (!achou) return false;
        anterior.setProximo(atual.getProximo());
        return true;
    }
}

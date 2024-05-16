public class ListaDupla {
    NoDuplo primeiro;
    NoDuplo ultimo;
    //construtor padrão
    public boolean estaVazia () {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim(int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else{
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removeInicio () {
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { // tinha um só
            ultimo = null;
        }
        else {
            primeiro.setAnterior(null);
        }
        return temp;
    }
    public int removeFim() {
        int temp = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) {
            primeiro = null;
        }
        else{
            ultimo.setProximo(null);
        }
        return temp;
    }
    @Override
    public String toString() {
        String s = "";
        if (estaVazia()) {
            s += "lista vazia";
        }
        else {
            s += "//<= ";
            NoDuplo aux = primeiro;
            while (aux != null) {
                s += aux + " = ";
                aux = aux.getProximo(); 
            }
            s += ">//";
        }
        return s;
    }
    public boolean removePrimeiraOcorrencia (int x) {
        if (estaVazia()) return false;
        if (primeiro.getInfo() == x) {
            primeiro = primeiro.getProximo();
            if (primeiro == null) {//esvaziou
                ultimo = null;
            }
            else {
                primeiro.setAnterior(null);
            }
            return true;
        }
        NoDuplo atual = primeiro.getProximo();//começa na segunda 
        boolean achou = false;
        while (atual != null && !achou) {
            if (atual.getInfo() == x) {
                achou = true;
            }
            else {
                atual = atual.getProximo();
            }
        }
        if (!achou) return false;
        if (ultimo.getInfo() == x) {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
            return true;
        }
        atual.getAnterior().setProximo(atual.getProximo());
        atual.getProximo().setAnterior(atual.getAnterior());
        return true;
    }
}

public class Retorno {
    private int cont;
    private boolean achou;
    //construtor padrão
    public int getCont() {
        return cont;
    }
    public boolean getAchou() {
        return achou;
    }
    public void incrementaCont() {
        cont++;
    }
    public void incrementaCont(int k) {
        cont+= k;
    }
    public void setAchou (boolean achou) {
        this.achou = achou;
    }
    public void setCont (int valor) {//usar para um valor qualquer do vetor
        cont = valor;
    }
}

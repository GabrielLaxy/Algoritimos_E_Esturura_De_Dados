public class Retorno {
    private int contador;
    private boolean achou;
    //somente o construtor padrão
    public int getContador() {
        return contador;
    }
    public boolean getAchou () {
        return achou;
    }
    public void incrementaContador() {
        contador++;
    }
    public void setAchou(boolean achou) {
        this.achou = achou;
    }
    public void setContador(int valor) {
        contador = valor;
    }
}

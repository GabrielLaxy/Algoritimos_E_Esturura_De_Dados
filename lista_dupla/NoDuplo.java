public class NoDuplo{
    private int info;
    private NoDuplo anterior;
    private NoDuplo proximo;

    public NoDuplo(int info){
        setInfo(info);
        setAnterior(null);
        setProximo(null);
    }
    public void setInfo(int info){
        this.info = info;
    }
    public int getInfo(){
        return info;
    }
    public void setAnterior(NoDuplo anterior){
        this.anterior = anterior;
    }
    public NoDuplo getAnterior(){
        return anterior;
    }
    public void setProximo(NoDuplo proximo){
        this.proximo = proximo;
    }
    public NoDuplo getProximo(){
        return proximo;
    }
    @Override                   
    public String toString(){
        return "|" + info + "|";
    }
}
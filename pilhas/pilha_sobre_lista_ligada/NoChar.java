public class NoChar {
    private char info;
    private NoChar proximo;
    public NoChar (char info) {
        setInfo(info);
        proximo = null; //por clareza
    }
    public char getInfo() {
        return info;
    }
    public NoChar getProximo() {
        return proximo;
    }
    public void setInfo (char info) {
        this.info = info;
    }
    public void setProximo (NoChar proximo) {
        this.proximo = proximo;
    }
}


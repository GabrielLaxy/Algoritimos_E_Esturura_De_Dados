public class Carro {
    private String placa;
    private int anoFab;

    public Carro (String placa, int anoFab) {
        this.anoFab = anoFab;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    @Override
    public String toString() {
        return "[placa=" + placa + ", anoFab=" + anoFab + "]";
    }
    
    

}

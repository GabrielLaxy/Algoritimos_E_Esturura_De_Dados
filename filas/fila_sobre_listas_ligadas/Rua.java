public class Rua {
    public static void main(String[] args) {
        Carro c1 = new Carro("ABC1234", 2010);
        Carro c2 = new Carro("XYZ4567", 2012);

        Fila<Carro> f = new Fila<>();
        System.out.println(f);
        f.enfileira(c1);
        System.out.println(f);
        f.enfileira(c2);
        System.out.println(f);

        f.enfileira(new Carro("MNP5678", 2016));
        System.out.println(f);

        System.out.println(f.desenfileira() + " saiu da fila");
        System.out.println(f);
    }
}

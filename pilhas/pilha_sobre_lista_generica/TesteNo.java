public class TesteNo {
    public static void main(String[] args) {
        Carta c1 = new Carta(2, "ouros");
        Carta c2 = new Carta(3, "paus");

        No<Carta> no1 = new No<Carta>(c1);
        No<Carta> no2 = new No<>(c2);

        No<Carta> no5 = new No<Carta>(new Carta(7, "espadas"));

        No<String> no3 =  new No<>("Hello World");

        No<No> no4 = new No<>(no1);

        System.out.println("carta 1: " + c1);
        System.out.println("no1: " + no1);
        System.out.println("no4: " + no4);
    }
}

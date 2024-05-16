public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);

        System.out.println("no 1: " + no1);
        System.out.println("no 2: " + no2);

        no1.setProximo(no2);
        System.out.println("e agora??" + no1.getProximo());

        no2.setProximo(no2);
        System.out.println("e gora???? " + no2.getProximo());
    }
}

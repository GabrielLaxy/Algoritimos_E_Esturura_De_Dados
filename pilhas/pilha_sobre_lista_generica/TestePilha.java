public class TestePilha {
    public static void main(String[] args) {
        Pilha<Carta> p = new Pilha<>();
        System.out.println(p);
        System.out.println("----------------");
        p.push(new Carta(2, "ouros"));
        System.out.println(p);
        System.out.println("----------------");
        p.push(new Carta(3, "paus"));
        System.out.println(p);
        System.out.println("----------------");
        p.push(new Carta(7, "espadas"));
        System.out.println(p);
        System.out.println("----------------");
        System.out.println(p.pop() + " saiu do monte");
        System.out.println(p);
        System.out.println("----------------");
        System.out.println(p.consultaTopo() + " esta no topo agora");
        System.out.println("tamanho atual: " + p.getTamanho());
        System.out.println("tamanho atual do outro jeito: " + p.tamanhoPilha());
    }
}

public class TesteVetor {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);

        System.out.println("ultima posicao depois da construcao: " + v1.getUltimaPos());
        System.out.println("vetor: " + v1);

        // v1.setUltimaPos(27);
        // System.out.println("ultima posicao depois do set: " + v1.getUltimaPos());
        // System.out.println("vetor: " + v1);

        // if (v1.adiciona(100)) {
        //     System.out.println("elemento inserido com sucesso!");
        // }
        // else {
        //     System.out.println("vetor esta cheio!");
        // }
        // System.out.println("vetor depois do add: " + v1);

        // int e = 1;
        // while (!v1.estaCheio()) {
        //     v1.adiciona(e++);
        //     System.out.println("vetor: " + v1);
        // }
        for (int n=1; n<=100; n++){
            v1.adiciona(n);
            System.out.println(" n= "+ n + " tamanho= " +  v1.getV().length );
        }
        System.out.println("\n\n");
        while (!v1.estaVazio()) {
            System.out.println("elemento removido: " +v1.remove() + ", capacidade: " +v1.getV().length);
        }
        for (int n=1; n<=100; n++) {
            v1.adiciona(n);
            System.out.println("n = " + n + "tamanho = " + v1.getV().length);
        }
    }
}















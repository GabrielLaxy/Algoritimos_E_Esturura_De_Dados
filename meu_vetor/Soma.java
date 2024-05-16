public class Soma {
    public static void main(String[] args) {
        int soma = 0;
        for (int i=0; i<args.length; i++) {
            soma = soma + Integer.parseInt(args[i]);
        }
        System.out.println(soma);
    }
}

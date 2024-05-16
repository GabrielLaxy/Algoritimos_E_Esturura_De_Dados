import java.util.Random;
public class MeuVetor {
    private double[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade) {
        v = new double[capacidade];
        ultimaPos = -1;
    }
    //métodos de acesso
    public int getUltimaPos () {
        return ultimaPos;
    }
    public double[] getV() {
        return v;
    }
    //métodos modificadores
    public void setUltimaPos(int pos) {
        if (pos>=0 && pos<v.length) {
            ultimaPos = pos;
        }
        else {
            ultimaPos = v.length-1;
        }
    }
    public boolean estaCheio () {
        return ultimaPos == v.length - 1;
    }
    public boolean estaVazio () {
        return ultimaPos == -1;
    }
    public void adiciona (int e) {
        if(estaCheio()){
            redimensiona(v.length*2);
        }
        v[++ultimaPos] = e;
    }
    public void adiciona (double e) {
        if(estaCheio()) redimensiona(v.length*2);
        v[++ultimaPos] = e;
    }
    //sobrecarga do adiciona com custo de arrasto
    public void adiciona (double e, int pos) {
        if (estaCheio()) redimensiona(v.length*2);   
        if (pos > ultimaPos) v[++ultimaPos] = e;
        int i;
        for (i = ultimaPos; i>=pos; i--) {
            v[i+1] = v[i];
        } 
        v[i+1] = e;
        ultimaPos++;
    }
    public double remove () {
        if  (estaVazio()) return 0;
        double aux = v[ultimaPos--];
        if (v.length>=10 && ultimaPos<=v.length/4){
            redimensiona(v.length/2);
        }
        return aux;
    }
    private void redimensiona (int novaCapacidade) {
        double[] temp= new double [novaCapacidade];
        for (int i=0; i<=ultimaPos; i++) {
            temp[i] = v[i];
        }
        v = temp;
    }
    @Override
    public String toString () {
        String s = "";
        if (estaVazio()) {
            s = s + "esta vazio";
        }
        else {
            for (int i=0; i<=ultimaPos; i++) {
                s = s + String.format("%.0f ", v[i]);
            }
        }
        s = s + "\n";
        return s;
    }
    public void resetVetor () {
        ultimaPos = -1;
    }
    public void preencheVetor() {
        Random r = new Random();
        resetVetor();
        while (!estaCheio()) {
            adiciona(r.nextInt(v.length*10) + 1);
        }
    }
    public void preencheVetor (int limite) {
        Random r = new Random();
        resetVetor();
        while (!estaCheio()) {
            adiciona(r.nextInt(limite));
        }
    }
    public int bubbleSort () {
        int cont = 0;
        for (int i=1; i<v.length; i++) {
            for (int j=0; j<v.length-i; j++) {
                cont++;
                if (v[j] > v[j+1]) {
                    double aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        return cont;
    }
    public void insertionsort () {
        for (int j = 1; j < v.length; ++j) {
            double x = v[j];
            int i;
            for (i = j-1; i >= 0 && v[i] > x; --i) {
                v[i+1] = v[i];
            }
            v[i+1] = x;
        }
    }
    public void selectionsort () {
        for (int i = 0; i < v.length-1; ++i) {
            int min = i;
            for (int j = i+1; j < v.length; ++j) {
                if (v[j] < v[min]) { 
                    min = j;
                }
            }
            double x = v[i]; 
            v[i] = v[min]; 
            v[min] = x;
        }
    }
    int removePrimeiraOcorrencia (int x) {
        boolean achou = false;
        int i = 0;
        int result = -1;
        while (i<v.length && !achou)
            if (v[i] == x)
                achou = true;
            else 
                i++;
        if (achou) {
            for (int j=i; j<ultimaPos; j++)
                v[j] = v[j+1];
            ultimaPos--;
            result = i;
            if (ultimaPos <= v.length/4)
                redimensiona(v.length/2);
        }
        return result;
    }
    int partition (int p, int r) {
        double x = v[r];     /* O pivô é o último elemento do vetor */
        int i = p-1;
    	for(int j = p; j < r; j++) {
            if (v[j] <= x) {
                i = i + 1;
                double aux = v[i];
                v[i] = v[j]; 
                v[j] = aux;
            }
        }
        i = i + 1;
        v[r] = v[i]; 
        v[i] = x;
        return i;
    }
    public void quick (int p, int r) {
        //System.out.println("p = " + p + ", r = " + r);
        if (p < r) {
            int q = partition(p, r);
            //System.out.println("q = " + q);
            quick(p, q-1);
            quick(q+1, r);
        }
    }
}

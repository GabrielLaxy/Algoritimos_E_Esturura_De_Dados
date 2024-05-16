import java.math.*;
import javax.swing.*;
public class BigFatorial {

   public static BigInteger bFatorial (BigInteger n) {
      BigInteger f = BigInteger.ONE;
      for (BigInteger i = new BigInteger("2");
           i.compareTo(n) <= 0; 
           i = i.add(BigInteger.ONE)) {
           f = f.multiply(i);
      }
      return f;
   }
   
   public static void chanceMegasena () {
      BigDecimal f60 = new BigDecimal(bFatorial(new BigInteger("60")));
      BigDecimal f54 = new BigDecimal(bFatorial(new BigInteger("54")));
      BigDecimal f6 = new BigDecimal(bFatorial(new BigInteger("6")));
      
      BigDecimal result = f54.multiply(f6).divide(f60, 20, RoundingMode.UP);
      
      JOptionPane.showMessageDialog(null, 
      "sua chance na megasena = " + result);
   }
   public static void main (String args[]) {
      BigInteger valor = 
      new BigInteger(JOptionPane.showInputDialog(
      "Digite um numero:"));
      System.out.println ("Fatorial de " + valor + " = \n"
                          + bFatorial(valor)); 
      chanceMegasena();
   }
}

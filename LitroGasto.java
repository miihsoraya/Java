
package motoristas;

import java.text.DecimalFormat;

public class Motoristas {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        int km = 1130; // tanques de 10 litros
        int l = 24;
        double media = km/l;
        // tanque cabe 10 litros
        double tanque = media/10;
        double resto = (tanque - Math.floor(tanque)); // 6.0 - 6.5
                
        if(tanque >= 1){//consumiu um ou mais tanques
            System.out.println("Gastou: " + (Math.floor(tanque)) + " tanques de 10 litros mais " + (df.format(resto)) + " litros");            
        }else{
            System.out.println("Gastou: " + media + " litros");
        }

    }
    
}

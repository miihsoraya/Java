
package motoristas;
/*Os  motoristas  se  preocupam  com  a  quilometragem  dos  s
eus  automóveis.  Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem 
dirigida  e  a  quantidade  de  combustível  em  litros  utilizados  para  cada  tanque  cheio. 
Desenvolva um programa Java que receba como entrada os quilômetros diri
gidos e 
os  litros  de  gasolina  consumidos  (ambos  como  inteiros)  para  cada  tanque  cheio.  O 
programa  deve  calcular  e  exibir  o  consumo  em  quilômetros/litro  para  cada  tanque 
cheio e imprimir a quilometragem combinada e a soma total de litros de combustível 
cons
umidos  até  esse  ponto.  Todos  os  cálculos  de  média  devem  produzir  resultados 
de ponto flutuante. Utilize um laço para obter os dados do usuário*/

import java.util.Scanner;

public class Motoristas {

    public static void main(String[] args) {
        Scanner mot = new Scanner(System.in);
   
        int km=0, litro=0, i = 1;
        double TotalKm = 0, TotalL = 0;
        while( km > -1 && litro > -1){
            System.out.println("Quantos quilomentrs    SAIR(-1)");
            km = mot.nextInt(); // tanques de 10 litros
            System.out.println("Consumo litros");
            litro = mot.nextInt();

            if(km > -1 && litro>-1 ){
                double media = km/litro; // tanque cabe 10 litros   
                System.out.println(i++ + ") Gastou: " + media + " litros por quilometro rodado");
                TotalKm += km;
                TotalL += litro;
            }
        }
        System.out.println("Quilometros gastos dos " + (i-1) + "carros: " + TotalKm + "km");
        System.out.println("Combustivel gastos dos " + (i-1) + "carros: " + TotalL + "L");
        System.out.println("Gastos dos " + (i-1) + "carros: " + (double)TotalKm/TotalL + "km/L");
            
        
    }
    
}

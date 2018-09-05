
package atvjava;

import java.util.Scanner;

public class AtvJava {

    public static void main(String[] args) {
        Scanner list = new Scanner(System.in);
        
        while (true){
            System.out.println(" Inserir funcionario?\t Sim(1) ou Não(0)");
            int resp = list.nextInt();
            
            if(resp == 1){
                System.out.println(" Digite um nome: ");
                String nome = list.next();
                System.out.println(" Digite as horas em inteiro: ");
                double hr = list.nextDouble();
                System.out.println(" Salário hora: "); //3.58
                double salario = list.nextDouble();
                System.out.println(nome + " " + hr + " " + salario); 
                double hora = hr * salario;
                if(hr > 40){
                    double extra = hr - 40; // saber quantas horas extras
                    double Calcextra = (( 1.5 * salario)) * extra; // multiplica o resultado pelas horas extras
                    System.out.println("Salário Bruto: " + (Calcextra + ((hr - extra) * salario))); // o resultado da porcentagem das horas extras + hora total menos a hora extra
                }else{
                    System.out.println("Salário Bruto: " + hora);
                }

            }else{
                break;
            } 
            
        }
        //se as horas excederam 40, entao dá 50% para todas as horas trabalhadas. Senao multiplica salario pela quantidade de horas.

        
    }
    
}

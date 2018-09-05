package testequestao;

import java.util.Scanner;

public class TesteQuestao {

    /*Um palíndromo é uma seqüência de caracteres que é lida da esquerda para a direita
ou da direita para a esquerda da mesma forma. Por exemplo, cada um dos seguintes
inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554, 11611. Escreva um
programa Java que leia um número de cinco dígitos e diga se ele é um palíndromo.
Se o número não for de cinco dígitos, o programa deve rejeitá-lo e pedir outro
número. (Nota: não utilize vetores ou strings para resolver este problema)
     */
    public static void main(String[] args) {
           Scanner pali = new Scanner(System.in);
           int falso = 0, verdadeiro = 0, s =0;
                      
           while(s<5){ // repeticao de 5 vezes
               System.out.println("Digite um numero com 5 digitos:   ");
               String n = pali.next();
               int meio = n.length() / 2; // comprimento divido por dois. localizando a metade da string
               if(n.length()==5){
                    for (int i = 0; i < meio; i++) { //meio=2 ... 0...1
                        if (n.charAt(i) != n.charAt(n.length()-1 - i)) { //localizacao(0 e 1) diferente do comprimento(3 e 4)
                            falso++;
                        }
                    }
                    if(falso>0){ //se for encotrado uma ou mais numeros diferentes é considerado falso
                        System.out.println("Nao sao iguais");
                    }else{
                        System.out.println("Sao iguais");
                    }    
               }else{
                    System.out.println("Escreva um numero com 5 digitos.   \n\n");
               }
               falso = 0;
               s++;
           }


           
    }
    
}

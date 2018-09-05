
package questaojav;

public class QuestaoJav {

    /*Um palíndromo é uma seqüência de caracteres que é lida da esquerda para a direita
ou da direita para a esquerda da mesma forma. Por exemplo, cada um dos seguintes
inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554, 11611. Escreva um
programa Java que leia um número de cinco dígitos e diga se ele é um palíndromo.
Se o número não for de cinco dígitos, o programa deve rejeitá-lo e pedir outro
número. (Nota: não utilize vetores ou strings para resolver este problema)
     */
    public static void main(String[] args) {
           String n="2321";
           int falso = 0, verdadeiro = 0;
           int meio = n.length() / 2;
           
           if(n.length()==5){
                for (int i = 0; i < meio; i++) {
                    if (n.charAt(i) != n.charAt(n.length()-1 - i)) {
                        falso++;
                    }else{
                        verdadeiro++;
                    }
                }    
           }else{
               System.out.println("Escreva um numero com 5 digitos");
           }
           
           if(falso>0){
               System.out.println("Nao sao iguais");
           }else if(verdadeiro>1){
               System.out.println("Sao iguais");
           }

           
    }
    
}

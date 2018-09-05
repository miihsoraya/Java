package primeiroprog;

public class PrimeiroProg {

    public static void main(String[] args) {
        int i= 0,j = 0, k = 0;
        
        System.out.println("N   N*10   N*100   N*1000");
        for(i=1;i<6;i++){
            for(j=1,k=i;j<5;j++,k*=10){
                System.out.print(k+"     ");
                
            }
            System.out.println();
        }
        
    }
    
}

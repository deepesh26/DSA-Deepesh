import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNum {
    // Def: Exactly two factor -> 1 and number itself.
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        /* int count = 0;
         for(int i = 1; i<=n; i++){
            if(n%i==0){
                count++;
                
            }
         }
         if(count==2){
            System.out.println("Prime: "+ n);
         }else{
            System.out.println("Not Prime: "+ n);
         } */

         int count = 0;
         for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
         }
         if(count==2){
            System.out.println(n+ " is a Prime Number");
         }else{
            System.out.println(n+ " is Not a Prime Number");
         }
        
    }
}
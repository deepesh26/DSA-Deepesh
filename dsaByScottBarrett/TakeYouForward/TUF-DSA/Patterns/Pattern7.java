import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern7 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

         /* for (int i = 0; i < n; i++) {
            for(int s1=0;s1<n-i-1;s1++){
                System.out.print(" ");
            }
            // for(int j=0;j<2*i+1;j++){
            //     System.out.print("*");
            // }
            for(int c=0; c<=i; c++){
                System.out.print("* ");
            }
          
            System.out.println();
        } */

            for(int row = 0; row < n; row++){
                int totalColInRow = 2*row+1;
                int totalNoOfSpace = n-row-1;
                for(int s=0;s<totalNoOfSpace; s++){
                    System.out.print(" ");
                }
                for(int col = 0; col<totalColInRow; col++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

   
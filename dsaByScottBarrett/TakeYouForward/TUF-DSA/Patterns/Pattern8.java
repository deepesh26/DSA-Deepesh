import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern8 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
            /* for(int row = n; row > 0; row--){
                int totalColInRow = 2*row-1;
                int totalNoOfSpace = n-row;
                for(int s=0;s<totalNoOfSpace; s++){
                    System.out.print(" ");
                }
                for(int col = 0; col<totalColInRow; col++){
                    System.out.print("*");
                }
                System.out.println();
            } */

            for(int row = 0; row < n; row++){
                int totalColInRow = 2*n-(2*row+1);
                int totalNoOfSpace = row;
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

   
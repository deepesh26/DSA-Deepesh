import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern17 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        
        for (int row = 0; row < n; row++) {
          
            for (int space = 0; space <n-row; space++) {
                System.out.print(" ");

            }
              char ch = 'A';
              int breakCh = (2*row+1)/2;
            for(int col = 0; col<2*row+1; col++){
                 System.out.print(ch + " ");
                 ch = (char) (col<breakCh?ch+1:ch-1);
            }
            System.out.println();
      }

    }

}

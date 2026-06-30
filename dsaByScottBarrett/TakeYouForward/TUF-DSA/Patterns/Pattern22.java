
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern22 {
    /**
     * @param args
     * @throws NumberFormatException
     * @throws IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* int originalN = n;
        n = 2*n;
        for (int row = 0; row < n-1; row++) {
            for (int col = 0; col < n-1; col++) {
               int atEveryIndex = originalN-(Math.min(Math.min(row, col), Math.min(n-row, n-col)));
                System.out.print(atEveryIndex+ " ");
            }

            System.out.println();
        } */

        for(int i =0; i<2*n-1; i++){
            for(int j =0; j<2*n-1; j++){

                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top, down), Math.min(left, right)));

            }
            System.out.println();
        }

    }

}

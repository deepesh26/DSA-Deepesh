import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern10 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row>n?2*n-row:row;
            for (int col = 0; col <totalColInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
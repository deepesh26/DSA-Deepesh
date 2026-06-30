import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern15 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        
        for (int row = 0; row < n; row++) {
            char ch = 'A';
            for (int col = 0; col <n-row; col++) {
                System.out.print(ch+" ");
                ch = (char) (ch + 1);
            }
            System.out.println();

        }

    }

}

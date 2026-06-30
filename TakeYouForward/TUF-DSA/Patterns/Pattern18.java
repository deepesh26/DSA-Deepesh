import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern18 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int row = 0; row < n; row++) {
            for (char ch = (char) ('E'-row); ch <= 'E'; ch++) {

                System.out.print(ch + " ");

            }

            System.out.println();
        }

    }

}

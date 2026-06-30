import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern21 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                boolean isBoundry = (row == 0 || row == n - 1 || col == 0 || col == n - 1);
                System.out.print(isBoundry ? "*" : " ");
            }

            System.out.println();
        }

    }

}

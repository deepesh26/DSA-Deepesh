import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern16 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char ch = 'A';
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print(ch + " ");

            }
            ch = (char) (ch + 1);
            System.out.println();

        }

    }

}

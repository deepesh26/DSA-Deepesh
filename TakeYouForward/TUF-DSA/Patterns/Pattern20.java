/* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern20 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int space = 2 * n - 2;
        for (int row = 0; row < 2 * n - 1; row++) {
            if (row < n) {

                // print Stars
                for (int col = 0; col <= row; col++) {
                    System.out.print("*");

                }
                // print spaces
                for (int s = 0; s < space; s++) {
                    System.out.print(" ");
                }
                // print Stars
                for (int col = 0; col <= row; col++) {
                    System.out.print("*");

                }

                if (row < n - 1) { // ✅ fix here
                    space -= 2;
                }

                System.out.println();

            } else {

                space += 2;

                for (int i = 0; i < 2 * n - row - 1; i++) {
                    System.out.print("*");
                }

                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }

                for (int i = 0; i < 2 * n - row - 1; i++) {
                    System.out.print("*");
                }

                System.out.println();

            }
        }

    }

}
 */

import java.io.*;

public class Pattern20 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int row = 0; row < 2 * n - 1; row++) {

            // calculate stars dynamically
            int stars = (row < n) ? row + 1 : 2 * n - row - 1;

            // calculate spaces dynamically
            int spaces = 2 * (n - stars);

            // left stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            // middle spaces
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            // right stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
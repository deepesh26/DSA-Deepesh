
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class PrintAllDivisions {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        /*
         * for (int i = 1; i <= n; i++) {
         * if (n % i == 0) {
         * System.out.print(i + ", ");
         * }
         * 
         * }
         */

        List<Integer> list = new ArrayList<>();

        // Loop only till sqrt(n)
        for (int i = 1; i <= Math.sqrt(n); i++) {

            // Check if i divides n completely
            // If true, then i is a divisor of n
            if (n % i == 0) {

                // Add the divisor i
                list.add(i);

                // This condition avoids adding duplicate values
                // When i == n/i (perfect square case), both are same
                // Example: n = 36, i = 6 → n/i = 6
                // So we add only once
                if (n / i != i) {

                    // Add the paired divisor
                    // If i is a divisor, then n/i is also a divisor
                    // Example: n = 36, i = 3 → pair is 12
                    list.add(n / i);
                }
            }
        }

        // Sort all divisors in ascending order
        Collections.sort(list);

        System.out.println(list);

    }
}
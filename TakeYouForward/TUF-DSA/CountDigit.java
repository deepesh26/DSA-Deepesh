import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigit {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        //int count = (int) Math.log10(n) + 1;
        int count = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        //int count = String.valueOf(n).length();

        
        /* int count = 0;
        while(n>0){
            // moduler will not make sense because we are just counting digits.
            n = n/10;
            count++;
        } */
        System.out.println("Count Digit: "+ count);

/* Hardcoded number with leading zero
int n = 0686 is treated as octal (base 8) and becomes invalid because digit 8 is not allowed

Hardcoded normal number
int n = 686 is treated as decimal (base 10)

BufferedReader input
input 0686 is treated as decimal 686

Scanner input
input 0686 is treated as decimal 686

String input
input 0686 stored as string is "0686" and length is 4

Final rule (simple to remember)

Numbers written in code follow Java rules like octal, hex, binary
Numbers coming from input are always treated as decimal
Strings are stored exactly as entered without any interpretation */
        
    }
}
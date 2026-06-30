import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmStrongNum {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum = sum+(digit*digit*digit);
        }
        if(original==sum){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        
    }
}
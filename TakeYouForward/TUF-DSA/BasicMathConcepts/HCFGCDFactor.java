import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HCFGCDFactor {

    public static void main(String[] args) throws IOException {
        
        int gcd = gcd(52, 10);
        System.out.println(gcd);

    }

    public static int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0)
            return b;
        
        return a;
    }
}
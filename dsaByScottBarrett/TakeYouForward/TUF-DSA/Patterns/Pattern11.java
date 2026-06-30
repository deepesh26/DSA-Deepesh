import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Pattern11 {

/* 
1                              
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for(int row = 0; row<n; row++){
        for(int col = 0; col<=row; col++){
            int digit= (row+col)%2==0?1:0;
            System.out.print(digit);
        }
        System.out.println();
    }
}


}

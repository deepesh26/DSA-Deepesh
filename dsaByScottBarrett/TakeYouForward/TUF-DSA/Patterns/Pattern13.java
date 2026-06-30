import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Pattern13 {

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int start = 1; int col;
    for(int row = 0; row<n; row++){
        for( col = 0; col<=row; col++){
            System.out.print(start+" ");
            start+=1;
        }
        
        System.out.println();
    }
}


}

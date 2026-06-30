import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Pattern12 {

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int space = 2*(n-1);
    for(int row = 0; row<n; row++){
        // Number
        for(int col = 0; col<=row; col++){
            System.out.print(col+1);
        }
        // Space
        /* for(int s=0; s<(2*n-2*row)-2;s++){
            System.out.print(" ");
        } */

        for(int s=0;s<space; s++){
            System.out.print(" ");
        }
        space-=2;
        // Number
        for(int col1=row+1;col1>0; col1--){
            System.out.print(col1);
        }

        System.out.println();
    }
}


}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern19 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

       int space = 0;
        for(int row = 0; row<n; row++){
            // first symmetry 
             // print stars
            for(int col=0; col<n-row; col++){
                System.out.print("*");
            }
            //print spaces
            for(int spc=0; spc<space; spc++ ){
                System.out.print(" ");
            }
            space+=2;
             // print stars
            for(int col=0; col<n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        int spaces = 2*n-2;
        for(int row = 0; row<n; row++){
            // Second symmetry 
             // print stars
            for(int col=0; col<=row; col++){
                System.out.print("*");
            }
            //print spaces
            for(int spc=0; spc<spaces; spc++ ){
                System.out.print(" ");
            }
            spaces-=2;
             // print stars
            for(int col=0; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    
    
}

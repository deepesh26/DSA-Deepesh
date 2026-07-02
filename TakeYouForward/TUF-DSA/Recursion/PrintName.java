/**
 * PrintName
 */
public class PrintName {

    public static void main(String[] args) {
        printName(1, 5);
    }

    public static void printName(int i, int n){

        if(i>n)
            return;
        System.out.println("Raj");
        printName(i+1, n);

    }
}
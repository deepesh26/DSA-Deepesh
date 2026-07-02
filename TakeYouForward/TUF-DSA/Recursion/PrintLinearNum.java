/**
 * PrintLinearNum
 */
public class PrintLinearNum {

    public static void main(String[] args) {
        printLinearNum(1, 4);
    }

    public static void printLinearNum(int i, int n){

        if(i>n)
            return;
        System.out.println(i);
        printLinearNum(i+1, n);

    }
}
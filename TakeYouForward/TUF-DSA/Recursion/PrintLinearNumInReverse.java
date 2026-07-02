public class PrintLinearNumInReverse {
    public static void main(String[] args) {
        printLinearNumRevers(5, 5); // f(n,n)
    }

    private static void printLinearNumRevers(int i, int n) {
        if(i<1)
            return;
        System.out.println(i);
        printLinearNumRevers(i-1, 5); // after print function called
    }
}

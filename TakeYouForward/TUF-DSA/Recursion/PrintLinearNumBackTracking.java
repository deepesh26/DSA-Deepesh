public class PrintLinearNumBackTracking {
    public static void main(String[] args) {
        printLinearNumBackTracking(3,3);
    }

    private static void printLinearNumBackTracking(int i, int n) {

        if(i<1)
            return;
        printLinearNumBackTracking(i-1, n); 
        // before print fun called when i+1 not allowed
        // what if i-1 also not allowed
        System.out.println(i);
        /* if (n == 0)
                return;

            print(n - 1);
            System.out.println(n); */



    }
}

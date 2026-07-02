public class ParameterisedRecursion {
    public static void main(String[] args) {
        // sum of first N number wher N =3
        int sum = getSum(3,0);
        System.out.println(sum);
    }

    private static int getSum(int i, int sum) {

        if(i<1)
            return sum;
        return getSum(i-1, sum+i);
    }
}

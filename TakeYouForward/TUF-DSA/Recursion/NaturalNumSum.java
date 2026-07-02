public class NaturalNumSum {
    public static void main(String[] args) {
        System.out.println(getNaturalNumSum(5));
    }
    
    public static int getNaturalNumSum(int n){
        if(n==1)
            return 1;
        return n+getNaturalNumSum(n-1);
        //(N * (N + 1)) / 2;
        
    }
}

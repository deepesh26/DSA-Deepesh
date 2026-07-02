public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        //int[] revArray = reversArray(arr);
       // int[] revArray = reversArrayUsingTwoPointer(arr);
       int[] revArray = reversArrayUsingOnePointer(0, arr, 4);
        for(int num: revArray){
            System.out.print(num+", ");
        }

        
    }
    private static int[] reversArrayUsingOnePointer(int i, int[] arr, int n) {
        if(i>=n/2) return arr;
        int temp = arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1] = temp; 
            return reversArrayUsingOnePointer(i+1, arr, n);
    }
    // Brute Force -1
    private static int[] reversArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            newArray[i] = arr[arr.length-1-i];
        }
        return newArray;
    }

    // using 2 pointer
    private static int[] reversArrayUsingTwoPointer(int[] arr) {
        // Initialize pointer to the beginning of the array
        int s = 0;
        // Initialize pointer to the end of the array
        int e = arr.length-1;
        // Loop until the two pointers meet in the middle
        while(s<e){
            // Swap the elements at s and e
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e] = temp;
            // Move the left pointer one step to the right
            s++;
            // Move the right pointer one step to the left
            e--;
        }
        return arr;
        
    }
}

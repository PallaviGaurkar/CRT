public class SubarrayOptimisation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int size = arr.length;
        int i = size;
        int k = 0;
        

        for ( i = 1; i <= arr.length; i++) {
            for(int j=k; j<=i-1; j++) {
            System.out.print(arr[j] + " ");
        }
        if(i==size && k<size) {
            k++;
            i = k;
        }
        System.out.println();
        }
    }
    
}

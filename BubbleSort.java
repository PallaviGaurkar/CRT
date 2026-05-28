public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {55, 4, 62, 8, 12};

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

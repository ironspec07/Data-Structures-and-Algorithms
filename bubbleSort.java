public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,19,11,20,1};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

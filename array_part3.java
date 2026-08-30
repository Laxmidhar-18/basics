public class array_part3 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7};

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]> max){
                max = arr[i];
                maxIndex = i;

            }
            
        }
        System.out.println("Max elements = " + max + " at index = "+ maxIndex );

    }
}

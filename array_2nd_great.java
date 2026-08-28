public class array_2nd_great {
    public static void main(String[] args) {

        int arr[] = {11,3,5,7,8};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax){
                 secMax = arr[i];
            }
        }
        System.out.println(secMax);

    }
}

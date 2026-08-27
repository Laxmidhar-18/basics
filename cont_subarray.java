public class cont_subarray {
    public static void main(String[] args) {
          int arr[]= {1,2,3,4,5};
          int sum=0,c=0;
          int n=arr.length;
          int target=12;
        for (int i = 0; i < n; i++) {
            sum=0;
            for (int j = i; j <n ; j++) {
                sum += arr[j];
                if(sum == target)c++;
            }
        }
        System.out.println(c);
    }
}

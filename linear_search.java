public class linear_search {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,7,6};
        int target=7;
        int n=arr.length,ans= -1;
        for (int i = 0; i <n ; i++) {
            if(arr[i] == target){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}

public class star_print {
    public static void main(String[] args) {
        int n=5;
        //outer loop - number of rows
        for (int i = 1; i<=n; i++){
            //inner loop - number of columns
            for(int j =1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}

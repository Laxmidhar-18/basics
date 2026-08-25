public class mirrored_star {
    public static void main(String[] args) {
        int n = 5;
        //outer loop - number of rows
        for(int i = 1; i <= n ; i++)
        {
            //inner loop - number of spaces
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" _ ");

            }
            for(int k =1 ; k <= i ; k++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
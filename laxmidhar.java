public class laxmidhar {
    public static void main(String[] args) {
        int n = 141;
        int original = n;
        int rev = 0;
        //while loop
        while (n > 0) {

            int ldg = n % 10;//last digit
            rev = (rev * 10) + ldg; // reverse number
            n /= 10; // n = n / 10;

        }

//        if (rev == original) {
//            System.out.println("strong number .");
//        }
//        else {
//            System.out.println("not strong number.");
//        }

        System.out.println(rev == original ? "palindrome." : "not a palindrome.");
    }

}

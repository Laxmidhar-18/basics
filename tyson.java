public class tyson
{
    public static void main(String[] args){
        int n=123;
        int copy=n;
        int rev=0;
        while(n>0){
            int lastdigit= n%10;
            rev = rev*10 + lastdigit;
            n/=10;

        }
        System.out.println(rev == copy ? "palindrome" : "not a palindrome number");
    }

}

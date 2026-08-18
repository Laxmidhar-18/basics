import java.util.Scanner;

public class guess_game {
   public  static void main(String[] args) {
       //guess game
       //1-100
       Scanner sc=(new Scanner(System.in));
       int randomnum = (int)(Math.random ()*100)+1;
       int guess=0;
       do {
           System.out.println("Guess the number between 1-100");
           guess = sc.nextInt();

           if (guess < randomnum)
               System.out.println("too less, guess thr higher number.");
           else if (guess > randomnum)
               System.out.println("too high , guess the lesser number.");
           else
               System.out.println("congratulation, you win the game!!");
       }while(guess != randomnum);

    }
}

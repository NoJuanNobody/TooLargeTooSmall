import java.util.Random;
import java.util.Scanner;

/**
 * Created by alejandrolondono on 4/28/16.
 */
public class TooLargeTooSmall {
/**
 *
 * guessing game
 *
 * user has to guess secret number
 * program tells user if num is too large or too small
 * keeps track of # of tries
 * keep track of previous try
 *
 */


    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner guess = new Scanner(System.in);

        int secret = randomNum.nextInt(100),
            guessNum = 0,
            lastGuess= 0,
            tries = 0;

        while(guessNum != secret){
            guessNum = guess.nextInt();
            if(lastGuess == guessNum){
                System.out.println("You already guessed that!");
            }
            tries ++;
            if(guessNum == secret ){
                System.out.println("you got the answer");
                System.out.println("Number of Tries: " + tries);
            } else if( guessNum > secret){
                System.out.println("too big!");
            }else{
                System.out.println("Too small!");
            }
            lastGuess = guessNum;
        }

    }

}

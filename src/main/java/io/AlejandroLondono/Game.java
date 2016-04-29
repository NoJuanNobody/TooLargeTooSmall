package io.AlejandroLondono;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by alejandrolondono on 4/28/16.
 */
public class Game {
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
    Random randomNum = new Random();
    public int secret = randomNum.nextInt(100);
    public int tries = 0;
    public int guess = 0;



    public void makeGuess(int theGuess){
        this.guess = theGuess;
        countTries();
    }

    public boolean equals(){
        boolean equal = this.secret == this.guess;
        if(equal){
            System.out.println("That is the right answer!");
//            return tries
        }else{
//          conditional
            if(tries !=0) {
                bigOrSmall();
            }
        }

        return equal;
    }
    public boolean bigOrSmall(){

        boolean tooBig = this.guess > this.secret;
        if(tooBig){
            System.out.println("your guess is too big");
        }else{
            System.out.println("your guess is too small");
        }

        return tooBig;
    }
    public int countTries(){
        return tries++;
    }

    public void run(){
        System.out.println("guess a number");
        Scanner guess = new Scanner(System.in);
        int guessNum;
        while(!equals()){

            guessNum = guess.nextInt();
            makeGuess(guessNum);
//            equals();


        }
    }

    public static void main(String[] args) {

        Game game = new Game();
        game.run();

    }

}

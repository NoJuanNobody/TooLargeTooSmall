package io.AlejandroLondono;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by alejandrolondono on 4/28/16.
 */
public class Game {

    Random randomNum = new Random();
    public int secret = randomNum.nextInt(100);
    public int tries = 0;
    public int guess = 0;
    public int lastGuess=-1;



    public void makeGuess(int theGuess){
        this.guess = theGuess;

        countTries();
    }

    public boolean equals(){
        boolean equal = this.secret == this.guess;
        if(equal){
            System.out.println("That is the right answer!");
            System.out.println("the number of tries are "+ tries);
        }else{
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

    public boolean checkPrevInput(){
        boolean consecutive = lastGuess == guess;
        if(consecutive){
            System.out.println("That is the same guess!");
        }
        return consecutive;
    }

    public void run(){
        System.out.println("guess a number");
        Scanner guess = new Scanner(System.in);
        int guessNum;
        while(!equals()){

            guessNum = guess.nextInt();
            if(checkPrevInput()){
                continue;
            }
            makeGuess(guessNum);

            lastGuess = guessNum;
        }
    }

    public static void main(String[] args) {

        Game game = new Game();
        game.run();

    }

}

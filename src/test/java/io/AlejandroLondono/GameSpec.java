package io.AlejandroLondono;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by alejandrolondono on 4/28/16.
 */
public class GameSpec {

    Game game = new Game();

    @Test
    public void makeGuessTest() {

        game.makeGuess(3);
        int expectedValue = 3;
        int actualValue = game.guess;
        assertEquals("the expected value is 3",expectedValue,actualValue);
    }


    @Test
    public void equalsTest(){
        Game gameEquals = new Game();
        gameEquals.secret = 20;
        gameEquals.makeGuess(20);
        boolean actualBool = gameEquals.equals();
        assertTrue("this should be true", actualBool);
    }

    @Test
    public void bigTest() {
        Game gameB= new Game();
        gameB.makeGuess(66);
        gameB.secret= 40;
        boolean condition = gameB.bigOrSmall();
        assertTrue("big or small knows when guess is bigger than secret", condition );
    }

    @Test
    public void smallTest() {
        Game gameS = new Game();
        gameS.makeGuess(20);
        gameS.secret= 40;
        boolean condition = gameS.bigOrSmall();
        assertFalse("big or small knows when guess is bigger than secret", condition );
    }

    @Test
    public void countTest(){
       int expectedValue = 1;
        game.countTries();
        int actualValue = game.tries;
        assertEquals("the number of tries should be 1", expectedValue, actualValue);
    }
}

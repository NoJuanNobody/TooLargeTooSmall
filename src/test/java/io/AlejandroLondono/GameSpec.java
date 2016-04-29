package io.AlejandroLondono;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by alejandrolondono on 4/28/16.
 */
public class GameSpec {

    Game game = new Game();

//    I need to use @before correctly in my tests.

    @Test
    public void setSecretTest(){
        int expectedValue = 5;
        game.setSecret(expectedValue);
        int actualValue = game.getSecret();
        assertEquals("the value should be 5", expectedValue, actualValue);
    }

    @Test
    public void getSecretTest(){
        int expectedValue = 4;
        game.setSecret(expectedValue);
        int actualValue = game.getSecret();
        assertEquals("the value should be 0", expectedValue, actualValue);
    }

    @Test
    public void makeGuessTest() {

        game.makeGuess(3);
        int expectedValue = 3;
        int actualValue = game.getGuess();
        assertEquals("the expected value is 3",expectedValue,actualValue);
    }

    @Test
    public void getGuessTest(){
        int expectedValue = 0;
        int actualValue = game.getGuess();
        assertEquals("the value should be 0", expectedValue, actualValue);
    }

    @Test
    public void setGuessTest(){
        int expectedValue = 5;
        game.setGuess(expectedValue);
        int actualValue = game.getGuess();
        assertEquals("the value should be 5", expectedValue, actualValue);
    }

    @Test
    public void equalsTest(){
        Game gameEquals = new Game();
        gameEquals.setSecret(20);
        gameEquals.makeGuess(20);
        boolean actualBool = gameEquals.equals();
        assertTrue("this should be true", actualBool);
    }

    @Test
    public void bigTest() {
        Game gameB= new Game();
        gameB.makeGuess(66);
        gameB.setSecret(40);
        boolean condition = gameB.bigOrSmall();
        assertTrue("big or small knows when guess is bigger than secret", condition );
    }

    @Test
    public void smallTest() {
        Game gameS = new Game();
        gameS.makeGuess(20);
        gameS.setSecret(40);
        boolean condition = gameS.bigOrSmall();
        assertFalse("big or small knows when guess is bigger than secret", condition );
    }

//    get and set tries

    @Test
    public void countTest(){
       int expectedValue = 1;
        game.countTries();
        int actualValue = game.getTries();
        assertEquals("the number of tries should be 1", expectedValue, actualValue);
    }

    @Test
    public void getTriesTest(){
        int expectedValue = 0;
        int actualValue = game.getTries();
        assertEquals("the value should be 0", expectedValue, actualValue);
    }

    @Test
    public void setTriesTest(){
        int expectedValue = 5;
        game.setTries(expectedValue);
        int actualValue = game.getTries();
        assertEquals("the value should be 5", expectedValue, actualValue);
    }

    @Test
    public void checkPrevInputsTest() {
        Game gameI= new Game();
        gameI.setGuess(66);
        gameI.lastGuess= 66;
        boolean condition = gameI.checkPrevInput();
        assertTrue("big or small knows when guess is bigger than secret", condition );
    }

}

package test.com.stackroute.practise_exercise3;

import main.java.com.stackroute.practise_exercise3.ChessBoardPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern chessBoardPattern;

    @Before
    public void setUp() {
        chessBoardPattern = new ChessBoardPattern();
    }

    @Test
    public void printsCheckBoard() {
        String[][] result = chessBoardPattern.chessBoard();
        assertArrayEquals(new String[][]{{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}
                , {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}}, result);
    }
    @After
    public void tearDown(){

        chessBoardPattern=null;
    }
}


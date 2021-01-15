package it.unimol.sokoban.World;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board = new Board();
    @Test
    void getBoardWidth() {
        int expected = 430;
        int actual = board.getBoardWidth();

        assertEquals(expected,actual);
    }

    @Test
    void getBoardHeight() {
        int expected = 250;
        int actual = board.getBoardHeight();

        assertEquals(expected,actual);
    }
}
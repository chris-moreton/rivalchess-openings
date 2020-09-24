package com.netsensia.rivalchess.openings;

import com.netsensia.rivalchess.model.Board;
import com.netsensia.rivalchess.model.Move;
import com.netsensia.rivalchess.model.util.BoardUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class OpeningLibraryTest {

    @Test
    public void testSpecificMoves() {
        for (int i=0; i<1000; i++) {
            assertTrue(Arrays.asList("b8c6", "g7g6", "a7a6")
                    .contains(OpeningLibrary.getMove(
                            OpeningLibrary.E2E4_C7C5_G1F3_D7D6_D2D4_C5D4_F3D4_G8F6_B1C3).toString()));
        }
    }

    @Test
    public void testAllMovesAreLegal() {
        for (OpeningPosition opening : OpeningLibrary.getOpenings()) {
            final Board board = Board.fromFen(opening.getFen());
            final List<Move> legalMoves = BoardUtils.getLegalMoves(board);
            assertTrue(legalMoves.contains(opening.getMove()));
        }
    }

    @Test
    public void testRandomSeed() {
        for (int i=0; i<1000; i++) {
            assertEquals("a7a6", OpeningLibrary.getMove(123,
                            OpeningLibrary.E2E4_C7C5_G1F3_D7D6_D2D4_C5D4_F3D4_G8F6_B1C3).toString());
        }
        final HashMap<String, Boolean> map = new HashMap();

        for (int i=0; i<1000; i++) {
            final String move = OpeningLibrary.getMove(
                    OpeningLibrary.E2E4_C7C5_G1F3_D7D6_D2D4_C5D4_F3D4_G8F6_B1C3).toString();
            map.put(move, true);
        }
        assertTrue(map.get("b8c6"));
        assertTrue(map.get("g7g6"));
        assertTrue(map.get("a7a6"));
    }
}

package com.netsensia.rivalchess.openings;

import org.junit.Test;

import java.util.Arrays;

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
}

package com.netsensia.rivalchess.openings;

import com.netsensia.rivalchess.model.Move;

public class OpeningPosition 
{
	private final String fen;
	private final Move move;
	private final int frequency;
	
	public OpeningPosition(final String fen, final Move move, final int frequency)
	{
		this.fen = fen;
		this.move = move;
		this.frequency = frequency;
	}

	public String getFen() {
		return fen;
	}

	public Move getMove() {
		return move;
	}

	public int getFrequency() {
		return frequency;
	}
}

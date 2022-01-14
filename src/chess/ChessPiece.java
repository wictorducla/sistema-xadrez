package chess;

import boardgame.Piece;
import boardgame.Position;
import boardgame.Board;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean temUmaPecaOponente(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}

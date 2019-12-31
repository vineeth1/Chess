import java.awt.Point;
import java.util.ArrayList;

public abstract class Validator {
	PieceTypeEnum pieceType;

	public PieceTypeEnum getPieceType() {
		return pieceType;
	}

	public void setPieceType(PieceTypeEnum pieceType) {
		this.pieceType = pieceType;
	}

	public abstract boolean validate(Point from, Point to, ArrayList<ArrayList<Piece>> board);
}

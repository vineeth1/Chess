import java.awt.Point;
import java.util.ArrayList;

public class Board {
	private ArrayList<ArrayList<Piece>> board;

	public ArrayList<ArrayList<Piece>> getBoard() {
		return board;
	}

	public Board() {
		super();
	}
	
	public boolean pointValidate(Point from, Point to) {
		if (from.x > 8 || from.x < 1 || to.x > 8 || to.x < 1 ||
			from.y > 8 || from.y < 1 || to.y > 8 || to.y < 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean move(Point from, Point to, ColorEnum turn) {
		if (pointValidate(from, to)) {
			Piece fromPiece = board.get(from.x - 1).get(from.y - 1);//[from.x - 1][from.y - 1];
			fromPiece.getValidator().validate(from, to, board);
			
			return true;
			
		} else {
			System.out.println("Out of board points");
			return false;
		}
	}
}

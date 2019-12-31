import java.awt.Point;
import java.util.Scanner;

public class Game {
	private Board board;
	private ColorEnum turn;
	
	public Game(Board board) {
		super();
		this.board = board;
		this.turn = ColorEnum.WHITE;
	}
	
	public Board getBoard() {
		return board;
	}

	public ColorEnum getTurn() {
		return turn;
	}


	public void setTurn(ColorEnum turn) {
		this.turn = turn;
	}


	public static void main(String[] args) {
		Game game = new Game(new Board());
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------Welcome to Chess------------");
		while (true) {
			
			System.out.println("Current Board = " + game.getBoard());
			System.out.println("Current turn = " + game.getTurn());

			Point from, to;
			
			from = new Point(scanner.nextInt(), scanner.nextInt());
			to = new Point(scanner.nextInt(), scanner.nextInt());
			
			if (game.getBoard().move(from, to, game.getTurn())) {
				
				if (game.getTurn().equals(ColorEnum.BLACK)) {
					game.setTurn(ColorEnum.WHITE);
				} else {
					game.setTurn(ColorEnum.BLACK);
				}
			}
		}
	}
}

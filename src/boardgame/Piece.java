package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		
		this.board = board;
		
		position =null;
	}

	// methods getters and setters
	protected Board getBoard() {
		return board;
	}


	
	
	
	}
	
	


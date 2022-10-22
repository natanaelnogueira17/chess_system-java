package boardgame;

public class Position {
	private int row;
	private int collumn;
	
	//constructors
	public Position() {
		super();
	}
	public Position(int row, int collumn) {
		super();
		this.row = row;
		this.collumn = collumn;
	}
	
	//getters and setters
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCollumn() {
		return collumn;
	}
	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}
	
	
	@Override
	public String toString() {
		return  row + ", " + collumn ;
	}
	
	
}

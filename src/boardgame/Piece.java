package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Assim somente classes do mesmo pacote e subclasse que poderão acessar o tabuleiro de uma peça
	//o tabuleiro é de uso interno da camada de tabuleiro
	protected Board getBoard() {
		return board;
	}

}

package chess;

import boardgame.Board;

public class ChessMatch {
//Classe que obtém as regras do jogo
	
	private Board board;
	
	//Determina as dimensões do tabuleiro
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//retorna uma matriz de peças de xadrez correspondente a partida
	//libera para a camada Program as peças do tipo ChessPiece
	//o programa enxerga apenas as peças do xadrez e não a do tabuleiro
	public ChessPiece[][] getPieces(){
		//para que o programa conheça apenas a camada de xadrez e não a camada de tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				//para interpretar como uma peça de xadrez se faz um downcastch
				//não interpreta como uma peça comum
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}

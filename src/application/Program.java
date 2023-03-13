package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {


		ChessMatch chessMatch = new ChessMatch();
		//função para imprimir as peças da partida
		//Classe UI método printBoard
		UI.printBoard(chessMatch.getPieces());
	}

}

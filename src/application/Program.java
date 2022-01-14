package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ChessMatch partidaDeXadrez = new ChessMatch();
		
		while (true) {
			try {
				UI.limparTela();
				UI.printBoard(partidaDeXadrez.getPieces());
				System.out.println();
				System.out.print("\nOrigem: ");
				ChessPosition origem = UI.readChessPosition(ler);
				
				boolean[][] movimentosPossiveis = partidaDeXadrez.movimentosPossiveis(origem);
				UI.limparTela();
				UI.printBoard(partidaDeXadrez.getPieces(), movimentosPossiveis);
				
				System.out.println();
				System.out.print("Alvo: ");
				ChessPosition alvo = UI.readChessPosition(ler);
				
				ChessPiece pecaCapturada = partidaDeXadrez.performChessMove(origem, alvo);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				ler.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				ler.nextLine();
			}
		}
	}
}

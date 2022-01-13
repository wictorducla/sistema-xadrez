package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.ExcecaoXadrez;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoXadrez;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		
		while (true) {
			try {
				UI.limparTela();
				UI.printTabuleiro(partidaDeXadrez.getPecas());
				System.out.println();
				System.out.print("\nOrigem: ");
				PosicaoXadrez origem = UI.lerPosicaoXadrez(ler);
				
				System.out.println();
				System.out.print("Alvo: ");
				PosicaoXadrez alvo = UI.lerPosicaoXadrez(ler);
				
				PecaDeXadrez pecaCapturada = partidaDeXadrez.movimentoXadrez(origem, alvo);
			}
			catch(ExcecaoXadrez e) {
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

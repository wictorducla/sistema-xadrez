package aplicacao;

import java.util.Scanner;

import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoXadrez;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
		
		while (true) {
			UI.printTabuleiro(partidaDeXadrez.getPecas());
			System.out.println();
			System.out.println("Origem: ");
			PosicaoXadrez origem = UI.lerPosicaoXadrez(ler);
			
			System.out.println();
			System.out.println("Alvo: ");
			PosicaoXadrez alvo = UI.lerPosicaoXadrez(ler);
			
			PecaDeXadrez pecaCapturada = partidaDeXadrez.movimentoXadrez(origem, alvo);

		}
	}
}

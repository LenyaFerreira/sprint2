package questao3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class determinacaoSentimentoEmoticon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Qual é a frase?");
		String frase = input.nextLine();
		
		String[] fraseCortada = frase.split("(\\?<=:| |a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z|,|1|2|3|4|5|6|7|8|9|0|\\?<=!|\\?<=!*|\\?<=?|\\?<=)");
		
		//for (int i =0; i<fraseCortada.length; i++) {
		//	System.out.println(fraseCortada[i]);
		//	}
		
		String caraFeliz = ":-)";
		String caraTriste = ":-(";
		
		int contadorFeliz = 0;
		int contadorTriste = 0;
		
		for (int i = 0; i<fraseCortada.length; i++) {
			if (fraseCortada[i].equals(caraFeliz)) {
				contadorFeliz++;
			} else {
				if (fraseCortada[i].equals(caraTriste)) {
					contadorTriste++;
				}
			}
		}
		
		if (contadorTriste > contadorFeliz) {
			System.out.println("Chateado");
		} else {
			if (contadorFeliz > contadorTriste) {
				System.out.println("Divertido");
			} else {
				System.out.println("Neutro");
			}
		}
		
		
		
		input.close();
	}

}

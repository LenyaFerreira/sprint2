package questao3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class determinacaoSentimentoBackup {

	public static void main(String[] args) {

		String frase = ":-) a:-) :-)a";
		
		String[] algarismos = {"a","b","c"};
		
		String[] fraseCortada = frase.split("(?=-)");
		

		for (int i =0; i<fraseCortada.length; i++) {

			
			
			}
		
		fraseCortada = frase.split("a");
		fraseCortada = frase.split(" ");
		
		
		for (int i =0; i<fraseCortada.length; i++) {
			System.out.println(fraseCortada[i]);
			}
		
		System.out.println("   ---   ");
		
		//for (int i=0; i<algarismos.length; i++) {
			//fraseCortada = frase.split(algarismos[i]);
		//}
		
	
		
		for (int i =0; i<fraseCortada.length; i++) {
			System.out.println(fraseCortada[i]);
			}
		
		
		
			
		
		
		String cara = ":-)";
		
		
		
		int contador = 0;
		
		for (int i = 0; i<fraseCortada.length; i++) {
			if (fraseCortada[i].equals(cara)) {
				contador++;
			}
		}
		
		System.out.println(contador);
		
		
		
		
	}

}

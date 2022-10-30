package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class determinacaoSentimento2 {

	public static void main(String[] args) {

		String frase = ":-) a:-) :-)a";
		
		//String[] algarismos = {"a","b","c"};
		
		List<String> fraseCortada = new ArrayList<>();
		fraseCortada.add("teste");
		String[] fraseCortadaArray = frase.split("(?=-)");
		

		
	//	fraseCortada = frase.split("a");
	//	fraseCortada = frase.split(" ");
		
		
	//	for (int i =0; i<fraseCortada.length; i++) {
	//		System.out.println(fraseCortada[i]);
	//		}
		
	//	System.out.println("   ---   ");
		
		//for (int i=0; i<algarismos.length; i++) {
			//fraseCortada = frase.split(algarismos[i]);
		//}
		
	
		
	//	for (int i =0; i<fraseCortada.length; i++) {
	//		System.out.println(fraseCortada[i]);
	//		}
		
		
		
			
		
		
		String cara = ":-)";
		
		
		
		int contador = 0;
		
		//for (int i = 0; i<fraseCortada.length; i++) {
		//	if (fraseCortada[i].equals(cara)) {
				contador++;
		//	}
	//	}
		
		System.out.println(contador);
		
		
		
		
	}

}

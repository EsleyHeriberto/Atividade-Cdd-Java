package cddAtividade;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra ou uma frase:");
		String resposta = entrada.nextLine();
		
		String resultado = resposta.toUpperCase();
		System.out.println(resultado);

	}

}

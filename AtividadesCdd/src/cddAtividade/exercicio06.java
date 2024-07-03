package cddAtividade;

public class exercicio06 {

	public static void main(String[] args) {
		
		String palavras[] = {"a","vida","é","bela"};
		
		StringBuilder texto = new StringBuilder();
		for(String a : palavras) {
			texto.append(a).append(" ");
		}
		
		String resultado = texto.toString().toUpperCase();
		
		System.out.println(resultado);

	}

}

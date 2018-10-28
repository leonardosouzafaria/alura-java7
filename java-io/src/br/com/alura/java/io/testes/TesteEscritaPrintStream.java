package br.com.alura.java.io.testes;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {
	
	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("arquivo2.txt");
		
		ps.println("Agora ficou mais fácil");
		ps.println();
		ps.println();
		ps.println("Agora eu vou destruir nos testes");
		
		ps.close();
	}

}

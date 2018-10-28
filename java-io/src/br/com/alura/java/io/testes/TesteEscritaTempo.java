package br.com.alura.java.io.testes;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaTempo {

	public static void main(String[] args) throws IOException {
		
		long inicio = System.currentTimeMillis();
		
		PrintStream ps = new PrintStream("arquivo2.txt");
		
		ps.println("Testando o tempo");
		ps.println();
		ps.println();
		ps.println("Em milisegundos");
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("O tempo que levou para escrever o arquivo foi de: " + (fim - inicio) + "milissegundos");
	}

}

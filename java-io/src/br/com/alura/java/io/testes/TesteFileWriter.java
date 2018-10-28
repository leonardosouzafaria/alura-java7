package br.com.alura.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {
		
	public static void main(String[] args) throws IOException {
		
		FileWriter fw  = new FileWriter("arquivo2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Meu nome é Leonardo de Souza Faria");
		bw.newLine();
		bw.write("Gostaria de trocar de emprego");
		
		bw.close();
		
	}

}

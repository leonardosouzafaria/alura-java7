package br.com.alura.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main (String[] args) throws IOException {
		
		//Fluxo de saída
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer isw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(isw);
		
		bw.write("Leonardo de Souza Faria, sou mais vc monstrão.");
		
		bw.close();
	}

}

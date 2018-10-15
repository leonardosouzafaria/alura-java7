package br.com.alura.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;


public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {

		//Entrada
		InputStream fis = new FileInputStream("arquivo.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//Saída
		OutputStream fos = new FileOutputStream("arquivo2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//Copiando
		String linha = br.readLine();

		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();

	}

}

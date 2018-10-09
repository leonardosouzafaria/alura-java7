package br.com.alura.java.io.testes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada
		
		FileInputStream fis = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();
		
	}

}

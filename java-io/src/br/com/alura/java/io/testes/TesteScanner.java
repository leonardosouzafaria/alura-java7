package br.com.alura.java.io.testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(new File("contas.csv"));

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
			}
			
			scanner.close();

//			System.out.println(linha);

		} catch (FileNotFoundException e) {

			System.out.println("Não foi possível encontrar o arquivo");
			
			System.out.println(e.getMessage());

		}
	}

}

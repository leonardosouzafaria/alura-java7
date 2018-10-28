package br.com.alura.java.io.testes;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner2 {

	public static void main(String[] args) {

		try {

			Scanner scanner = new Scanner(new File("contas.csv"));

			while (scanner.hasNextLine()) {
				
				String linha = scanner.nextLine();
				
				Scanner linhaScanner = new Scanner(linha);
				linhaScanner.useLocale(Locale.US);
				linhaScanner.useDelimiter(",");
				
				
				
				String valor1 = linhaScanner.next();
				int valor2 = linhaScanner.nextInt();
				int valor3 = linhaScanner.nextInt();
				String valor4 = linhaScanner.next();
				Double valor5 = linhaScanner.nextDouble();
				
				System.out.println( valor1 + valor2 + valor3 + valor4 + valor5);

				linhaScanner.close();
			}
			
			scanner.close();

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());

		}

	}

}

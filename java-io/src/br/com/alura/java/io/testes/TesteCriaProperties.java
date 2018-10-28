package br.com.alura.java.io.testes;

import java.io.PrintStream;
import java.util.Properties;

public class TesteCriaProperties {
	
	public static void main(String[] args) {
		
		//Criando o objeto
		Properties props =  new Properties();
		//Criando os campos e valores
		props.setProperty("login", "antonio");
		props.setProperty("senha", "123456");
		props.setProperty("endereco", "localhost");
		
		//Criando arquivo de properties
		try {
			
			props.store( new PrintStream("conf.properties"), "Meu primeiro arquivo properties");
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		
	}

}

package br.com.alura.java.io.testes;

import java.io.FileReader;
import java.util.Properties;

public class TesteLeituraProperties {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		try {
			//Lendo arquivo
			props.load(new FileReader("conf.properties"));
			
			//Pegando as properties
			String login = props.getProperty("login");
			String senha = props.getProperty("senha");
			String endereco = props.getProperty("endereco");
			
			System.out.format(" Login: %s %n Senha: %s %n Endereco: %s", login, senha, endereco);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

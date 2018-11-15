package br.com.alura.java.io.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		String nome = "Leonardo";
		
		//Serializando a String
		ObjectOutputStream obj = new ObjectOutputStream( new FileOutputStream("obj.bin"));
		obj.writeObject(nome);
		obj.close();
		
		//Deserializando
		ObjectInputStream objInput = new ObjectInputStream( new FileInputStream("obj.bin"));
		String objDeserializado = (String) objInput.readObject();
		System.out.println(objDeserializado);
		objInput.close();
		
	}
}
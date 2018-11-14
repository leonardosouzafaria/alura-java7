package br.com.alura.java.io.testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) {

		// Escrita normal
		String str = "13º Órgão Oficial";
		System.out.println(str);

		// Descobrindo o unicode da primeira letra
		System.out.println(str.codePointAt(0));

		// Descobrindo o Charset default
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		// Convertendo os bytes;
		try {

			// Windows-1252
			byte[] bytes = str.getBytes("windows-1252");
			System.out.println("Charset Windows-1252 \n" + 
					"Bytes = " + bytes.length );
			String nStr = new String(bytes);
			System.out.println(nStr);
			nStr = new String(bytes, "windows-1252");
			System.out.println(nStr + "\n");
			
			// UTF-16
			bytes = str.getBytes("UTF-16");
			System.out.println("Charset UTF-16 \n" + 
					"Bytes = " + bytes.length);
			nStr = new String(bytes);
			System.out.println(nStr);
			nStr = new String(bytes, "UTF-16");
			System.out.println(nStr + "\n");

			//UTF-8
			bytes = str.getBytes("UTF-8");
			System.out.println("Charset UTF-8 \n" + 
					"Bytes = " + bytes.length);
			nStr = new String(bytes);
			System.out.println(nStr);
			nStr = new String(bytes, "UTF-8");
			System.out.println(nStr + "\n");
			
			
			//US_ASCII
			bytes = str.getBytes(StandardCharsets.US_ASCII);
			System.out.println("Charset US_ASCII \n" + 
					"Bytes = " + bytes.length );
			nStr = new String(bytes);
			System.out.println(nStr);
			nStr = new String(bytes, StandardCharsets.US_ASCII);
			System.out.println(nStr + "\n");

		} catch (UnsupportedEncodingException e) {
			System.out.println("Charset não suportado nesse sistema operacional");
		}

	}

}

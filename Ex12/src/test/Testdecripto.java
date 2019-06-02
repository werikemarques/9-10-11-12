package test;

import java.io.File;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

import org.junit.Test;

import cryptografia.Criptografia;

public class Testdecripto {

	
	@Test
	public void teste() {
		for (int i = 0; i < 5; i++) {
		final String secretKey = "PDQ";
	     
	    String originalString = "1234";
	    String encryptedString = Criptografia.encrypt(originalString, secretKey);
	    String decryptedString = Criptografia.decrypt(encryptedString, secretKey);
	     
	    //System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
		}
	}
}

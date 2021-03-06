package src.main.java.model.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import src.main.java.model.Url;

/**
 * Classe de tests de la classe Url
 * @author Romiche
 *
 */
public class TestUrl {

	final Url url = new Url("https://fr.wikipedia.org/wiki/Coupe du monde de football");

	/**
	 * Test de la m�thode isValidUrl() 
	 * Sur un url valide
	 * @return true
	 */
	@Test
	public void TestValidUrl() {
		assertTrue(url.isValidUrl());
	}

	/**
	 * Test de la m�thode isValidUrl() 
	 * Sur un url � redirig�
	 * @return true
	 */
	@Test
	public void TestRedirectUrl() {
		Url url = new Url("http://fr.wikipedia.org/wiki/Coupe_du_monde_de_football"); // Lien redirigé
		assertTrue("Lien redirig�", url.isValidUrl());
	}

	/**
	 * Test de la m�thode isValidUrl() 
	 * Sur un url non valide
	 * @return false
	 */
	@Test
	public void TestNonValidUrl() {
		Url url = new Url("http://fr.wikipedia.org/wiki/Coupe de football"); // Lien non valide
		assertFalse("Lien non valide", url.isValidUrl());
	}
	
	@Test
	public void TestToHTML() throws IOException{
		System.out.println(url.HTML());
		
	}
}

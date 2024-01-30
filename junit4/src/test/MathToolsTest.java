package test;

import  org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import dev.MathTools;
//Créer le package : ma.junit4.tp.test qui va contenir les classes de test

public class MathToolsTest {
//	Créer un attribut de type MathTools dans la classe MathToolsTest 
	MathTools mathTools;
	
//	et l'instancier dansla méthode @Before 
	@Before
	public void setUp() throws Exception {
		mathTools=new MathTools();
	}
	
//	Utiliser des AssertXYZ pour automatiser les tests des deux méthodes triple et soustraction.
	
	@Test
	public void testTriple() {
		double expected=mathTools.triple(3.0);
		double local=9.0;
		assertEquals(local,expected,0.0);
	}
	@Test
	public void testSoustract() {
		int expected=mathTools.soustraction(10,19);
		int local=-9;
		assertEquals(local,expected,0);
	}
	
//	puis le libérer dans @After .
	@After
	public void tearDown() throws Exception {
		mathTools=null;
	}

	
	
	
}

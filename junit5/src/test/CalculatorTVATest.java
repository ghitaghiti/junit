package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.CalculatorTVA;

class CalculatorTVATest {

	CalculatorTVA clctva;
	@BeforeEach
	void setUp() throws Exception {
		clctva=new CalculatorTVA();
	}
	
	@Test
	void testMaroc() {
		double resultaattendu=10.0;
		double expected=clctva.calculerTVA(100,"Maroc", "repas");
		assertEquals(resultaattendu,expected,0.0);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		clctva=null;
		
	}

	

}

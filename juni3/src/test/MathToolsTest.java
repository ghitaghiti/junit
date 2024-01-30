package test;

import dev.MathTools;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import test.MathToolsTest;

public class MathToolsTest extends TestCase{
	MathTools mathTools;
	
	public static Test suite(){
		return new TestSuite(MathToolsTest.class);
	}
	
	public void setUp() {
		mathTools=new MathTools();
	}
	

	public void tearDown() {
		
	}
	
	public void testCarre() {
		double expected = mathTools.carre(5.0);
		double local=25.0;
		assertEquals("error",expected,local);
	}

}

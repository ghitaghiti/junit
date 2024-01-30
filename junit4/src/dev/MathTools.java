package dev;

//Créer  package dev qui va contenir les classes du TP
public class MathTools {
	
//	 Créer la classe MathTools dans le package dev et qui contient deux méthodes :
//		(a) public double triple(double n) : qui prend comme argument un double et retourne
//		son triple.
//		(b) public int soustraction(int a, int b) : qui calcule la soustraction de deux entiers.
//	 Créer le corps de la classe MathToolsTest dans le package test, en utilisant eclipse :
//		(a) File => New => Other... => Java => JUnit => JUnit Test Case (cocher la case
//		JUnit 4)
	
	public double triple(double n) {
		return n*3;
	}

	public int soustraction(int a, int b) {
		return a-b;
	}
}

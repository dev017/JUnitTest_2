package ma.exemple.junit.first;

//Classe � tester
public class MyClass {

	// M�thode � tester
	public int multiply(int x, int y) {
		if (x > 1000) {
			throw new IllegalArgumentException("X doit �tre inf�rieur � 1000");
		}
		return x / y;
	}
}

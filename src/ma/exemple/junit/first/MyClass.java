package ma.exemple.junit.first;

//Classe à tester
public class MyClass {

	// Méthode à tester
	public int multiply(int x, int y) {
		if (x > 1000) {
			throw new IllegalArgumentException("X doit être inférieur à 1000");
		}
		return x / y;
	}
}

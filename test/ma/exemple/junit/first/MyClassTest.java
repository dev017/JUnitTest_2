package ma.exemple.junit.first;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

// Utilisation des param�tre lors des testes
@RunWith(Parameterized.class)
public class MyClassTest {

	// @Parameter : Est utilis� pour annoter des attributs qui seront utilis�s lors des testes.
	// L'attribut doit �tre PUBLIC !
	@Parameter(value = 0) // Value = 0 -> Valeur de la case 0 du tableau
	public int m1;

	@Parameter(value = 1) // Value = 1 -> Valeur de la case 1 du tableau
	public int m2;

	// @Parameters (avec S � la fin): Annot� une m�thode static qui retourne un tableau,
	// Chaque �l�ment de cette collection est utilis� comme param�tre pour la m�thode d'essai.
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2 }, { 5, 3 }, { 121, 4 } };
		return Arrays.asList(data);
	}

	@Test
	public void testMultiplyException() {
		MyClass tester = new MyClass();
		assertEquals("Result", m1 * m2, tester.multiply(m1, m2));
	}

	// Classe de test
	class MyClass {

		// M�thode � tester
		public int multiply(int i, int j) {
			return i * j;
		}
	}

}

package utiles;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testDados() {
		int datos[] = Util.dados();
		assert(datos != null);
		assert(datos[0] > 0);
		assert(datos[1] > 0);
	}

}

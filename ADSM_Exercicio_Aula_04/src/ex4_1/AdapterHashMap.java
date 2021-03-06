package ex4_1;
import java.util.HashMap;

@SuppressWarnings({ "serial", "rawtypes" })
public class AdapterHashMap extends HashMap {

	@SuppressWarnings("unchecked")
	public AdapterHashMap(Object[][] pares) {
		if (pares.length != 2)
			throw new IllegalArgumentException();

		Object[] chaves = pares[0];
		Object[] colunas = pares[1];

		for (int i = 0; i < chaves.length; i++)
			put(chaves[i], colunas[i]);
	}
}
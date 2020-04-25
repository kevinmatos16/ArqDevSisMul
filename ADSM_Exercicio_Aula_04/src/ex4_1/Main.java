package ex4_1;

import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Object[][] pares = new String[][] { { "COR", "SAO", "SAN", "PAL", "FLA", "FLU" }, { "Corinthians", "Sao Paulo", "Santos", "Palmeiras", "Flamengo", "Fluminense" } };


		@SuppressWarnings("rawtypes")
		Map adap = new AdapterHashMap(pares);

		for (@SuppressWarnings("rawtypes")
		Iterator iter = adap.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
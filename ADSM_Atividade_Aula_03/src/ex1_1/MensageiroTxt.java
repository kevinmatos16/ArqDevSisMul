package ex1_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MensageiroTxt implements Mensageiro {

	@Override
	public void escrever() {
		try {
			PrintWriter writer = new PrintWriter("mensagem.txt");
			writer.write("Hello World!");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
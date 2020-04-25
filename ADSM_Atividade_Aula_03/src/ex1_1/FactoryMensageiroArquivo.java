package ex1_1;


public class FactoryMensageiroArquivo implements FactoryMensageirosTxt {

	@Override
	public Mensageiro getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new MensageiroTxt();
		}
		return null;
	}

}
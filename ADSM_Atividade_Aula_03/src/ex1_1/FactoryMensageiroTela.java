package ex1_1;

public class FactoryMensageiroTela implements FactoryMensageirosTxt {

	@Override
	public Mensageiro getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new MensageiroTxtTela();
		}
		return null;
	}

}
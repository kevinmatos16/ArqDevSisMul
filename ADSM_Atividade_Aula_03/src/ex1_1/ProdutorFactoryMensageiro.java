package ex1_1;

public final class ProdutorFactoryMensageiro {
	private ProdutorFactoryMensageiro() {
	}
	
	public static FactoryMensageirosTxt getFactory() {
		int numero = (int)(100000*Math.random());
		numero = numero%2;
		if (numero == 0) {
			return getFactory("TELA");
		} else {
			return getFactory("ARQUIVO");
		}
	}
	
	private static FactoryMensageirosTxt getFactory(String typeFac) {
		switch(typeFac) {
		case "TELA":
			return new FactoryMensageiroTela();
		case "ARQUIVO":
			return new FactoryMensageiroArquivo();
		}
		return null;
	}
}
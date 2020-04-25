package ex1_1;

public class TestePrograma {

	public static void main(String[] args) {
		FactoryMensageirosTxt fabrica = ProdutorFactoryMensageiro.getFactory();
		Mensageiro msg = fabrica.getInstance("HELLO");
		msg.escrever();
	}

}
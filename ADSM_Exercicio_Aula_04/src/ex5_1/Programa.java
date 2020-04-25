package ex5_1;


public class Programa {

	public static void main(String[] args) {

		String arquivo = "Teste";
		IOFacade io = new IOFacade();
		io.abrirTexto(arquivo);
		io.abrirBinario(arquivo);
		io.abrirObjeto(arquivo);
	}

}
package ex6_1;

public class MensagemSemana implements MensagemDoDia{

	private String diaDaSemana;
	public String escolhe(String dia) {
		diaDaSemana = dia;
		return diaDaSemana;
	}
	@Override
	public void imprimir() {
		System.out.println("Hoje é "+diaDaSemana);
		
	}

}
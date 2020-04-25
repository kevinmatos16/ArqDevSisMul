package ex6_1;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(System.currentTimeMillis()));
		int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
		MensagemSemana mensagem = new MensagemSemana();
		String dia = null;
		
		switch (diaSemana) {
		case Calendar.SUNDAY:
			dia = "domingo.";
			mensagem.escolhe(dia);
			break;
		case Calendar.MONDAY:
			dia = "segunda-feira.";
			mensagem.escolhe(dia);
			break;
		case Calendar.TUESDAY:
			dia = "terça-feira.";
			mensagem.escolhe(dia);
			break;
		case Calendar.WEDNESDAY:
			dia = "quarta-feira.";
			mensagem.escolhe(dia);
			break;
		case Calendar.THURSDAY:
			dia = "quinta-feira.";
			mensagem.escolhe(dia);
			break;
		case Calendar.FRIDAY:
			dia = "sexta-feira.";
			mensagem.escolhe(dia);
			break;
		case Calendar.SATURDAY:
			dia = "sábado.";
			mensagem.escolhe(dia);
			break;
		}

		mensagem.imprimir();
	}
}
package ex_8_2;

import java.util.ArrayList;
import java.util.List;

/*
 * O agregador por m�s concatena todas as not�cias do mesmo m�s e,
 *  apenas quando chega uma not�cia de um m�s diferente, envia a string
 *  concatenada para seus assinantes com o dia zero e o t�pico �mensal�.
 */
public class AgregadorMensal implements ConsomeNoticia {
	int mesCorrente = 0;
	List<Conteudo> conteudos = new ArrayList<>();
	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		Conteudo c = new Conteudo(textoNoticia, dia, mes, topico);
		if (mesCorrente == 0) {
			mesCorrente = mes;
			conteudos.add(c);
		} else {
			if (mesCorrente == mes) {
				conteudos.add(c);
			} else {
				System.out.println("Mudou o m�s, seguem as noticias");
				for (Conteudo conteudo : conteudos) {
					System.out.println(conteudo);
				}
				conteudos.clear();
				mesCorrente = mes;
				conteudos.add(c);
			}
		}
	}

}
package ex_8_1;

public class Programa {
	public static void main(String[] args) {

		Noticiario noticiario = new NoticiarioAssina(null);
		noticiario.notificaNoticia("Nova invenção", 1, 1, "Tecnologia");
		/*noticiario.notificaNoticia("Receita incrivel", 2, 1, "Culinaria");
		noticiario.notificaNoticia("Hospital é inalgurado", 4, 1, "Politica");
		noticiario.notificaNoticia("Novo jogo sai hoje", 5, 1, "Jogos");
		noticiario.notificaNoticia("Robos com inteligencia artificial", 8, 1, "Tecnologia");
		noticiario.notificaNoticia("Filme estreia essa semana", 10, 1, "Cinema");*/
	}
}
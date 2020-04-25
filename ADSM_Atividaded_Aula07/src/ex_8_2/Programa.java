package ex_8_2;

public class Programa {
	public static void main(String[] args) {
//		Publicador publicador = new Publicador();
		ConsomeNoticia agregadorTopico = new AgregadorTopico("jogos");
		Noticiario noticiario = new NoticiarioAssina(agregadorTopico);
		noticiario.notificaNoticia("Novo jogo sai hoje", 1, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 2, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Filme estreia hoje", 3, 1, "Cinema");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 4, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 4, 1, "Jogos");
		
		System.out.println("///////////////////////////////////////");
		
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("Novo jogo sai hoje", 1, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 2, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Filme estreia hoje", 3, 1, "Cinema");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 3, 1, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 4, 2, "Jogos");
		noticiario.notificaNoticia("Novo jogo sai hoje", 4, 2, "Jogos");

	}
}
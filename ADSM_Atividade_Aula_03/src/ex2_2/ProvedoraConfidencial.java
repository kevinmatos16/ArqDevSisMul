package ex2_2;

public class ProvedoraConfidencial implements Provedora {
	public String proverInfo() {
		return lerArquivo("confidencial.txt");
	}
}
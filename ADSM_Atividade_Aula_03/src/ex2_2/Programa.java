package ex2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		primeiroCrieOsArquivos();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		new ProvedoraFactoryMethod(sc.nextLine());
		sc.close();
	}

	private static void primeiroCrieOsArquivos() {
		try (PrintWriter writer = new PrintWriter(new File("publico.txt"))) {
		    writer.println("Estas informa��es s�o p�blicas, todo mundo pode ver este arquivo.");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao escrever o arquivo");
			e.printStackTrace();
		}
		try (PrintWriter writer = new PrintWriter(new File("confidencial.txt"))) {
		    writer.println("Estas informa��es s�o confidenciais, o que significa que provavelmente s� voc� sabe a senha.");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao escrever o segundo arquivo");
			e.printStackTrace();
		}

	}
}
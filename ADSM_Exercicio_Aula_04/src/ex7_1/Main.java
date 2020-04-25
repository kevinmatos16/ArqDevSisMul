package ex7_1;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		//System.out.println(string.toUpperCase());
		
		
		TestePrograma teste = null;
		teste = new StrMaiuscula(str);
		
		teste = new StrMaiuscula(str);
		
		teste = new DuplicaStr(str);
		
		teste = new InverteStr(str);
		teste.rodar();

	}

}
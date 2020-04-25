package ex_9_1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Logica logica = new Logica();
		Double moeda = 0.00;
		boolean ehNumero;
		String pare,valor;
		
		Slot slot025 = new Slot_025("Slot de 25 centavos");
		Slot slot050 = new Slot_050("Slot de 50 centavos");
		Slot slot100 = new Slot_100("Slot de 1 real");
		
		slot025.setSlot(slot050);
		slot050.setSlot(slot100);
		
		
		System.out.println(" Tabela de Precos \n");
		System.out.println("Salgadinho: RS 5,00 \n Refrigerante: RS 1,00\nBatata Chips: RS 2,50\nChocolate: RS 3,00");
		System.out.println(" \n");
		
		do {
			System.out.println("\n Insira as moedas, com duas casas decimais e com ponto, para parar digite 'pare': ");
			valor = leitor.nextLine();
			try {
			    moeda = (Double.parseDouble(valor));
		            ehNumero = true;
			} catch (NumberFormatException e) {	  
		            ehNumero = false;
			}
		       if (ehNumero) {
		    	   slot025.slotRequest(moeda);
		       }else {
		    	   break;
		       }
		}
			
		while(!valor.equals("pare"));
			
		System.out.println("\nEscolha o produto que voce quer digitando o nome");
		String produto = leitor.nextLine();
		logica.designar(produto);
		System.out.println("Retire seu produto "+produto);
		
	}
}
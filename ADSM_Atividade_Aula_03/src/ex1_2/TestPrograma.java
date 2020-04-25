package ex1_2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TestPrograma {	
	public static void main(String[] args) {
		String inputData = JOptionPane.showInputDialog(null, "Informe a data no formato dia/mês/ano");	
		Date data = null;		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");	
		try {			data = df.parse(inputData);		
		} catch (ParseException e) {			
			System.out.println("A data precisa estar no formato dia/mês/ano");			
			System.exit(1);		
			}		
		FactoryConsumidor consumidor = new FactoryConsumidor(data);	
		consumidor.pedirPizza();	
		}
	}

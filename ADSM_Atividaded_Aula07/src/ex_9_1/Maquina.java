package ex_9_1;
import java.util.ArrayList;

public class Maquina{

	public static ArrayList<Double> maquina = new ArrayList<Double>();
	double total = 0;
	
	public void adicionando(Double b) {
		maquina.add(b);
	}
	
	public Double troco(Double s) {
		
		for(Double numero : maquina) {
			total = total + numero;
		}
		
		double troco = total - s;
		System.out.println("Valor do produto: RS "+s);
		System.out.println("Valor inserido: RS "+total);
		System.out.println("O seu troco foi de: RS "+troco);
		return troco;
		
	}
}

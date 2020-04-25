package ex_9_1;

public class Logica {

	private Maquina maquina = new Maquina();
	public void designar(String a) {
		if (a.equals("Refrigerante")) {
			maquina.troco(1.00);
		}else if (a.equals("Batata")) {
			maquina.troco(2.50);
		}else if (a.equals("Chocolate")) {
			maquina.troco(3.00);
		}else if(a.equals("Salgadinho")){
			maquina.troco(5.00);
		}else {
			System.out.println("Produto nao encotrado!!");
		}
	}
	
}
package ex1_2;

public class PizzaioloCalabresa implements Pizzaiolo {
	
	@Override	
	public Pizza fazerPizza() {		
		return new PizzaCalabresa();	
		}	
	@Override	
	public Calzone fazerCalzone() {		
		return new CalzoneCalabresa();	
		}
}
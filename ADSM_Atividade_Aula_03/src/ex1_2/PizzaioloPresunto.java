package ex1_2;


public class PizzaioloPresunto implements Pizzaiolo {	
	@Override	
	public Pizza fazerPizza() {		
		return new PizzaPresunto();	
		}	
	@Override	
	public Calzone fazerCalzone() {		
		return new CalzonePresunto();	
		}
}
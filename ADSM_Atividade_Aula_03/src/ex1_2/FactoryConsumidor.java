package ex1_2;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FactoryConsumidor {	
	private Pizzaiolo pizzaiolo;	
	private Date data;	
	public FactoryConsumidor(Date data) {		
		this.data = data;		
		Calendar calendar = Calendar.getInstance();		
		calendar.setTime(data);		
		int diaSemana = calendar.get(DAY_OF_WEEK);		
		switch (diaSemana) {		
		case MONDAY:		
			case WEDNESDAY:		
				case FRIDAY:		
					pizzaiolo = new PizzaioloCalabresa();		
					break;		
					case TUESDAY:	
						case THURSDAY:		
							case SATURDAY:		
								pizzaiolo = new PizzaioloPresunto();		
								break;		
								}	
		}	
	public void pedirPizza() {		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy (EEEE)");		
		if (pizzaiolo == null) {			
			System.out.println("A pizzaria está fechada!" + df.format(data));		} 
		else {			Pizza pizza = pizzaiolo.fazerPizza();			
		System.out.println("   Cardapio da Pizzaria    ");	
		System.out.println(" A Pizza de hoje é " + df.format(data) + ":\n\t" + pizza.Ingredientes());	
		System.out.println(" ");	
		Calzone calzone = pizzaiolo.fazerCalzone();		
		System.out.println("O calzone de hoje é " + df.format(data) + ":\n\t" + calzone.Ingredientes());
		}	
	}
}

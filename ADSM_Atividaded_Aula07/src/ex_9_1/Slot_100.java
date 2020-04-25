package ex_9_1;


public class Slot_100 implements Slot{
	
	private Slot slot;
	private String slotname;
	private Maquina banco = new Maquina();
	
	public Slot_100(String slotname) {
		this.slotname = slotname;
	}
	
	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
		
	}

	@Override
	public String getSlot() {
		return slotname;
	}

	@Override
	public void slotRequest(double b) {
		
		if (b == 1.00) {
			System.out.println("Colocando no slot de 1 real, adicionando ao banco...");
			banco.adicionando(b);
		}else if (b != 0) {
			System.out.println("Moeda nao encotrada");
						
		}else {
			System.out.println("Temos um problema!!!");
		}
	}

}
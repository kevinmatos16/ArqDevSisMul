package ex_9_1;

public class Slot_050 implements Slot{
	
	private Slot slot;
	private String slotname;
	private Maquina maquina = new Maquina();
	
	public Slot_050(String slotname) {
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
		
		if (b == 0.50) {
			System.out.println("Colocando no slot de 50 centavos, adicionando ao maquina...");
			maquina.adicionando(b);
		}else if (b != 0) {
			System.out.println(slotname+" passando para o proximo slot: "+slot.getSlot()+".");
			slot.slotRequest(b);			
		}else {
			System.out.println("Temos um problema!!!");
		}
	}

}
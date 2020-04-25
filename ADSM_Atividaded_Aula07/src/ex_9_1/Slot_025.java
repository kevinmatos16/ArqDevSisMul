package ex_9_1;

public class Slot_025 implements Slot{
	
	private Slot slot;
	private String slotname;
	private Maquina banco = new Maquina();
	
	public Slot_025(String slotname) {
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
		
		if (b == 0.25) {
			System.out.println("Colocando no slot de 25 centavos, adicionando ao banco...");
			banco.adicionando(b);
		}else if (b != 0) {
			System.out.println(slotname+" passando para o proximo slot: "+slot.getSlot()+".");
			slot.slotRequest(b);			
		}else {
			System.out.println("Temos um problema!!!");
		}
	}

}
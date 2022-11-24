package Miniprojekt2;

class RabatteradVara extends Vara{
	
	private double procent;

	RabatteradVara(String name, int price, int antal) {
		super(name, price, antal);
		 
	}
	
	protected void setProcent(double procent) {
		this.procent = procent;
	}

	protected void setPriceAfterDiscount() {
		
		super.setPriceAfterDiscount((int) ( super.getPrice()- super.getPrice() * this.procent));
	}
	
	
}
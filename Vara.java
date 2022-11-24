package Miniprojekt2;

class Vara {
	
	private final String name;
	private int antal;
	private int price;



	Vara(String name, int price,int antal ){
		this.name = name;
		this.price = price;
		this.antal = antal;
	}
	
	
	protected void updateAntal() {
		antal--;
	}
	
	
	protected int getPrice() {
		return price;
	}
	
	protected int getAntal() {
		return antal;
	}
	
   String getName() {
	return name;
}

}
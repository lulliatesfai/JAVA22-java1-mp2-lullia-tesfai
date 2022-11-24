package Miniprojekt2;



class Kund {

String nameV;
private int numberVaror = 0;
private int totalPrice = 0;


Kund(String nameV, int numberVaror, int totalPrice){
	this.nameV = nameV;
	this.numberVaror = numberVaror;
	this.totalPrice = totalPrice;

}



void addVaror() {
	numberVaror++;
}

void addPriceVara(int price) {
	this.totalPrice += price;
	
}

int getNumberVaror(){
	return numberVaror;
}

int getTotalPrice() {
	return totalPrice;
}





}

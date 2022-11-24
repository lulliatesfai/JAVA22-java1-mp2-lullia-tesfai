package Miniprojekt2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		Vara bacon = new Vara("bacon", 100, 40);
		Vara milk = new Vara("milk", 20, 5);
		RabatteradVara delicatobollar = new RabatteradVara("delicatobollar", 32, 35);
		delicatobollar.setProcent(0.2);
		delicatobollar.setPriceAfterDiscount();
		Kund kund = new Kund("Lullia", 0, 0);

		// do - while loop
		do {
			System.out.println("Välj en vara: ");

			System.out.println("1. Bacon 2. Mjölk 3. Delicatobollar 4. Avslutad");

		choice = scanner.nextInt();


			switch (choice) {
			case 1:
				System.out.println("1.Bacon");
				kund.addVaror();
				bacon.updateAntal();
				kund.addPriceVara(bacon.getPrice());
				break;
				
			case 2:
				System.out.println("2. Mjölk");
				kund.addVaror();
				milk.updateAntal();
				kund.addPriceVara(milk.getPrice());
				break;
				
			case 3:
				System.out.println("3. Delicatobollar");
				kund.addVaror();
				milk.updateAntal();
				kund.addPriceVara(milk.getPrice());
				break;
				
			case 4:
				System.out.println("Avslutad.");
				System.out.println("Du har köpt " + kund.getNumberVaror() + " varor för " + kund.getTotalPrice() + " SEK. ");
				break;
	
			}

		}  while (choice != 4);

		//kund.getnumberVaror och kund.getTotalPrice

		// Switch Case med alternativen
		// Vid val 1-3 - gör uträkning för (1) Lagersaldo (2) Kundkorg/antakl artiklar
		// och totalbelopp
		
		
		
		

	}

	
	}


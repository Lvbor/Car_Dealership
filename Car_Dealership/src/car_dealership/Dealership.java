package car_dealership;

// Imports
import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		
		// Mazda RX-7 specs
		Vehicle Mazda_RX7 = new Vehicle();
		Mazda_RX7.setCompany("Mazda");
		Mazda_RX7.setModel("RX-7 FD - III generation");
		Mazda_RX7.setEngine_capacity(1.3);
		Mazda_RX7.setHp(239);
		Mazda_RX7.setTorque(294);
		Mazda_RX7.setMax_speed(250);
		Mazda_RX7.setYear_production(2002);
		Mazda_RX7.setPrice(25000.00);
		
		// Aston Martin DB-9 specs
		Vehicle AstonMartin_DB9 = new Vehicle();
		AstonMartin_DB9.setCompany("Aston Martin");
		AstonMartin_DB9.setModel("DB-9");
		AstonMartin_DB9.setEngine_capacity(5.9);
		AstonMartin_DB9.setHp(477);
		AstonMartin_DB9.setTorque(600);
		AstonMartin_DB9.setMax_speed(295);
		AstonMartin_DB9.setYear_production(2004);
		AstonMartin_DB9.setPrice(350000.00);
		
		// Chevrolet Corvette C6 specs
		Vehicle Chevrolet_Corvette_C6 = new Vehicle();
		Chevrolet_Corvette_C6.setCompany("Chevrolet");
		Chevrolet_Corvette_C6.setModel("C6");
		Chevrolet_Corvette_C6.setEngine_capacity(6.0);
		Chevrolet_Corvette_C6.setHp(404);
		Chevrolet_Corvette_C6.setTorque(546);
		Chevrolet_Corvette_C6.setMax_speed(302);
		Chevrolet_Corvette_C6.setYear_production(2005);
		Chevrolet_Corvette_C6.setPrice(35000.00);
		
		// Lamborghini Gallardo specs
		Vehicle Lamborghini_Gallardo = new Vehicle();
		Lamborghini_Gallardo.setCompany("Lamborghini");
		Lamborghini_Gallardo.setModel("Gallardo");
		Lamborghini_Gallardo.setEngine_capacity(5.0);
		Lamborghini_Gallardo.setHp(494);
		Lamborghini_Gallardo.setTorque(510);
		Lamborghini_Gallardo.setMax_speed(309);
		Lamborghini_Gallardo.setYear_production(2004);
		Lamborghini_Gallardo.setPrice(170000.00);
		
		// Porsche Carrera GT specs
		Vehicle Porshe_CarreraGT = new Vehicle();
		Porshe_CarreraGT.setCompany("Porshe");
		Porshe_CarreraGT.setModel("Carrera GT");
		Porshe_CarreraGT.setEngine_capacity(5.7);
		Porshe_CarreraGT.setHp(612);
		Porshe_CarreraGT.setTorque(590);
		Porshe_CarreraGT.setMax_speed(330);
		Porshe_CarreraGT.setYear_production(2004);
		Porshe_CarreraGT.setPrice(1320000.00);
		
		Customer customer = new Customer();
		customer.setAddress("Poland, 00-908 Warsaw, Gen. S. Kaliskiego 2. St.");
		customer.setName("Tom");
		customer.setCash(15000.00);
		
		System.out.print("Choose vehicle (1-5): \n1. Mazda RX-7 \n2. Aston Martin Db-7 \n3. Chevrolette C6 \n4. Lamborghini Gallardo \n5. Porshe Carrera GT \n");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		// Information about chosen vehicle
		switch(choice) {
		case 1:
		    System.out.println(Mazda_RX7.toString()); 
		    break;
		case 2:
		    System.out.println(AstonMartin_DB9.toString()); 
		    break;
		case 3:
		    System.out.println(Chevrolet_Corvette_C6.toString());
		    break;
		case 4:
		    System.out.println(Lamborghini_Gallardo.toString());
		    break;
		case 5:
		    System.out.println(Porshe_CarreraGT.toString());
		    break;
		default:
		    System.out.println("Invalid input");
		    System.exit(1);
		}

		System.out.println("Are you sure to buy this vehicle? 1 - Yes, 2 - No");
		Scanner scanner2 = new Scanner(System.in);
		int answer = scanner2.nextInt();

		switch(answer) {
		case 1: 
			System.out.println("Okay!");
		    break;
		case 2:
		    System.out.println("Okay, bye!");
		    System.exit(0);
		default:
		    System.out.println("Invalid input");
		    System.exit(1);
		}

		double value = 0;
		switch(choice) {
		case 1:
			value = Mazda_RX7.getPrice();
			break;
		case 2:
			value = AstonMartin_DB9.getPrice();
			break;
		case 3:
			value = Chevrolet_Corvette_C6.getPrice();
			break;
		case 4:
			value = Lamborghini_Gallardo.getPrice();
			break;
		case 5:
			value = Porshe_CarreraGT.getPrice();
			break;
		default:
		    System.exit(1);
		}
		double loan = 0;
		double installment = 0;
		if(customer.getCash()<(0.25*value)){
			System.out.println("Not enough money.");
			System.exit(1);
		}
		else if(customer.getCash()>=0.25*value && customer.getCash()<value) {
			System.out.println("You can buy this car, but you will need a loan for this purchase.");
			loan = (value - customer.getCash())*1.2;
			installment = loan/60;
			System.out.println("Loan offer:\nTotal: " + loan + "\nInstallment: " + String.format("%.2f", installment) + " (60 installments [interest: 20%])");
			System.out.println("Confirm? 1 - Yes, 2 - No");
			Scanner scanner3 = new Scanner(System.in);
			int confirm = scanner3.nextInt();
			if(confirm == 1) {
				System.out.println("You took a loan");
			}
			else if(confirm == 2) {
				System.out.println("Okay, bye!");
				System.exit(0);
			}
			else {
				System.out.println("Invalid input");
				System.exit(1);
			}
			scanner3.close();
		}
		else {
			System.out.println("You have enough money to buy this car. Confirm? 1 - Yes, 2 - No");
			Scanner scanner3 = new Scanner(System.in);
			int confirm = scanner3.nextInt();
			if(confirm == 1) {
			}
			else if(confirm == 2) {
				System.out.println("Okay, bye!");
				System.exit(0);
			}
			else {
				System.out.println("Invalid input");
				System.exit(1);
			}
			scanner3.close();
		}
		double total = (value - (loan/1.2) + loan);
		System.out.println("Congratulations you bought a car!");
		System.out.println("Total price: " + total + "$ with a loan of " + loan + "$");

		scanner.close();
		scanner2.close();


	}

}

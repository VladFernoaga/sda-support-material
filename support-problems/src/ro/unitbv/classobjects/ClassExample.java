package ro.unitbv.classobjects;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ClassExample {

	
	public static void main(String[] args) {
		
		// obiect
		// Car car0 = new Car();
		
		Car car1 = new Car("VW","green", 5, "1989ruiqnfiq3440");
		System.out.println(car1.toString());
		System.out.println("Car name: "+ car1.getName());
		
		// Am copiat referinta data de get ( nu este alta referinta)
		String[] doorsIds = car1.getDoorsIDs();

		// Prepare for pretty print
		for(int i=0; i<doorsIds.length; i++) {
			doorsIds[i]= "<"+doorsIds[i]+">";
		}
		System.out.println("Pretty print");
		System.out.println(Arrays.toString(doorsIds));
		
		System.out.println("Raw print");
		System.out.println(car1.getRawIdsValues());
		
		car1.markAsProductionFinished();
		
		
		
//		Invalid example
//		Car car2 = new Car("Hyundai","green", 5, "1989ruiqnfiq3440");
		

	}
	
}


class Car{
	
	private static List<String> acceptedNames = Arrays.asList("VW", "Audi","Toyota", "Mazda");
	
	// poate sa aiba atribute
	private String name;
	private String color;
	private int doors;
	private String vin;
	private String[] doorsIDs;
	private LocalDateTime custructionDate;
	private String prodcutionState ="IN_PORDUCTION";
	
	
	// orice clasa are un constructor default
	// public Car() {}
	
	
	// Daca clasa defineste un constructor cu parametri, atunci constructorul 
	// default generat nu va fi luat in considerare
	public Car(String name, String color, int doors, String vin) {
		if(!acceptedNames.contains(name)) {
			throw new IllegalArgumentException("Name is not accepted");
		}
		this.name = name;
		this.color = color;
		this.doors = doors;
		this.vin = vin;
		
		this.doorsIDs = new String[doors];
		for(int i=0; i<doors;i++) {
			this.doorsIDs[i]=i+"-"+new Random().nextInt(100);
		}
	}
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

//	Doi constructori cu aceasi signatura intr-o clasa 	
//	public Car(String name, String color) {
//		this.name = name;
//		this.color = color;
//	}
	
	public Car() {
		 
	}

	// Start Getters
	public String getName() {
		return name;
	}

	public String getColor() {
		// Safe, pentru ca Stringul este read-only
		return color;
	}

	public int getDoors() {
		return doors;
	}
	
	public String[] getDoorsIDs() {
		// Dai o clona pentu proprietatile care au read/write access 
		return Arrays.asList(doorsIDs).toArray(new String[doorsIDs.length]);
	}
	
	public LocalDateTime getCustructionDate() {
		// Safe: LocalDate time is read-only
		return custructionDate;
	}
	// End Getters


//	public void setName(String name) {
//		this.name = name;
//	}
//
	public void setColor(String color) {
		this.color = color;
	}
//
//	public void setDoors(int doors) {
//		this.doors = doors;
//	}
//
//	public void setVin(String vin) {
//		this.vin = vin;
//	}
//
//	public void setDoorsIDs(String[] doorsIDs) {
//		this.doorsIDs = doorsIDs;
//	}

	// functii care definesc comportamente 
	
	public String getRawIdsValues() {
		return Arrays.toString(doorsIDs);
	}
	
	public void markAsProductionFinished() {	
		if(ProdSystem.checkProductionSystemBasedOnVin(this.vin)) {
			this.prodcutionState = "FINISHED";
		}else {
			throw new RuntimeException("Not fineshed");
		}
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", doors=" + doors + ", vin=" + vin + "]";
	}
}

class ProdSystem{

	public static boolean checkProductionSystemBasedOnVin(String vin) {
		return new Random().nextBoolean();
	}
}

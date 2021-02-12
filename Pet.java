import java.util.*;
import java.time.LocalDateTime;

class Pet {
	Scanner read = new Scanner(System.in);// Scanner class to read input from reader.
	private String petType;// attributes
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private int amountDue;
	String CheckIn = "No";
	String CheckOut = "No";

	public Pet(String petType, String petName, int petAge, int daysStay) {// public constructor
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
	}

	public void checkIn() {
		CheckIn = "Yes";
		LocalDateTime myObj = LocalDateTime.now(); // Create a date object
		System.out.println("CheckIn of pet is at :" + myObj); // display time of check in
	}

	public void checkOut() {
		CheckOut = "Yes";
		LocalDateTime myObj = LocalDateTime.now(); // Create a date object
		System.out.println("CheckOut of pet is at :" + myObj); // display checkout time
	}

	public void getPet() {
		System.out.println("PetType : " + petType);
		System.out.println("PetName : " + petName);
	}

	public void setPet() {
		System.out.println("Select 1.To set PetType" + "\n" + "2. To Set PetName " + "\n" + "3.To Set PetAge ");
		int temp = read.nextInt();
		switch (temp) {
		case 1:
			System.out.println("Enter the PetType :");
			String temp1 = read.nextLine();
			petType = temp1;
		case 2:
			System.out.println("Enter the PetName :");
			String temp2 = read.nextLine();
			petName = temp2;
		case 3:
			System.out.println("Enter the PetAge :");
			int temp3 = read.nextInt();
			petAge = temp3;
		}
	}

	public void createPet() {
		System.out.println("Enter the PetType :");
		String Temp4 = read.nextLine();
		petType = Temp4;
		System.out.println("Enter the PetName :");
		String Temp5 = read.nextLine();
		petName = Temp5;
		System.out.println("Enter the PetAge :");
		int Temp6 = read.nextInt();
		petAge = Temp6;
	}

	public void updatePet() {
		System.out.println("Select 1.To Update PetType" + "\n" + "2. To Update PetName " + "\n" + "3.To Update PetAge "
				+ "\n" + "4. To Update DaysStay");
		int temp = read.nextInt();
		switch (temp) {
		case 1:
			System.out.println("Enter the PetType :");
			String TempPet1 = read.nextLine();
			petType = TempPet1;
		case 2:
			System.out.println("Enter the PetName :");
			String TempPet2 = read.nextLine();
			petName = TempPet2;
		case 3:
			System.out.println("Enter the PetAge :");
			int TempPet3 = read.nextInt();
			petAge = TempPet3;
		case 4:
			System.out.println("Enter Number of DaysStay:");
			int temp4 = read.nextInt();
			daysStay = temp4;
		}
	}
}

class Dog extends Pet {
	public int dogSpaceNbr;
	public int dogWeight;
	public String dogGrooming;

	public Dog(String petType, String petName, int petAge, int daysStay, int dogSpaceNbr, int dogWeight,
			String dogGrooming) {
		super(petType, petName, petAge, daysStay);
		this.dogSpaceNbr = dogSpaceNbr;
		this.dogWeight = dogWeight;
		this.dogGrooming = dogGrooming;
	}

	Scanner read = new Scanner(System.in);

	public void getdogGrooming() {
		System.out.println("Dog Grooming : " + dogGrooming);
	}

	public void setdogGrooming() {
		String temp = read.nextLine();
		dogGrooming = temp;
		System.out.println("Dog Grooming : " + dogGrooming);
	}

	public void getdogWeight() {
		System.out.println("Dog Weight : " + dogWeight);
	}

	public void setdogWeight() {
		int temp = read.nextInt();
		dogWeight = temp;
		System.out.println("Dog Weight : " + dogWeight);
	}

	public void setdogSpaceNbr() {
		int temp = read.nextInt();
		dogSpaceNbr = temp;
		System.out.println("Dog SpaceNbr : " + dogSpaceNbr);
	}

	public void getdogSpaceNbr() {
		System.out.println("Dog SpaceNbr : " + dogSpaceNbr);
	}

	public void setPet() {
		super.setPet();
	}

	public void updatePet() {
		super.updatePet();
	}

	public void getPet() {
		super.getPet();
	}
}

class Cat extends Pet {// class for Cat
	public int catSpaceNbr;
	public int catWeight;
	public String catGrooming;

	public Cat(String PetType, String petName, int petAge, int daysStay, int catSpaceNbr, int catWeight,
			String catGrooming) {// constructor for cat

		super(PetType, petName, petAge, daysStay);// super class constructor to set
		this.catSpaceNbr = catSpaceNbr;
		this.catWeight = catWeight;
		this.catGrooming = catGrooming;
	}

	Scanner read = new Scanner(System.in);

	public void getcatGrooming() {
		System.out.println("Cat Grooming : " + catGrooming);
	}

	public void setcatGrooming() {
		String temp = read.nextLine();
		catGrooming = temp;
		System.out.println("Cat Grooming : " + catGrooming);
	}

	public void getcatWeight() {
		System.out.println("Cat Weight : " + catWeight);
	}

	public void setcatWeight() {
		int temp = read.nextInt();
		catWeight = temp;
		System.out.println("Cat Weight : " + catWeight);
	}
	
	public void getcatSpaceNbr() {
		System.out.println("Cat SpaceNbr : " + catSpaceNbr);
	}

	public void setcatSpaceNbr() {
		int temp = read.nextInt();
		catSpaceNbr = temp;
		System.out.println("Cat SpaceNbr : " + catSpaceNbr);
	}

	public void setPet() {
		super.setPet();
	}

	public void updatePet() {
		super.updatePet();
	}

	public void getPet() {
		super.getPet();
	}
}


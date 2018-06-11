import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		int numberPicked;
		int newAnimalType;
		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();

		OrganicCat jerry = new OrganicCat("Jerry", "a house cat", 100, 100, 100, 100, 0, 0);
		RoboticCat nova = new RoboticCat("Nova", "a robotic house cat", 100, 100, 100);
		RoboticDog jaws = new RoboticDog("Jaws", "man's bestfriend 2.0", 100, 100, 100);
		OrganicDog licks = new OrganicDog("Licks", "man's bestfriend", 100, 100, 100, 100, 0, 0);

		shelter.admit(jerry);
		shelter.admit(nova);
		shelter.admit(jaws);
		shelter.admit(licks);

		System.out.println("Welcome to the newest Internet Animal Shelter, now featuring robotic pets!");
		System.out.println("Here is the status of the current internet animals in the shelter.");
		System.out.println("----Robotics----");
		shelter.listRoboticVirtualPets();
		System.out.println("-------|-------|-------|-------|-------");
		System.out.println("----Organics----");
		shelter.listOrganicVirtualPets();
		
		
		do {
			System.out.println("What would you like to do ?");
			System.out.println(" Press 1 if you would like to feed the organic pets.");
			System.out.println(" Press 2 if you would like to give water to the organic pets.");
			System.out.println(" Press 3 if you would like to walk all of the dogs.");
			System.out.println(" Press 4 if you would like to watch the cats chase mice.");
			System.out.println(" Press 5 if you would like to help and clean out the dog cages.");
			System.out.println(" Press 6 if you would like to help and clean out the cat litter box.");
			System.out.println(" Press 7 if you would like to oil all the robotic pets.");
			System.out.println(" Press 8 if you would like to adopt a pet.");
			System.out.println(" Press 9 if you would like to admit a pet.");
			System.out.println(" Press 10 if you would like to quit the app.");
			numberPicked = input.nextInt();

			if (numberPicked == 1) {
				System.out.println(" You have picked to feed the organic pets, they are grateful!");
				shelter.giveFoodToOrganicPets();
				shelter.listOrganicVirtualPets();
				
				}
			  if (numberPicked == 2) {
				System.out.println(" You have picked to give water to all the organic pets, they are grateful!");
				shelter.giveWaterToOrganicPets();
				shelter.listOrganicVirtualPets();
					

				}
			  if (numberPicked == 3) {
				System.out.println(" You have picked to walk the dogs.");
				shelter.takeAllDogsOnWalk();
				System.out.println("The dogs are happy you walked them.");
				shelter.listOrganicVirtualPets();
				shelter.listRoboticVirtualPets();
				}
			  if(numberPicked==4) {
				 System.out.println(" You have picked to wathc the cats chase mice.");
				 shelter.haveAllCatsChaseMice();
				 System.out.println("The cats are happier now that they had their fun. ");
				 shelter.listOrganicVirtualPets();
				 shelter.listRoboticVirtualPets();
			 }
			 if (numberPicked==5) {
				 System.out.println(" You have picked to help clean out the dog cages");
				 shelter.cleanAllDogCages();
				 System.out.println(" The dogs cages have been cleaned some.");
				 shelter.listOrganicVirtualPets();
			
			 }
			  if (numberPicked==6) {
				 System.out.println(" You have picked to help clean out the cat litter box.");
				 shelter.cleanTheOneLitterBox();
				 System.out.println(" The litter box for the cat has been cleaned some.");
				 shelter.listOrganicVirtualPets();
				 
			 }
			  if (numberPicked==7) {
				 System.out.println(" You have picked to oil the robotic pets.");
				 shelter.giveOilToRoboticPets();
				 System.out.println(" The robotic pets oil level has went up and they are a bit happier.");
				 shelter.listRoboticVirtualPets();
			 }
			
			 if (numberPicked == 8) {
				System.out.println(" You can adopt one of these animals today.");
				input.nextLine();
				System.out.println(" What was the name of the animal you wished to adopt?");
				String animalToBeAdopted = input.nextLine();
				shelter.removePet(animalToBeAdopted);
				System.out.println(" Please give the animal plenty of love.");
				shelter.listOrganicVirtualPets();
				shelter.listRoboticVirtualPets();
				
				
			} else if (numberPicked == 9) {
				System.out.println(" Thanks for bringing in this helpless animal.");
				input.nextLine();
				System.out.println(" What is the animal's name");
				String newAnimalName = input.nextLine();
				System.out.println(" Give us a description of the pet");
				String newAnimalDescription= input.nextLine();
				System.out.println(" Pick the number that most closely represents the animal being brought in.");
				System.out.println(" Press 1 for RoboticCat");
				System.out.println(" Press 2 for OrganicCat");
				System.out.println(" Press 3 for OrganicDog");
				System.out.println(" Press 4 for RoboticDog");
				 newAnimalType = input.nextInt();
				if (newAnimalType == 1) {
					shelter.admit(new RoboticCat(newAnimalName, newAnimalDescription, 100, 100, 100));
				}
				else if (newAnimalType ==2) {
					shelter.admit(new OrganicCat(newAnimalName, newAnimalDescription, 100, 100, 100, 100, 0, 0));
				}
				else if (newAnimalType ==3) {
						shelter.admit(new OrganicDog(newAnimalName, newAnimalDescription, 100, 100, 100, 100, 0, 0));
				}
				else if (newAnimalType ==4) {
					shelter.admit(new RoboticDog(newAnimalName, newAnimalDescription, 100, 100, 100));
				}
				
				System.out.println("We are happy to have " + newAnimalName + ".");
				shelter.listOrganicVirtualPets();
				shelter.listRoboticVirtualPets();
			}
			if (numberPicked == 10) {
				System.out.println("Come back again soon");
				break;
			}
			shelter.callTickForAllPets();
			System.out.println("Anything else?");

		} while (numberPicked != 0);
	}
	
}
	


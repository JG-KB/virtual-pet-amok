import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private int totalLitterBoxWaste = 0;
	private int totalDogCageWaste=0;
	Map<String, VirtualPet> petsInShelter = new HashMap<>();

	public Collection<VirtualPet> getAllPetsStatus() {
		return petsInShelter.values();
	}

	public VirtualPet getPetByName(String petName) {
		return petsInShelter.get(petName);
	}

	public int getPetCount() {

		return petsInShelter.size();
	}

	public void admit(VirtualPet anyPet) {
		petsInShelter.put(anyPet.getPetName(), anyPet);

	}

	public void removePet(String petName) {
		petsInShelter.remove(petName);

	}

	public VirtualPet getPetByDescription(String description) {
		return petsInShelter.get(description);
	}

	public void giveWaterToOrganicPets() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof OrganicVirtualPet) {
				((OrganicVirtualPet) virtualPet).giveWaterToOneOrganicPet();
			}
		}

	}

	public void giveFoodToOrganicPets() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof OrganicVirtualPet) {
				((OrganicVirtualPet) virtualPet).giveFoodToOneOrganicPet();
			}
		}
	}

	public void giveOilToRoboticPets() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof RoboticVirtualPet) {
				((RoboticVirtualPet) virtualPet).giveOilToOneVirtualPet();
			}
		}
	}

	public void takeAllDogsOnWalk() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof WalkDog) {
				((WalkDog) virtualPet).walkingTheDog(virtualPet);
			}
		}
	}

	public void haveAllCatsChaseMice() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof ChaseMice) {
				((ChaseMice) virtualPet).chasedMice(virtualPet);

			}
		}
	}

	public void cleanAllDogCages() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof OrganicDog) {
				((OrganicDog) virtualPet).cleanCage();
			}
		}

	}

	public int dogCageStatus() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof OrganicDog) {
				totalDogCageWaste = ((OrganicDog) virtualPet).getWasteInCage();
			}
		}
		return totalDogCageWaste;
	}	
	

	public void callTickForAllPets() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof VirtualPet) {
				((VirtualPet) virtualPet).tick(virtualPet);
			}
			if (virtualPet instanceof OrganicVirtualPet) {
				((OrganicVirtualPet) virtualPet).tick(virtualPet);
				if (virtualPet instanceof RoboticVirtualPet) {
					((RoboticVirtualPet) virtualPet).tick(virtualPet);
				}
				if (virtualPet.getHealth() <= 0) {
					removePet(virtualPet.getPetName());
					System.out.println("Sorry one of your Pets in the Shelter died.");
				}

			}
		}
	}

	public void cleanTheOneLitterBox() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof OrganicCat) {
				((OrganicCat) virtualPet).cleanLitterBox();
			}
		}

	}

	public int checkLitterBoxWaste() {
		for (VirtualPet virtualPet : getAllPetsStatus()) {
			if (virtualPet instanceof OrganicCat) {
				totalLitterBoxWaste = ((OrganicCat) virtualPet).getWasteInLitterBox();
			}
		}
		return totalLitterBoxWaste;
	}

	public void listRoboticVirtualPets() {
		System.out.println("---Cats---");
		System.out.println("Name\t");
		System.out.println("|Health\t");
		System.out.println("|Happiness\t");
		System.out.println("|Oil Level\t");
		System.out.println("----------|----------|----------|");
		for (VirtualPet virtualPet : petsInShelter.values()) {
			if (virtualPet instanceof RoboticCat) {
				System.out.println(((RoboticVirtualPet) virtualPet).getPetName() + "\t");
				System.out.println("|" + ((RoboticVirtualPet) virtualPet).getHealth() + "\t");
				System.out.println("|" + ((RoboticVirtualPet) virtualPet).getHappiness() + "\t");
				System.out.println("|" + ((RoboticVirtualPet) virtualPet).getOilLevel() + "\t");
			}
		}

		System.out.println("---Dogs---");
		System.out.println("Name\t");
		System.out.println("|Health\t");
		System.out.println("|Happiness\t");
		System.out.println("|Oil Level\t");
		System.out.println("----------|----------|----------|");
		for (VirtualPet virtualPet : petsInShelter.values()) {
			if (virtualPet instanceof RoboticDog) {
				System.out.println(((RoboticVirtualPet) virtualPet).getPetName() + "\t");
				System.out.println("|" + ((RoboticVirtualPet) virtualPet).getHealth() + "\t");
				System.out.println("|" + ((RoboticVirtualPet) virtualPet).getHappiness() + "\t");
				System.out.println("|" + ((RoboticVirtualPet) virtualPet).getOilLevel() + "\t");
			}
		}
	}

	public void listOrganicVirtualPets() {
		System.out.println("---Cats---");
		System.out.println("Name\t");
		System.out.println("|Health\t");
		System.out.println("|Happiness\t");
		System.out.println("|Thirst\t");
		System.out.println("|Hunger\t");
		System.out.println("|Need To Produce Waste\t");
		System.out.println("----------|----------|----------|");
		for (VirtualPet virtualPet : petsInShelter.values()) {
			if (virtualPet instanceof OrganicCat) {
				System.out.println(((OrganicVirtualPet) virtualPet).getPetName() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getHealth() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getHappiness() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getThirst() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getHunger() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getNeedToProduceWaste() + "\t");
			}
		}
		System.out.println("---Dogs---");
		System.out.println("Name\t");
		System.out.println("|Health\t");
		System.out.println("|Happiness\t");
		System.out.println("|Thirst\t");
		System.out.println("|Hunger\t");
		System.out.println("|Need To Produce Waste\t");
		System.out.println("----------|----------|----------|");
		for (VirtualPet virtualPet : petsInShelter.values()) {
			if (virtualPet instanceof OrganicDog) {
				System.out.println(((OrganicVirtualPet) virtualPet).getPetName() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getHealth() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getHappiness() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getThirst() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getHunger() + "\t");
				System.out.println("|" + ((OrganicVirtualPet) virtualPet).getNeedToProduceWaste() + "\t");
			}
			
		}
		System.out.println("The cats have " +  checkLitterBoxWaste() + " waste in the litter box.");
		System.out.println("The dogs have " +  dogCageStatus() + " waste in the dog cage.");
	}

}

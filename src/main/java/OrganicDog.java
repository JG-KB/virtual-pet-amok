
public class OrganicDog extends OrganicVirtualPet implements WalkDog {
	private int wasteInCage;

	public OrganicDog(String petName, String description, int health, int happiness, int thirst, int hunger,
			int needToProduceWaste, int wasteInCage) {
		super(petName, description, health, happiness, thirst, hunger, needToProduceWaste);
		this.wasteInCage = wasteInCage;
	}

	@Override
	public void releasesWaste() {
		wasteInCage += 10;
		needToProduceWaste-=3;
	}

	@Override
	public void walkingTheDog(VirtualPet virtualPet) {
		happiness += 5;
		needToProduceWaste -= 10;

	}

	public int getWasteInCage() {
		return wasteInCage;
	}

	public void cleanCage() {
		wasteInCage -= 40;

	}

	@Override
	public String toString() {
		return getPetName() + " " + getDescription() + " " +wasteInCage;
	}
	@Override
	public void tick(VirtualPet virtualPet) {
		health-=10;
		happiness-=10;
		thirst-=10;
		hunger-=10;
		
		releasesWaste();
		//if wasteInCage >=50 -10health etc
		
	}

}

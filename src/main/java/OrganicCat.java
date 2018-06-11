
public class OrganicCat extends OrganicVirtualPet implements ChaseMice {
	public int wasteInLitterBox=0;


	public OrganicCat(String petName, String description, int health, int happiness, int thirst, int hunger,
			int needToProduceWaste, int wasteInLitterBox) {
		super(petName, description, health, happiness, thirst, hunger, needToProduceWaste);
	}
	public int getWasteInLitterBox() {
		return wasteInLitterBox;
	}

	@Override
	public void chasedMice(VirtualPet cat) {
		happiness += 5;
		needToProduceWaste -= 10;
	}

	@Override
	public void releasesWaste() {
		wasteInLitterBox += 10;
		needToProduceWaste-=3;
	}
	public void cleanLitterBox() {
		wasteInLitterBox -=40;
		
	}
	@Override
	public String toString() {
		return getPetName() + " " + getDescription() + " " + wasteInLitterBox;
	}
	@Override
	public void tick(VirtualPet virtualPet) {
		health-=10;
		happiness-=10;
		thirst-=10;
		hunger-=10;
		releasesWaste();
		
		//if wasteInLitterBox >50 -10 health
		
	}
	
}

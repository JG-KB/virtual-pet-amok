
public class OrganicVirtualPet extends VirtualPet implements Tick {

	protected int thirst;
	protected int hunger;
	protected int needToProduceWaste;

	public OrganicVirtualPet(String petName, String description, int health, int happiness, int thirst, int hunger,
			int needToProduceWaste) {
		super(petName, description, health, happiness);

		this.thirst = thirst;
		this.hunger = hunger;
		this.needToProduceWaste = needToProduceWaste;

	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getNeedToProduceWaste() {
		return needToProduceWaste;
	}

	public void giveWaterToOneOrganicPet() {
		thirst += 10;
		needToProduceWaste += 4;
		health += 5;
		
	}

	public int giveFoodToOneOrganicPet() {
		hunger += 10;
		needToProduceWaste += 5;
		health += 5;
		return hunger;
	}

	public void releasesWaste() {
		needToProduceWaste-=3;
		
		
		// add 10 to litter box and dog cage

	}

	@Override
	public String toString() {
		return getPetName() + " " + getDescription() + " " + thirst + hunger + needToProduceWaste;
	}
	@Override
	public void tick(VirtualPet virtualPet) {
		health-=10;
		happiness-=10;
		thirst-=10;
		hunger-=10;
		releasesWaste();
	}
}

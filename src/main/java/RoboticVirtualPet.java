
public class RoboticVirtualPet extends VirtualPet implements Tick {

	protected int oilLevel;

	public RoboticVirtualPet(String petName, String description, int health, int happiness, int oilLevel) {
		super(petName, description, health, happiness);
		this.oilLevel = oilLevel;

	}

	public int getOilLevel() {
		return oilLevel;
	}

	public int giveOilToOneVirtualPet() {
		oilLevel += 10;
		return oilLevel;
	}

	@Override
	public String toString() {
		
		return getPetName() + " " + getDescription() + " " + oilLevel;
	}
	@Override
	public void tick(VirtualPet virtualPet) {
		oilLevel-=10;
		health-=10;
		happiness-=10;
	}
}
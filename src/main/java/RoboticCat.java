
public class RoboticCat extends RoboticVirtualPet implements ChaseMice  {

	public RoboticCat(String petName, String description, int health, int happiness, int oilLevel) {
		super(petName, description, health, happiness, oilLevel);
	}
	@Override
	public void chasedMice (VirtualPet cat) {
		happiness+=5;
		oilLevel-=5;
	}
	@Override
	public void tick(VirtualPet virtualPet) {
		oilLevel-=10;
		health-=10;
		happiness-=10;
	}

}

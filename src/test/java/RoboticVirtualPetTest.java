import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Assert;

public class RoboticVirtualPetTest {
	RoboticVirtualPet roboticVirtualPet = new RoboticVirtualPet("petName", "description", 100, 100, 100);

	@Test
	public void userGivesOilToRoboticVirtualPetToIncreaseOilLevel() {
		int underTest = roboticVirtualPet.giveOilToOneVirtualPet();
		Assert.assertEquals(110, underTest);
	}

	@Test
	public void tickForRoboticVirtualPetshouldDecreaseOil() {
		RoboticVirtualPet roboticVirtualPet = new RoboticVirtualPet("petName", "description", 100, 100, 100);
		int roboticVirtualPetBeforeTick = roboticVirtualPet.getOilLevel();

		roboticVirtualPet.tick(roboticVirtualPet);
		int roboticVirtualPetAfterTick = roboticVirtualPet.getOilLevel();

		assertThat(roboticVirtualPetAfterTick, is(equalTo(roboticVirtualPetBeforeTick - 10)));

	}
	@Test
	public void tickForRoboticVirtualPetshouldDecreaseHealth() {
		RoboticVirtualPet roboticVirtualPet = new RoboticVirtualPet("petName", "description", 100, 100, 100);
		int roboticVirtualPetBeforeTick = roboticVirtualPet.getHealth();

		roboticVirtualPet.tick(roboticVirtualPet);
		int roboticVirtualPetAfterTick = roboticVirtualPet.getHealth();

		assertThat(roboticVirtualPetAfterTick, is(equalTo(roboticVirtualPetBeforeTick - 10)));

	}
	@Test
	public void tickForRoboticVirtualPetshouldDecreaseHappiness() {
		RoboticVirtualPet roboticVirtualPet = new RoboticVirtualPet("petName", "description", 100, 100, 100);
		int roboticVirtualPetBeforeTick = roboticVirtualPet.getHappiness();

		roboticVirtualPet.tick(roboticVirtualPet);
		int roboticVirtualPetAfterTick = roboticVirtualPet.getHappiness();

		assertThat(roboticVirtualPetAfterTick, is(equalTo(roboticVirtualPetBeforeTick - 10)));

	}
}
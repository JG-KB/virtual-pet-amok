import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Assert;

public class OrganicVirtualPetTest {
	OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);

	@Test
	public void userGivesWaterToOneOrganicPetToIncreaseThirst() {
		OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
		int organicVirtualPetBeforeGivenWater = organicVirtualPet.getThirst();
		organicVirtualPet.giveWaterToOneOrganicPet();
		int organicVirtualPetAfterGivenWater = organicVirtualPet.getThirst();
		assertThat(organicVirtualPetAfterGivenWater, is (equalTo(organicVirtualPetBeforeGivenWater +10)));
	}

	@Test
	public void userGivesFoodToOneOrganicPetToIncreaseHunger() {
		OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
		int organicVirtualPetBeforeGivenFood = organicVirtualPet.getHunger();
		organicVirtualPet.giveFoodToOneOrganicPet();
		int organicVirtualPetAfterGivenWater = organicVirtualPet.getHunger();
		assertThat(organicVirtualPetAfterGivenWater, is (equalTo(organicVirtualPetBeforeGivenFood +10)));
	}

	@Test
	public void releasesWaste() {
		OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
		int organicVirtualPetBeforeReleaseWaste = organicVirtualPet.getNeedToProduceWaste();
		organicVirtualPet.releasesWaste();
		int organicVirtualPetAfterReleaseWaste = organicVirtualPet.getNeedToProduceWaste();
		assertThat(organicVirtualPetAfterReleaseWaste, is(equalTo(organicVirtualPetBeforeReleaseWaste - 3)));
	}

	@Test
	public void tickShouldDecreaseHealth() {
	OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
	int organicVirtualPetBeforeTick = organicVirtualPet.getHealth();
	organicVirtualPet.tick(organicVirtualPet);
	int organicVirtualPetAfterTick = organicVirtualPet.getHealth();

	assertThat(organicVirtualPetAfterTick, is(equalTo(organicVirtualPetBeforeTick - 10)));
}
	@Test
	public void tickShouldDecreaseHappiness() {
	OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
	int organicVirtualPetBeforeTick = organicVirtualPet.getHappiness();
	organicVirtualPet.tick(organicVirtualPet);
	int organicVirtualPetAfterTick = organicVirtualPet.getHappiness();

	assertThat(organicVirtualPetAfterTick, is(equalTo(organicVirtualPetBeforeTick - 10)));
}
	@Test
	public void tickShouldDecreaseThirst() {
	OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
	int organicVirtualPetBeforeTick = organicVirtualPet.getThirst();
	organicVirtualPet.tick(organicVirtualPet);
	int organicVirtualPetAfterTick = organicVirtualPet.getThirst();

	assertThat(organicVirtualPetAfterTick, is(equalTo(organicVirtualPetBeforeTick - 10)));
}
	@Test
	public void tickShouldDecreaseHunger() {
	OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 0, 0);
	int organicVirtualPetBeforeTick = organicVirtualPet.getHunger();
	organicVirtualPet.tick(organicVirtualPet);
	int organicVirtualPetAfterTick = organicVirtualPet.getHunger();

	assertThat(organicVirtualPetAfterTick, is(equalTo(organicVirtualPetBeforeTick - 10)));
}
//	@Test had to change function. Tick no longer increases need to produce waste
//	public void tickShouldIncreaseNeedToProduceWaste() {
//	OrganicVirtualPet organicVirtualPet = new OrganicVirtualPet("petName", "description", 100, 100, 100, 100, 0);
//	int organicVirtualPetBeforeTick = organicVirtualPet.getNeedToProduceWaste();
//	organicVirtualPet.tick(organicVirtualPet);
//	int organicVirtualPetAfterTick = organicVirtualPet.getNeedToProduceWaste();
//
//	assertThat(organicVirtualPetAfterTick, is(equalTo(organicVirtualPetBeforeTick +10)));
//}
}

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

public class VirtualPetShelterTest {

	VirtualPet virtualPetTest1 = new VirtualPet("theAllPet", "the first Pet", 100, 100);
	RoboticVirtualPet roboticTestPet1 = new RoboticVirtualPet("roboPet", "has AI", 100, 100, 100);
	OrganicVirtualPet organicTestPet1 = new OrganicVirtualPet("organicPet", "carbon based", 100, 100, 100, 100, 0);
	OrganicVirtualPet organicTestPet2 = new OrganicVirtualPet("organicPet", "carbon based", 100, 100, 100, 100, 0);
	RoboticDog roboDogTest1 = new RoboticDog("roboDog", "man's bestfriend 2.0", 100, 100, 100);
	OrganicDog organicDogTest1 = new OrganicDog("organicDog", "man's bestfriend", 100, 100, 100, 100, 0, 0);
	OrganicCat organicCatTest1 = new OrganicCat("organicCat", "house cat", 100, 100, 100, 100, 0, 0);
	RoboticCat roboticCatTest1 = new RoboticCat("roboticCat", "house cat 2.0", 100, 100, 100);
	VirtualPetShelter testShelter = new VirtualPetShelter();

	@Test
	public void shelterShouldAdmitPet() {
		int beforeAdmittedPet = testShelter.getPetCount();
		testShelter.admit(virtualPetTest1);
		int afterAdmittedPet = testShelter.getPetCount();
		assertThat(afterAdmittedPet, is(equalTo(beforeAdmittedPet + 1)));
	}

	@Test
	public void shelterShouldAdmitTwoPets() {
		int beforeAdmittedPets = testShelter.getPetCount();
		testShelter.admit(virtualPetTest1);
		testShelter.admit(roboticTestPet1);
		int afterAdmittedPets = testShelter.getPetCount();
		assertThat(afterAdmittedPets, is(equalTo(beforeAdmittedPets + 2)));

	}

	@Test
	public void shelterShouldBeAbleToAdmitCollectionOfPets() {
		testShelter.admit(virtualPetTest1);
		testShelter.admit(roboticTestPet1);
		Collection<VirtualPet> addedPetsTest = testShelter.getAllPetsStatus();
		assertThat(addedPetsTest, containsInAnyOrder(virtualPetTest1, roboticTestPet1));
	}

	@Test
	public void shouldRemovePet() {
		testShelter.admit(virtualPetTest1);
		int countBeforeRemovingPet = testShelter.getPetCount();
		testShelter.removePet(virtualPetTest1.getPetName());
		int countAfterRemovingPet = testShelter.getPetCount();
		assertThat(countAfterRemovingPet, is(equalTo(countBeforeRemovingPet - 1)));
	}

	@Test
	public void giveWaterToAllOrganicPets() {
		testShelter.admit(organicTestPet1);
		testShelter.admit(organicTestPet2);
		testShelter.admit(roboticTestPet1);
		testShelter.giveWaterToOrganicPets();
		for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
			if (virtualPet instanceof OrganicVirtualPet) {
				int isThisWorking = ((OrganicVirtualPet) virtualPet).getThirst();
				assertEquals(110, isThisWorking);
			}
		}
	}

	@Test
	public void giveFoodToAllOrganicPets() {
		testShelter.admit(organicTestPet1);
		testShelter.admit(organicTestPet2);
		testShelter.admit(roboticTestPet1);
		testShelter.giveFoodToOrganicPets();
		for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
			if (virtualPet instanceof OrganicVirtualPet) {
				int isThisWorking = ((OrganicVirtualPet) virtualPet).getHunger();
				assertEquals(110, isThisWorking);
			}
		}
	}

	@Test
	public void giveOilToAllRoboticPets() {
		testShelter.admit(organicTestPet1);
		testShelter.admit(organicTestPet2);
		testShelter.admit(roboticTestPet1);
		testShelter.giveOilToRoboticPets();
		for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
			if (virtualPet instanceof RoboticVirtualPet) {
				int isThisWorking = ((RoboticVirtualPet) virtualPet).getOilLevel();
				assertEquals(110, isThisWorking);
			}
		}
	}

	@Test
	public void walkAllDogsInShelter() {
		testShelter.admit(roboDogTest1);
		testShelter.admit(organicDogTest1);
		testShelter.takeAllDogsOnWalk();
		for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
			if (virtualPet instanceof WalkDog) {
				int isThisWorking = ((VirtualPet) virtualPet).getHappiness();
				assertEquals(105, isThisWorking);
			}
		}
	}

	@Test
	public void haveAllCatsInShelterChaseMice() {
		testShelter.admit(organicCatTest1);
		testShelter.admit(roboticCatTest1);
		testShelter.haveAllCatsChaseMice();
		for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
			if (virtualPet instanceof ChaseMice) {
				int isThisWorking = ((VirtualPet) virtualPet).getHappiness();
				assertEquals(105, isThisWorking);
			}
		}
	}

@Test
public void allDogCagesShouldBeCleaned() {
	testShelter.admit(organicDogTest1);
	testShelter.cleanAllDogCages();
	for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
		if (virtualPet instanceof OrganicDog) {
			int isThisWorking = ((OrganicDog) virtualPet).getWasteInCage();
			assertEquals(-40, isThisWorking);
		}
	}
}
	@Test
	public void ifTickIsDecreasingHealthOnShelterPets() {
		testShelter.admit(virtualPetTest1);
		testShelter.callTickForAllPets();
		for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
			if (virtualPet instanceof Tick) {
				int isThisWorking = ((VirtualPet) virtualPet).getHappiness();
				assertEquals(90, isThisWorking);
			}
		}
	}

@Test
public void totalLitterBoxWasteShouldDecreaseBy40IfCleaned () {
	testShelter.admit(organicCatTest1);
	testShelter.cleanTheOneLitterBox();
	for (VirtualPet virtualPet : testShelter.getAllPetsStatus()) {
		if (virtualPet instanceof OrganicCat) {
			int isThisWorking = ((OrganicCat) virtualPet).getWasteInLitterBox();
			assertEquals(-40, isThisWorking);
		}
	}
}
}

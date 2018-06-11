	import org.junit.Test;
	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;

public class OrganicDogTest {
	OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
	
	@Test
	public void walkingOrganicDogShouldIncreaseHappiness() {
		OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
		int organicDogBeforeDogWalk = organicDog.getHappiness();
		
		organicDog.walkingTheDog(organicDog);
		int organicDogAfterDogWalk = organicDog.getHappiness();
		assertThat(organicDogAfterDogWalk, is(equalTo(organicDogBeforeDogWalk +5)));
	}
	@Test
	public void walkingOrganicDogShouldDecreaseNeedToProduceWaste() {
		OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
		int organicDogBeforeDogWalk = organicDog.getNeedToProduceWaste();
		organicDog.walkingTheDog(organicDog);
		int organicDogAfterDogWalk = organicDog.getNeedToProduceWaste();
		assertThat(organicDogAfterDogWalk, is (equalTo(organicDogBeforeDogWalk -10)));
	}
	@Test
	public void releasesWaste() {
		OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
		int organicDogBeforeReleaseWaste = organicDog.getNeedToProduceWaste();
		organicDog.releasesWaste();
		int organicDogAfterReleaseWaste = organicDog.getNeedToProduceWaste();
		assertThat(organicDogAfterReleaseWaste, is(equalTo(organicDogBeforeReleaseWaste - 3)));
	}
	@Test
	public void releasesWasteShouldIncreaseWasteInCage() {
		OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
		int organicDogBeforeReleaseWaste = organicDog.getWasteInCage();
		organicDog.releasesWaste();
		int organicDogAfterReleaseWaste = organicDog.getWasteInCage();
		assertThat(organicDogAfterReleaseWaste, is(equalTo(organicDogBeforeReleaseWaste +10)));
	}
	@Test
	public void cleanCageShouldDecreaseWasteInCage() {
		OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
		int organicDogBeforeReleaseWaste = organicDog.getWasteInCage();
		organicDog.cleanCage();
		int organicDogAfterReleaseWaste = organicDog.getWasteInCage();
		assertThat(organicDogAfterReleaseWaste, is(equalTo(organicDogBeforeReleaseWaste -40)));
	}
	@Test
	public void tickShouldCallReleaseWasteMethod() {
		OrganicDog organicDog = new OrganicDog ("OrganicDog1", "OrganicDogV1", 100, 100, 100, 100, 0, 0);
		int organicDogBeforeReleaseWaste = organicDog.getWasteInCage();
		organicDog.tick(organicDog);
		int organicDogAfterReleaseWaste = organicDog.getWasteInCage();
		assertThat(organicDogAfterReleaseWaste, is(equalTo(organicDogBeforeReleaseWaste +10)));
	}
}

	import org.junit.Test;
	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;

public class OrganicCatTest {
	OrganicCat organicCat = new OrganicCat("OrganicCat1", "OrganicCatV1", 100, 100, 100, 100, 0, 0);

@Test
public void chasingMiceShouldIncreaseHappiness() {
	OrganicCat organicCat = new OrganicCat ("OrganicCat1", "OrganicCatV1", 100, 100, 100, 100, 0, 0);
	int organicCatBeforeChasingMice = organicCat.getHappiness();
	
	organicCat.chasedMice(organicCat);
	int organicCatAfterChasingMice = organicCat.getHappiness();
	assertThat(organicCatAfterChasingMice, is(equalTo(organicCatBeforeChasingMice +5)));
}
@Test
public void releasesWaste() {
	OrganicCat organicCat = new OrganicCat ("OrganicCat1", "OrganicCatV1", 100, 100, 100, 100, 0, 0);
	int organicCatBeforeReleaseWaste = organicCat.getNeedToProduceWaste();
	organicCat.releasesWaste();
	int organicCatAfterReleaseWaste = organicCat.getNeedToProduceWaste();
	assertThat(organicCatAfterReleaseWaste, is(equalTo(organicCatBeforeReleaseWaste - 3)));
}
@Test
public void releasesWasteShouldIncreaseWasteInLitterBox() {
	OrganicCat organicCat = new OrganicCat ("OrganicCat1", "OrganicCatV1", 100, 100, 100, 100, 0, 0);
	int organicCatBeforeReleaseWaste = organicCat.getWasteInLitterBox();
	organicCat.releasesWaste();
	int organicCatAfterReleaseWaste = organicCat.getWasteInLitterBox();
	assertThat(organicCatAfterReleaseWaste, is(equalTo(organicCatBeforeReleaseWaste +10)));
}
@Test
public void cleanCageShouldDecreaseWasteInLitterBox() {
	OrganicCat organicCat = new OrganicCat ("OrganicCat1", "OrganicCatV1", 100, 100, 100, 100, 0, 0);
	int organicCatBeforeReleaseWaste = organicCat.getWasteInLitterBox();
	organicCat.cleanLitterBox();
	int organicCatAfterReleaseWaste = organicCat.getWasteInLitterBox();
	assertThat(organicCatAfterReleaseWaste, is(equalTo(organicCatBeforeReleaseWaste -40)));
}
@Test
public void tickShouldCallReleaseWasteMethod() {
	OrganicCat organicCat = new OrganicCat ("OrganicCat1", "OrganicCatV1", 100, 100, 100, 100, 0, 0);
	int organicCatBeforeReleaseWaste = organicCat.getWasteInLitterBox();
	organicCat.tick(organicCat);
	int organicCatAfterReleaseWaste = organicCat.getWasteInLitterBox();
	assertThat(organicCatAfterReleaseWaste, is(equalTo(organicCatBeforeReleaseWaste +10)));
}
}
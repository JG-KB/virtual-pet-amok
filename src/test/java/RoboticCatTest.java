import org.junit.Test;
	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;
	
public class RoboticCatTest {
	RoboticCat roboticCat = new RoboticCat ("RobiticCat1", "RobiticCatV1", 100, 100,100);
	
	@Test
	public void chasingMiceShouldIncreaseHappiness() {
		RoboticCat roboticCat = new RoboticCat ("RobiticCat1", "RobiticCatV1", 100, 100,100);
		int roboticCatBeforeChasingMice = roboticCat.getHappiness();
		
		roboticCat.chasedMice(roboticCat);
		int roboticCatAfterChasingMice= roboticCat.getHappiness();
		assertThat(roboticCatAfterChasingMice, is(equalTo(roboticCatBeforeChasingMice +5)));
	}
	@Test
	public void chasingMiceShouldDecreaseOilLevel() {
		RoboticCat roboticCat = new RoboticCat ("RobiticCat1", "RobiticCatV1", 100, 100,100);
		int roboticCatBeforeChasingMice = roboticCat.getOilLevel();
		
		roboticCat.chasedMice(roboticCat);
		int roboticCatAfterChasingMice= roboticCat.getOilLevel();
		assertThat(roboticCatAfterChasingMice, is(equalTo(roboticCatBeforeChasingMice -5)));
}
}
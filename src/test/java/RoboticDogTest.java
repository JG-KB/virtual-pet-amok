
	import org.junit.Test;
	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;

	public class RoboticDogTest {
		RoboticDog roboticDog = new RoboticDog ("RoboticDog1", "RoboticDogV1", 100, 100, 100);
		
		@Test
		public void walkingRoboticDogShouldIncreaseHappiness() {
			RoboticDog roboticDog = new RoboticDog ("RoboticDog1", "RoboticDogV1", 100, 100, 100);
			int roboticDogBeforeDogWalk= roboticDog.getHappiness();
			roboticDog.walkingTheDog(roboticDog);
			int roboticDogAfterDogWalk=roboticDog.getHappiness();
			assertThat(roboticDogAfterDogWalk, is(equalTo(roboticDogBeforeDogWalk +5)));
		}
		@Test
		public void walkingRoboticDogShouldDecreaseOilLevel() {
			RoboticDog roboticDog = new RoboticDog ("RoboticDog1", "RoboticDogV1", 100, 100, 100);
			int roboticDogBeforeDogWalk= roboticDog.getOilLevel();
			roboticDog.walkingTheDog(roboticDog);
			int roboticDogAfterDogWalk=roboticDog.getOilLevel();
			assertThat(roboticDogAfterDogWalk, is(equalTo(roboticDogBeforeDogWalk -5)));
			
		}
		
		
	}


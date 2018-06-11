import org.junit.Test;
	import static org.hamcrest.Matchers.*;
	import static org.junit.Assert.assertThat;

public class VirtualPetTest {
	VirtualPet virtualPet = new VirtualPet("petName", "description", 100, 100);
	
	@Test
	public void tickShouldDecreaseHappiness() {
		VirtualPet virtualPet = new VirtualPet("petName", "description", 100, 100);
		int virtualPetBeforeTick = virtualPet.getHappiness();
		virtualPet.tick(virtualPet);
		int virtualPetAfterTick = virtualPet.getHappiness();
		assertThat(virtualPetAfterTick, is(equalTo(virtualPetBeforeTick -10)));
	}
	@Test
	public void tickShouldDecreaseHealth() {
		VirtualPet virtualPet = new VirtualPet("petName", "description", 100, 100);
		int virtualPetBeforeTick = virtualPet.getHealth();
		virtualPet.tick(virtualPet);
		int virtualPetAfterTick = virtualPet.getHealth();
		assertThat(virtualPetAfterTick, is(equalTo(virtualPetBeforeTick -10)));
	}
}




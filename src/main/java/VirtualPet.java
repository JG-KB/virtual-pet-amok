
public  class VirtualPet implements Tick {
	
	private String petName;
	private String description;
	protected int health;
	protected int happiness;
	
	
	public VirtualPet(String petName, String description, int health, int happiness) {
		super ();
		this.petName=petName;
		this.description=description;
		this.health=health;
		this.happiness= happiness;
	}
	
	public String getPetName() {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public void tick(VirtualPet virtualPet) {
		health-=10;
		happiness-=10;		
		
	}
	
		
	}

	
	
		
	

	


	

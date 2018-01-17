package pokemon.model;

public class Lillipup extends Pokemon implements Normal
{

	public Lillipup()
	{
		super(506, "Lillipup");
		setup();
	}
	
	public Lillipup(String name)
	{
		super(506, name);
		setup();
	}
	
	public Lillipup(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void fakeTears()
	{
		System.out.println("The opposing pokemon's attack failed");
	}
	public int tackle()
	{
		int tackleDamage = 30;
		
		return tackleDamage;
	}
	
	public String helpingHand()
	{
		return "there is no pokemon to use helping hand on";
	}
	
	protected void setup()
	{
		this.setAttackPoints(50);
		this.setCanEvolve(true);
		this.setEnhancementModifier(0.75);
		this.setHealthPoints(80);
	}
}

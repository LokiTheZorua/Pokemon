package pokemon.model;

public class Shinx extends Pokemon implements Electric 
{
	public Shinx()
	{
		super(403, "Shinx");
		setup();
	}
	
	public Shinx(String name)
	{
		super(403, name);
		setup();
	}
	public Shinx(int number, String name)
	{
		super(number, name);
		setup();
	}
	public void spark()
	{
		System.out.print("Shinx's electric damage rose!");
	}
	public String voltTackle()
	{
		return "The attack missed!";
	}
	public int thunder()
	{
		int thunderDamage = 120;
		
		return thunderDamage;
	}
	
	protected void setup()
	{
		this.setAttackPoints(90);
		this.setCanEvolve(true);
		this.setEnhancementModifier(1.0);
		this.setHealthPoints(50);
	}
}

package pokemon.model;

public class Helioptile extends Pokemon implements Normal, Electric
{
	public Helioptile()
	{
		super(694, "Helioptile");
		setup();
	}
	
	public Helioptile(String name)
	{
		super(694, name);
		setup();
	}
	
	public Helioptile(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void spark()
	{
		System.out.print("The pokemon's electric damage is raised!");
	}
	public String voltTackle()
	{
		return "Volt tackle missed!";
	}
	public int thunder()
	{
		int thunderDamage = 120;
		
		return thunderDamage;
	}
	public void fakeTears()
	{
		System.out.print(" the opposing pokemon's damage fell");
	}
	public int tackle()
	{
		int tackleDamage = 40;
		
		return tackleDamage;
	}
	public String helpingHand()
	{
		return "There is no pokemon to use helping hand on";
	}
	
	protected void setup()
	{
		this.setAttackPoints(60);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.8);
		this.setHealthPoints(140);
	}
}

package pokemon.model;

public class Helioptile extends Pokemon implements Normal, Electric
{
	public Helioptile()
	{
		super(694, "Helioptitle");
	}
	
	public Helioptile(String name)
	{
		super(694, name);
	}
	
	public Helioptile(int number, String name)
	{
		super(number, name);
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
}

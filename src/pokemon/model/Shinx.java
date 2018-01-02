package pokemon.model;

public class Shinx extends Pokemon implements Electric 
{
	public Shinx()
	{
		super(403, "Shinx");
	}
	
	public Shinx(String name)
	{
		super(403, name);
	}
	public Shinx(int number, String name)
	{
		super(number, name);
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
}

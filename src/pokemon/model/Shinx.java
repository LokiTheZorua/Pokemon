package pokemon.model;

public class Shinx extends Pokemon implements Electric 
{
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

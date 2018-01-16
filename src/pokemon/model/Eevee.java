package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee()
	{
		super(133, "Eevee");
	}
	
	public Eevee(String name)
	{
		super (133, name);
	}
	
	public Eevee(int number, String name)
	{
		super(number, name);
	}
	public void fakeTears()
	{
		System.out.print("The opposing pokemons attacked fell");
	}
	public int tackle()
	{
		int tackleDamage = 40;
		
		return tackleDamage;
	}
	public String helpingHand()
	{
		return "there is no pokemon to use helping hand on";
	}
	protected void setup()
	{
		this.setAttackPoints(40);
		this.setCanEvolve(true);
		this.setEnhancementModifier(0.99);
		this.setHealthPoints(80);
	}
}

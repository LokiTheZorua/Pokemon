package pokemon.model;

public class Zorua extends Pokemon implements Dark
{
	public Zorua(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public Zorua()
	{
		super(570, "Zorua");
		setup();
	}
	
	public Zorua(String name)
	{
		
		super(570, name);
		setup();
	}
	
	public void punishment()
	{
		System.out.print("Punishment did nothing");
	}
	
	public String nastyPlot()
	{
		return "Zorua is forming a plot, Zorua's Special Attack went up!";
	}
	
	public int bite(int biteDamage)
	{
		int damage = 60;
		
		return damage;
	}
	

	protected void setup()
	{
		this.setAttackPoints(70);
		this.setCanEvolve(true);
		this.setEnhancementModifier(1.09);
		this.setHealthPoints(70);
	}
}

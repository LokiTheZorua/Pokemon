package pokemon.model;

public class Zoroark extends Zorua implements Dark
{
	public Zoroark()
	{
		super(751, "Zoroark");
		setup();
	}
	
	public Zoroark(String name)
	{
		super(571, name);
		setup();
	}
	
	public Zoroark(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void punishment()
	{
		System.out.print("Punishment did nothing");
	}
	
	public String nastyPlot()
	{
		return "Zoroark is fromulating a plot, it's special attack went up!";
	}
	
	public int bite(int biteDamage)
	{
		int damage = 70;
		
		return damage;
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(150);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1.3);
		this.setHealthPoints(200);
	}
}

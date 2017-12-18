package pokemon.model;

public class Zoroark extends Zorua implements Dark
{
	public Zoroark(int number, String name)
	{
		super(number, name);
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
}

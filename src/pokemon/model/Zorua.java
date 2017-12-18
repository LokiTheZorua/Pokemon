package pokemon.model;

public class Zorua extends Pokemon implements Dark
{
	public Zorua(int number, String name)
	{
		super(number, name);
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
}

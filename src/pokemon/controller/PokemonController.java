package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.List;
import java.util.ArrayList;
import pokemon.view.PokemonFrame;
import pokemon.model.Eevee;
import pokemon.model.Zorua;
import pokemon.model.Zoroark;
import pokemon.model.Shinx;
import pokemon.model.Lillipup;
import pokemon.model.Helioptile;

public class PokemonController
{
	
	public void start()
	{
		
	}
	
	private List<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Zorua());
		pokedex.add(new Zoroark("Zoroark"));
		pokedex.add(new Eevee(133, "Eevee"));
		pokedex.add(new Shinx());
		pokedex.add(new Helioptile());
		pokedex.add(new Lillipup());
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex= new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	
}

package ea.beispiel;

import ea.Szene;
import ea.android.GameSzenenActivity;

public class BeispielActivity extends GameSzenenActivity
{

	public Hauptmenue hauptMenue;
	public Game game;
	
	@Override
	public Szene init() 
	{
		hauptMenue = new Hauptmenue(this);
		game = new Game(this);
		
		return hauptMenue;
	}
	
	public Hauptmenue menue()
	{
		return hauptMenue;
	}
	
	public Game game()
	{
		return game;
	}
}

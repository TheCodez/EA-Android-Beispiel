package ea.beispiel;

import ea.Farbe;
import ea.Kreis;
import ea.Szene;
import ea.android.TouchEvent;

public class Game  extends Szene
{
	public BeispielActivity activity;
	
	public Game(BeispielActivity t) 
	{
		activity = t;
		
		int hoehe = activity.hoehe() / 2;
		int breite = activity.breite() / 2;
		
		hinzufuegen(new Kreis(breite, hoehe, 100));
		
		hintergrundFarbeSetze(Farbe.Rot);
	}
	
	@Override
	public void touchReagieren(float x, float y, TouchEvent event)
	{
		if(event == TouchEvent.Losgelassen)	
		{
			activity.setzeSzene(activity.menue());
		}
	}
}

package ea.beispiel;

import ea.Farbe;
import ea.Szene;
import ea.android.TouchEvent;

public class Hauptmenue extends Szene
{
	public BeispielActivity activity;
	
	public Hauptmenue(BeispielActivity t) 
	{
		activity = t;
		hintergrundFarbeSetze(Farbe.Blau);
	}
	
	@Override
	public void touchReagieren(float x, float y, TouchEvent event) 
	{
		
		if(event == TouchEvent.Losgelassen)
		{
			activity.setzeSzene(activity.game());
		}
	}
	
}

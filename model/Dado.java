package model;

import java.util.Random;
import java.awt.Color;
import java.lang.Integer;

class Dado 
{
	private int faceUp;

	void rolaDado() 
	{
		Random r = new Random();
		faceUp = r.nextInt(5)+1;
	}

	int getDado() 
	{
		return faceUp;
	}
  
	Color getCor()
	{
		switch(this.faceUp)
		{
			case 1:
				return Color.BLACK;
	  	
			case 2:
				return Color.BLUE;
	  		
			case 3:
				return Color.YELLOW;
	  	
			case 4:
				return Color.GREEN;
				
			case 5:
				return Color.RED;	  		
	  		
			default:
				return Color.WHITE; // Nada Acontece
				
	  }
		
  }
	
}

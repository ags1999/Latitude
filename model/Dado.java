package model;

import java.util.Random;

public class Dado {
  private int faceUp;
  private Random r;
  private int cor=-1;


  public Dado() {
    faceUp = 0;
    r = new Random();
  }

  public int rolaDado() {
    faceUp = r.nextInt(5)+1;
    return faceUp;
  }

  public int getDado() {
    return faceUp;
  }

	public int colorido(int d1, int d2) {
		if (d1 == d2){
    	this.cor = rolaDado();
			return cor;
    }
	}

}



/**
Dado colorido e normal são quse que identicos, usar os numeros da dado como cor

*/
package model;

class Explorador
{
	Jogador dono;
	private int latitude;
	private final int latIni;
	private int longitude;
	private int objetivo;
  
  
	Explorador(int latIni, Jogador dono)
	{
		this.latIni = latIni;
		this.latitude = latIni;
		this.dono = dono;
	}
	
	boolean movimentoValido(int latitude, int longitude)
	{
		Casa c1 = Tabuleiro.getTabuleiro().getCasa(latitude, longitude);
		if(!c1.fechada || (c1.numJogadores > 1))
		{
			return true;
		}
		return false;
	}
	
	void movimentoLatitude(int addLatitude)
	{
		int novaLatitude = this.latitude;
		if(this.latIni == 0)  // inicio no lado esquerdo
		{
			novaLatitude += addLatitude;
		}
		else // inicio no lado direito;
		{
			novaLatitude -= latitude;
		}
		if(novaLatitude < 0)
		{
			novaLatitude = 0;
		}
		else if(novaLatitude > 13)
		{
			novaLatitude = 13;
		}
		setMovimento(novaLatitude, this.longitude);
	}
	
	void movimentoLongitude(int addLongitude)
	{
		int novaLongitude = this.longitude + addLongitude;
		
		if(novaLongitude > 11) // ajuste na longitude
		{
			novaLongitude -= 12;
		}
		else if (novaLongitude < 0)
		{
			this.longitude += 12;
		}
    setMovimento(this.latitude, novaLongitude);
	}
	
	boolean setMovimento(int latitude, int longitude)
	{
		if(movimentoValido(latitude, longitude))
		{
			this.latitude = latitude;
			this.longitude = longitude;
			return true;
		}
		return false;
	}
	
		
  //movimento inicial
  /*
  protected boolean movimento(int latitude, int longitude, int longIni)
  {
    this.longitude = longIni;
    return this.movimento(latitude, longitude);
  }
  */
  protected int getLatitude()
  {
    return this.latitude;
  }

  protected int getLongitude()
  {
    return this.longitude;
  }
}
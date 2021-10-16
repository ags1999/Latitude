package model;

class Explorador
{
  int latitude;
  final int latIni;
  int longitude;
  final int longIni;
  Jogador dono;

  protected Explorador()
  {
    
  }

  protected void movimento(int latitude, int longitude)
  {
    this.latitude += latitude;
    this.longitude += longitude;
  }
  
  protected void movimento(int latitude, int longitude, int longIni)
  {
    this.longitude = longIni;
    this.latitude += latitude;
    this.longitude += longitude;
  }

}
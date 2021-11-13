package model;
import java.lang.Math;

class Tabuleiro
{
	private static Tabuleiro T1;
	private Casa[][] matrizTab = new Casa[14][12] ; //[latitude][longitude]
  /*
   * Casa normal tem valor 0
   * Casa fechada tem valor -1
   * Casa com meta tem valor 1
   */
  
	private Tabuleiro() 
	{
		int i;
		for(i = 0; i < 14; i++)// inicializa casas
		{
			for(int j = 0; j < 12; j++)
			{
				matrizTab[i][j] = new Casa();
				matrizTab[i][j].fechada = false;
				matrizTab[i][j].time = 0;
				matrizTab[i][j].meta = false;
			}
		}

		i = 0;
		while(i < 12) //atribui metas
		{
			int latitude = gerador(1,12);
			int longitude = gerador (0,11);
			if(matrizTab[latitude][longitude].meta == false)
			{
				matrizTab[latitude][longitude].meta = true;
				i++;
			}
		}
   
	}
  
  
	private static int gerador(int min, int max)
	{
		int range = (max-min);
		return (int)(Math.random()*range) + min;
	}
  
  /*
  void modificaTabuleiro(int value, int latitude, int longitude)
  {
    matrizTab[latitude][longitude] = value;
  }
	*/
  
  	Casa getCasa(int latitude, int longitude)
  	{
  		return matrizTab[latitude][longitude];
  	}
  
  	static Tabuleiro getTabuleiro()
  	{
  		if(T1 == null)
  		{
  			T1 = new Tabuleiro();
  		}
  		return T1;
  	}
  
}


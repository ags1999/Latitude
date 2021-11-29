package model;
import java.lang.Math;

class Tabuleiro
{
	private static Tabuleiro T1;
	private Casa[][] matrizTab = new Casa[14][12] ; //[latitude][longitude]
	private Carta cartas[] = new Carta[18];
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
	
	private Carta [] setCartas()
  	{
  		Carta cartas[] = new Carta[3];
  		String texto1 = "Ande com um de seus exploradores 6 casas no sentido que desejar (latitude ou longitude)";
  		int movimento1 = 6;
  		Carta carta1 = new Carta(texto1, movimento1);
  		
  		String texto2 = "Escolha um dos seus exploradores e avance 3 casas (latitude ou longitude)";
  		int movimento2 = 3;
  		Carta carta2 = new Carta(texto2, movimento2);
  		
  		String texto3 = "Jogue novamente com um dado e ande com qualquer um de seus exploradores";
  		Dado temp = new Dado();
  		temp.rolaDado();
  		int movimento3 = temp.getDado();
  		Carta carta3 = new Carta(texto3, movimento3);
  		
  		cartas[0] = carta1;
  		cartas[1] = carta2;
  		cartas[2] = carta3;
  		
  		return cartas;
  	}
	
	private Carta getCarta(Carta[] deck)
  	{
  		Random cart = new Random();
  		return deck[cart.nextInt(17)];		// Para testar cartas implementadas, trocar 17 por 2
  	}
  
}


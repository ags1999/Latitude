package model;

import java.awt.Color;

public class ModelAPI
{
	final Tabuleiro mapa = Tabuleiro.getTabuleiro();
	final Jogador P1;
	final Jogador P2;
	final Jogador P3;
	final Jogador P4;
	final Dado D1;

	private static ModelAPI Jogo;
  
	private ModelAPI(int numJogadores, int modo)
	{
		P1 = new Jogador(Color.BLACK, 1, 0);
		P2 = new Jogador(Color.GREEN, 2, 0);

		if(numJogadores == 2)
		{
			P3 = null;
			P4 = null;
		}

		else
		{
			P3 = new Jogador(Color.YELLOW, 3, 13);
			P4 = new Jogador(Color.BLUE, 4, 13 );
		}
		D1 = new Dado();

    
	}
	
	public ModelAPI getModelAPI()
	{
		return Jogo;
	}

	public void novoJogo(int numJogadores, int modo)
	{
		Jogo = new ModelAPI(numJogadores, modo);
	}
	
	public Object rolaDado(boolean dadoColorido)
	{
		D1.rolaDado();
		if(dadoColorido) 
		{
			return D1.getCor();
		}
		else
		{
			return D1.getDado();
		}
		
	}
	
}
package model;

import java.awt.Color;
import java.beans.PropertyChangeSupport;

public class ModelAPI
{
	final Tabuleiro mapa = Tabuleiro.getTabuleiro();
	final Jogador P1;
	final Jogador P2;
	final Jogador P3;
	final Jogador P4;
	public final Dado D1;
	public final Dado D2;
	public final Dado DC;

	private static ModelAPI Jogo;
  
	private ModelAPI(int numJogadores, int modo)
	{
		P1 = new Jogador(Color.BLACK, 1, 0);
		P2 = new Jogador(Color.GREEN, 2, 0);
		P3 = new Jogador(Color.YELLOW, 3, 13);
		P4 = new Jogador(Color.BLUE, 4, 13 );
				
		D1 = new Dado();
		D2 = new Dado();
		DC = new Dado();

    
	}
	
	public static ModelAPI getModelAPI()
	{
		return Jogo;
	}
	
	public static void novoJogo(int numJogadores, int modo)
	{
		Jogo = new ModelAPI(numJogadores, modo);
	}
	
	public Object rolaDado(boolean dadoColorido, Dado dado)
	{
		dado.rolaDado();
		if(dadoColorido) 
		{
			return dado.getCor();
		}
		else
		{
			return dado.getDado();
		}		
	}	
}

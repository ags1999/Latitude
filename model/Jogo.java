package model;

import java.awt.Color;

class Jogo 
{
	private static Jogo J1;
	final Tabuleiro mapa = Tabuleiro.getTabuleiro();
	final Jogador P1;
	final Jogador P2;
	final Jogador P3;
	final Jogador P4;
	public final Dado D1;
	public final Dado D2;
	public final Dado DC;
	
	private Jogo(int numJogadores, boolean modo)
	{
		
		P1 = new Jogador(Color.BLACK, 1, 0);
		P1.time = 1;
		P2 = new Jogador(Color.GREEN, 2, 0);
		P2.time = 2;
		if(numJogadores == 4) 
		{
			P3 = new Jogador(Color.YELLOW, 3, 13);
			P4 = new Jogador(Color.BLUE, 4, 13 );
			if(modo)
			{
				P3.time = 3;
				P4.time = 4;
			}
			else
			{
				P3.time = 1;
				P4.time = 2;
			}
		}
		else 
		{
			P3 = null;
			P4 = null;
		}
		
		
		D1 = new Dado();
		D2 = new Dado();
		DC = new Dado();

    
	}
	
	static Jogo getJogo(int numJogadores, boolean modo)
	{
		if(J1 == null)
		{
			J1 = new Jogo(numJogadores, modo);
		}
		return J1;
	}
}

package model;

import java.awt.Color;

class Jogo 
{
	static Jogo J1;
	final Tabuleiro mapa = Tabuleiro.getTabuleiro();
	final Jogador P1;
	final Jogador P2;
	final Jogador P3;
	final Jogador P4;
	public final Dado D1;
	public final Dado D2;
	public final Dado DC;
	Jogador atual;
	
	private Jogo(int numJogadores, boolean modo)
	{
		
		
		P1 = new Jogador(Color.BLACK, 1, 0);
		P1.time = 1;
		atual = P1;
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
	
	void proximoJogador()
	{
		if(this.atual == P1)
		{
			this.atual = P2;
		}
		else if(this.atual == P2)
		{
			if(P3 == null)
			{
				this.atual = P1;
			}
			else
			{
				this.atual = P3;
			}
		}
		else if(this.atual == P3)
		{
			this.atual = P4;
		}
		else if(this.atual == P4)
		{
			this.atual = P1;
		}
	}
	
	static Jogo getJogo(int numJogadores, boolean modo)
	{
		if(J1 == null)
		{
			J1 = new Jogo(numJogadores, modo);
		}
		return J1;
	}
	
	Jogador defineVencedor(Jogador[] jogadores)
	{
		int pontuacao[] = new int[4];
		int pontos1 = jogadores[0].getPontos();
		int pontos2 = jogadores[1].getPontos();
		int pontos3 = jogadores[2].getPontos();
		int pontos4 = jogadores[3].getPontos();
		pontuacao[0] = pontos1;
		pontuacao[1] = pontos2;
		pontuacao[2] = pontos3;
		pontuacao[3] = pontos4;
		int i;
		int maior = -1;
		Jogador maiorJ = null;
		for(i=0; i<4; i++)
		{
			if (pontuacao[i]>maior)
			{
				maior = pontuacao[i];
				maiorJ = jogadores[i];
			}
		}
		
		if (maiorJ==null)
		{
			System.out.print("Erro na contagem de pontos.");
			return null;
		}
		
		return maiorJ;
	}
}

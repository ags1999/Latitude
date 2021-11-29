package model;

import java.awt.Color;
import java.beans.PropertyChangeSupport;

import controller.Controller;

public class ModelAPI
{
	

	private static Jogo J1;
	private static ModelAPI API;
	
	
	public static ModelAPI getModelAPI()
	{
		return API;
	}
	
	public static void novoJogo(int numJogadores, boolean modo)
	{
		J1 = Jogo.getJogo(numJogadores, modo);
		Controller.inicio();
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
	
	public Color getCorJogAtual()
	{
		return J1.atual.getColor();
	}

	public void movimento(Explorador atual, boolean latitude, boolean avancar, int valor)
	{
    
		Explorador ExpAtual = atual;
		int v = valor;
		if(!avancar)
		{
			v *= -1;
		}

		if(latitude)
		{
			ExpAtual.movimentoLatitude(v);
		}
		else
		{
			ExpAtual.movimentoLongitude(v);
		}
    }
	
	public static int getJogadorAtual()
	{
		return Jogo.J1.atual.getNumJogador();
	}
}

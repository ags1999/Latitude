package view;

import model.ModelAPI;
import controller.Controller;

import java.awt.*;

import javax.swing.JPanel;

public class ViewAPI 
{
	static byte PaginaAtual;
	public static ViewAPI V1;
	public static Janela J1 = Janela.getJanela();
	static JPanel cards = new JPanel();
	final CardLayout crd = new CardLayout();
	
	
	private ViewAPI()
	{
		PaginaAtual = 1;
		//cards.setLayout(crd);
		//cards.add(PainelInicial.getPainelInicial(), "Painel Inicial" );
		//cards.add(PainelTabuleiro.getPainelTabuleiro(), "Painel Tabuleiro");
		//J1.add(cards);
		J1.setVisible(true);
		J1.setResizable(false);
	}
	
	public static ViewAPI getViewAPI()
	{
		if(V1 == null)
		{
			V1 = new ViewAPI();
		}
		return V1;

	}
	
	public static void inicio()
	{
		Janela.getJanela().trocaPainel();
	}
	
	public static byte getPaginaAtual()
	{
		return PaginaAtual;
	}
	
	static void setModo(boolean modo)
	{
		Controller.setModo(modo);
	}
	
	static void setNumJogadores(int num)
	{
		Controller.setNumJogadores(num);
	}
	
	static void novoJogo()
	{
		Controller.novoJogo();
	}
	
	static int getNumJogadorAtual()
	{
		return Controller.getNumJogadorAtual();
	}
	
	static Object getRolaDado(boolean tipo)
	{
		return Controller.getRolaDado(tipo);
	}
	
}

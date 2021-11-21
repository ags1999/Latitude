package view;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
//import java.awt.event.*;

@SuppressWarnings("serial")
class Janela extends JFrame
{
	static Janela J1;
	public final int largura = 1200;
	public final int altura = 700;
	CardLayout crd = new CardLayout();
	JPanel cards = new JPanel();
	static JMenuBar mb = new JMenuBar();
	static JMenu MenuOpcoes = new JMenu("Opções");
	static JMenuItem salvar = new JMenuItem("Salvar"); 
	static JMenuItem debug = new JMenuItem("Debug"); 
	
	private Janela()
	{
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl = screenSize.width;
		int sa = screenSize.height;
		int x = sl/2 - largura/2;
		int y = sa/2 - altura/2;
		
		setBounds(x,y, largura,altura);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("LATITUDE 90");
		
		cards.setLayout(crd);
		
		
		//cards.add(PainelInicial.getPainelInicial(), "P1" );
		cards.add(PainelTabuleiro.getPainelTabuleiro(), "P2");
		
		MenuOpcoes.add(salvar);
		MenuOpcoes.add(debug);
		mb.add(MenuOpcoes);
		this.setJMenuBar(mb);
		setMenuVisibility(true);
		
		this.add(cards);

	}
	
	static void setMenuVisibility(boolean status)
	{
		mb.setVisible(status);
	}
	
	static Janela getJanela()
	{
		if(J1 == null)
		{
			J1 = new Janela();
		}
		return J1;
	}


	
	
	
	
}

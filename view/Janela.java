package view;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class Janela extends JFrame implements MouseListener
{
	static Janela J1;
	public final int largura = 1200;
	public final int altura = 700;
	CardLayout crd = new CardLayout();
	JPanel cards = new JPanel();
	
	
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
		
		
		cards.add(PainelInicial.getPainelInicial(), "P1" );
		cards.add(PainelTabuleiro.getPainelTabuleiro(), "P2");

		this.add(cards);
		addMouseListener(this);
	}

	static Janela getJanela()
	{
		if(J1 == null)
		{
			J1 = new Janela();
		}
		return J1;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		int x = arg0.getX();
		int y = arg0.getY();
		//System.out.print("hmmmJN\n");
		switch(ViewAPI.PaginaAtual)
		{
			case 1:
				PainelInicial.selecionaJogo(x, y);
				return;
			case 2:
				PainelInicial.selecionaNumJogadores(x, y);
				return;
			case 3:
				PainelInicial.selecionaModo(x, y);
				return;
			case 4:
				return;
			default:
				return;
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	
	
	
	
}

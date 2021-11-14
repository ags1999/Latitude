package view;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Janela extends JFrame implements MouseListener
{
	public final int largura = 1200;
	public final int altura = 700;
	CardLayout crd;
	
	JPanel cards = new JPanel();
	
	
	public Janela()
	{
		addMouseListener(this);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int sl = screenSize.width;
		int sa = screenSize.height;
		int x = sl/2 - largura/2;
		int y = sa/2 - altura/2;
		
		setBounds(x,y, largura,altura);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("LATITUDE 90");
		//setVisible(true);
		//getContentPane().add(PainelTabuleiro.getPainelTabuleiro());
		//getContentPane().add(PainelInicial.getPainelInicial());
		
		//Card Layout
		crd = new CardLayout();
		cards.setLayout(crd);
		
		
		cards.add(PainelInicial.getPainelInicial(), "P1" );
		cards.add(PainelTabuleiro.getPainelTabuleiro(), "P2");
		//crd.show(cards, "P1");
		System.out.print("Ok2\n");
		this.add(cards);
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		crd.next(cards);
		System.out.print("Ok\n");
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

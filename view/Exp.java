package view;

import java.awt.geom.*;
import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
class Exp extends Rectangle2D.Double
{
	Color CorJogador;
	static int altura = 8;
	static int largura = 8;
	int index;
	boolean selecionado;
	
	Exp(int x, int y, Color Jog, int index)
	{
		
		this.index = index;
		this.CorJogador = Jog;
		this.setRect(x, y, 8, 8);
	}
	
	void mover(int x, int y)
	{
		this.setRect(x, y, altura, largura);
	}
	
	Color getCor()
	{
		return this.CorJogador;
	}
	
	/*
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		this.selecionado = true;
		PainelTabuleiro.selecionado = this;
		PainelTabuleiro.getPainelTabuleiro().repaint();
		
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

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		if(arg0.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			this.selecionado = false;
		}
		PainelTabuleiro.selecionado = null;
		PainelTabuleiro.getPainelTabuleiro().repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	*/
}

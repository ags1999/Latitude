package view;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;


@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel implements MouseListener
{
	
	private static final int larguraImagem = 720;
	private static final int alturaImagem = 680;
	private static final int D1X = 800;
	private static final int D1Y = 300;
	private static final int D2X = 1000;
	private static final int D2Y = 300;
	private static final int DadoColoridoX = 50;
	private static final int DadoColoridoY = 50;

	private static PainelTabuleiro PN = null;
	private static Image bkg;
	private static Image dado1;
	private static Image dado2;
	private static Image dado3;
	private static Image dado4;
	private static Image dado5;
	private static Image dado6;
	
	private PainelTabuleiro()
	{
		addMouseListener(this);
		try 
		{
			bkg = ImageIO.read(getClass().getResource("/Imagens/Latitude90-Tabuleiro.png"));
			dado1 = ImageIO.read(getClass().getResource("/Imagens/Dado1.png"));
			dado2 = ImageIO.read(getClass().getResource("/Imagens/Dado2.png"));
			dado3 = ImageIO.read(getClass().getResource("/Imagens/Dado3.png"));
			dado4 = ImageIO.read(getClass().getResource("/Imagens/Dado4.png"));
			dado5 = ImageIO.read(getClass().getResource("/Imagens/Dado5.png"));
			dado6 = ImageIO.read(getClass().getResource("/Imagens/Dado6.png"));
			
			bkg = bkg.getScaledInstance(larguraImagem, alturaImagem, Image.SCALE_DEFAULT);
		}
		catch(IOException e) 
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		

	}
	
	private class IMouse implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
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
	
	private class IAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(bkg, 0, 0, null);
		
		g2d.setPaint(Color.GREEN);
		Ellipse2D centro1 = new Ellipse2D.Double();
		centro1.setFrameFromCenter(205,365,205+8,365+8);
		g2d.fill(centro1);
		setDado(g2d);
	}
	
	public static PainelTabuleiro getPainelTabuleiro()
	{
		if(PN == null)
			PN = new PainelTabuleiro();
		return PN;
	}
	
	void setDado(Graphics2D g)
	{
		g.drawImage(dado1, D1X, D1Y, null);
		g.drawImage(dado2, D2X, D2Y, null);
	}
	
	int[] getCoordenadas(int x, int y)
	{
		 int[] coordenadas;
		 int latitude = 0;
		 int longitude = 0;
		 
		 if(x < larguraImagem/2)
		 {
			 
		 }
		 
		 
		 coordenadas = new int[]{latitude, longitude};
		 return coordenadas;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		//TODO
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

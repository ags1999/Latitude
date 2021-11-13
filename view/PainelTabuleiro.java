package view;


import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;


@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel
{
	private static PainelTabuleiro PN = null;
	private static Image bkg;
	private final int larguraImagem = 720;
	private final int alturaImagem = 680;
	
	private PainelTabuleiro()
	{
		try 
		{
			bkg = ImageIO.read(new File("Imagens/Latitude90-Tabuleiro.png"));
			bkg = bkg.getScaledInstance(larguraImagem, alturaImagem, Image.SCALE_DEFAULT);
		}
		catch(IOException e) 
		{
			System.out.println(e.getMessage());
			System.exit(1);
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
	}
	
	public static PainelTabuleiro getPainelTabuleiro()
	{
		if(PN == null)
			PN = new PainelTabuleiro();
		return PN;
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
	
}

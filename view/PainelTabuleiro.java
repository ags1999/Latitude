package view;


import java.awt.*;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;


@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel
{
	private static PainelTabuleiro PN = null;
	private static Image bkg;
	
	private PainelTabuleiro()
	{
		try 
		{
			bkg = ImageIO.read(new File("Imagens/Latitude90-Tabuleiro.png"));
			bkg = bkg.getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
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
		
	}
	
	public static PainelTabuleiro getPainelTabuleiro()
	{
		if(PN == null)
			PN = new PainelTabuleiro();
		return PN;
	}
	
}

package view;
import java.awt.*;
import java.awt.geom.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

@SuppressWarnings("serial")
public class PainelInicial extends JPanel
{
	
	private static PainelInicial PN = null;
	private static Image bkg;
	
	private PainelInicial(){}
	
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
	
	public static PainelInicial getPainelInicial()
	{
		if(PN == null)
			PN = new PainelInicial();
		return PN;
	}

	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.WHITE);
		
		
		g.drawImage(bkg, 0, 0, null);
		
		Rectangle2D RetNovoJogo = new Rectangle2D.Double(400, 200, 400, 100);
		g2d.fill(RetNovoJogo);
		
		Rectangle2D RetCont = new Rectangle2D.Double(400, 400, 400, 100);
		g2d.fill(RetCont);
		
		
	}
	
	
}
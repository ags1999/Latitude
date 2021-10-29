package view;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PainelInicial extends JPanel
{
	
	
	
	public PainelInicial()
	{

	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D RetNovoJogo = new Rectangle2D.Double(400, 200, 400, 100);
		Rectangle2D RetCont = new Rectangle2D.Double(400, 400, 400, 100);
		g2d.draw(RetNovoJogo);
		g2d.draw(RetCont);
		
		
	}
	
	
}
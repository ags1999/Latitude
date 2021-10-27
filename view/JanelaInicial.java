package view;
import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanelaInicial extends JFrame
{
	
	public final int largura = 1200;
	public final int altura = 700;
	
	
	public JanelaInicial()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int sl = screenSize.width;
		int sa = screenSize.height;
		int x = sl/2 - largura/2;
		int y = sa/2 - altura/2;
		
		setBounds(x,y, largura,altura);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
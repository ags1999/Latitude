package view;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Janela extends JFrame
{
	public final int largura = 1200;
	public final int altura = 700;
	
	public Janela()
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
		setVisible(true);
		getContentPane().add(PainelTabuleiro.getPainelTabuleiro());
	}
}

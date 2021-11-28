package view;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

//import java.beans.PropertyChangeListener;

@SuppressWarnings("serial")
public class PainelInicial extends JPanel implements MouseListener
{
	
	private static PainelInicial PN = null;
	private static Image bkg;
	private static Font F1 = new Font("Arial", Font.BOLD, 40);
	static Rectangle2D BotaoSuperior = new Rectangle2D.Double(400, 200, 400, 100);
	static Rectangle2D BotaoInferior = new Rectangle2D.Double(400, 400, 400, 100);
	static Rectangle2D BotaoVoltar = new Rectangle2D.Double(000, 600, 150, 100);
	
	private PainelInicial()
	{
		addMouseListener(this);
		try 
		{
			bkg = ImageIO.read(getClass().getResource("/Imagens/Latitude90-Tabuleiro.png"));
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
		
		g2d.drawImage(bkg, 0, 0, null);
		
		g2d.setPaint(Color.WHITE);
		
		//Rectangle2D RetNovoJogo = new Rectangle2D.Double(400, 200, 400, 100);
		g2d.fill(BotaoSuperior);
		
		//Rectangle2D RetCont = new Rectangle2D.Double(400, 400, 400, 100);
		g2d.fill(BotaoInferior);
		
		
		if(ViewAPI.PaginaAtual > 1)
		{
			g2d.fill(BotaoVoltar);
			
		}
		
		setBotoes(g2d, ViewAPI.PaginaAtual);
		
	}
	
	private void setBotoes(Graphics2D g, int status)
	{
		g.setFont(F1);
		g.setColor(Color.BLACK);
		switch(status) 
		{
			case 1:
	
				g.drawString("Novo Jogo", 500, 260);
				g.drawString("Carregar Jogo", 460, 460);
				break;
			
			case 2:
				g.drawString("2 Jogadores", 480, 260);
				g.drawString("4 Jogadores", 480, 460);
				g.drawString("Voltar", 20, 650);
				break;
			
			case 3:
				g.drawString("Competitivo", 480, 260);
				g.drawString("Cooperativo", 480, 460);
				g.drawString("Voltar", 20, 650);
				break;
				
			default:
				System.out.print("Erro setbotoes");
				System.exit(1);
			
		}
	}

	static void selecionaJogo(int x, int y)
	{
		if(BotaoSuperior.contains(x, y))
		{
			ViewAPI.PaginaAtual = 2;
			//System.out.print("hmmmPN\n");
		}
		
		else
		{
			return;
		}
		PN.repaint();
	}
	
	static void selecionaNumJogadores(int x, int y)
	{
		if(BotaoSuperior.contains(x, y))
		{
			ViewAPI.PaginaAtual = 3;
			ViewAPI.setNumJogadores(2);
			ViewAPI.setModo(true);
			ViewAPI.novoJogo();
		}
		else if(BotaoInferior.contains(x, y)) 
		{
			ViewAPI.PaginaAtual = 3;
			ViewAPI.setNumJogadores(4);
		}
		else if(BotaoVoltar.contains(x, y)) 
		{
			ViewAPI.PaginaAtual--;
		}
		else
		{
			return;
		}
		PN.repaint();
	}
	
	static void selecionaModo(int x, int y)
	{
		if(BotaoSuperior.contains(x, y))
		{
			ViewAPI.setModo(true);
			ViewAPI.novoJogo();
			//ViewAPI.PaginaAtual = 4;
			//System.out.print("hmmmPN\n");
		}
		else if(BotaoInferior.contains(x, y))
		{
			ViewAPI.setModo(false);
			ViewAPI.novoJogo();
			//ViewAPI.PaginaAtual = 4;
			//System.out.print("hmmmPN\n");
		}
		else if(BotaoVoltar.contains(x, y)) 
		{
			ViewAPI.PaginaAtual--;
			PN.repaint();
		}
		else
		{
			return;
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
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
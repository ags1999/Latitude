package view;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.geom.Rectangle2D.Double;
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
	
	private static Rectangle2D.Double[][] Casas = new Rectangle2D.Double[14][12];
	
	private static PainelTabuleiro PN = null;
	private static Image bkg;
	private static Image dado1;
	private static Image dado2;
	private static Image dado3;
	private static Image dado4;
	private static Image dado5;
	private static Image dado6;
	
	private static Rectangle2D RetDados = new Rectangle2D.Double(850, 100, 200, 50);
	
	private static Font F1 = new Font("Arial", Font.BOLD, 30);
	private static Color verde = new Color(0, 255, 0, 150);
	
	private PainelTabuleiro()
	{
		addMouseListener(this);
		iniciaCasas();
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
	
	private static void iniciaCasas()
	{
		Casas[0][0] = new Rectangle2D.Double(175, 320, 45, 45);
		Casas[13][0] = new Rectangle2D.Double(510, 320, 45, 45);
		long0();
		long1();
		long2();
		long3();
		long4();
		long5();
		long6();
		long7();
		long8();
		long9();
		long10();
		long11();
		
	}
	
	/****************************************************/
	
	private static void long0()
	{
		Casas[1][0] = new Rectangle2D.Double(235, 330, 18, 15);
		Casas[2][0] = new Rectangle2D.Double(255, 320, 18, 20);
		Casas[3][0] = new Rectangle2D.Double(275, 310, 18, 30);
		Casas[4][0] = new Rectangle2D.Double(300, 300, 18, 40);
		Casas[5][0] = new Rectangle2D.Double(325, 290, 18, 50);
		Casas[6][0] = new Rectangle2D.Double(345, 280, 18, 60);
		
		Casas[7][0] = new Rectangle2D.Double(370, 280, 18, 60);
		Casas[8][0] = new Rectangle2D.Double(390, 290, 18, 50);
		Casas[9][0] = new Rectangle2D.Double(410, 300, 18, 40);
		Casas[10][0] = new Rectangle2D.Double(435, 310, 18, 30);
		Casas[11][0] = new Rectangle2D.Double(460, 320, 18, 20);
		Casas[12][0] = new Rectangle2D.Double(480, 330, 18, 15);
	}
	
	private static void long1() 
	{
		
		Casas[1][1] = new Rectangle2D.Double(220, 305, 20, 15);
		Casas[2][1] = new Rectangle2D.Double(240, 285, 20, 15);
		Casas[3][1] = new Rectangle2D.Double(255, 265, 20, 15);
		Casas[4][1] = new Rectangle2D.Double(275, 250, 20, 15);
		Casas[5][1] = new Rectangle2D.Double(295, 230, 20, 15);
		Casas[6][1] = new Rectangle2D.Double(315, 215, 20, 15);
		
		Casas[7][1] = new Rectangle2D.Double(490, 305, 20, 15);
		Casas[8][1] = new Rectangle2D.Double(475, 285, 20, 15);
		Casas[9][1] = new Rectangle2D.Double(455, 265, 20, 15);
		Casas[10][1] = new Rectangle2D.Double(435, 250, 20, 15);
		Casas[11][1] = new Rectangle2D.Double(415, 230, 20, 15);
		Casas[12][1] = new Rectangle2D.Double(395, 215, 20, 15);
				
	}
	
	private static void long2() 
	{
		
		Casas[1][2] = new Rectangle2D.Double(200, 295, 20, 15);
		Casas[2][2] = new Rectangle2D.Double(205, 270, 20, 15);
		Casas[3][2] = new Rectangle2D.Double(210, 245, 20, 15);
		Casas[4][2] = new Rectangle2D.Double(215, 220, 20, 15);
		Casas[5][2] = new Rectangle2D.Double(220, 200, 20, 15);
		Casas[6][2] = new Rectangle2D.Double(230, 180, 20, 15);
		
		Casas[7][2] = new Rectangle2D.Double(460, 180, 20, 15);
		Casas[8][2] = new Rectangle2D.Double(470, 200, 20, 15);
		Casas[9][2] = new Rectangle2D.Double(480, 220, 20, 15);
		Casas[10][2] = new Rectangle2D.Double(490, 245, 20, 15);
		Casas[11][2] = new Rectangle2D.Double(500, 270, 20, 15);
		Casas[12][2] = new Rectangle2D.Double(510, 295, 20, 15);
		
		
	}
	
	private static void long3() 
	{
		
		Casas[1][3] = new Rectangle2D.Double(175, 295, 20, 15);
		Casas[2][3] = new Rectangle2D.Double(165, 270, 20, 15);
		Casas[3][3] = new Rectangle2D.Double(155, 250, 20, 15);
		Casas[4][3] = new Rectangle2D.Double(145, 230, 20, 15);
		Casas[5][3] = new Rectangle2D.Double(135, 205, 20, 15);
		Casas[6][3] = new Rectangle2D.Double(125, 180, 20, 15);
		
		Casas[7][3] = new Rectangle2D.Double(570, 175, 20, 15);
		Casas[8][3] = new Rectangle2D.Double(560, 200, 20, 15);
		Casas[9][3] = new Rectangle2D.Double(550, 220, 20, 15);
		Casas[10][3] = new Rectangle2D.Double(540, 245, 20, 15);
		Casas[11][3] = new Rectangle2D.Double(535, 270, 20, 15);
		Casas[12][3] = new Rectangle2D.Double(530, 295, 20, 15);
	}
	
	private static void long4() 
	{
		Casas[1][4] = new Rectangle2D.Double(155, 305, 20, 15);
		Casas[2][4] = new Rectangle2D.Double(135, 285, 20, 15);
		Casas[3][4] = new Rectangle2D.Double(120, 270, 20, 15);
		Casas[4][4] = new Rectangle2D.Double(105, 255, 20, 15);
		Casas[5][4] = new Rectangle2D.Double(80, 240, 20, 15);
		Casas[6][4] = new Rectangle2D.Double(55, 220, 20, 15);
		
		Casas[7][4] = new Rectangle2D.Double(650, 220, 20, 15);
		Casas[8][4] = new Rectangle2D.Double(630, 235, 20, 15);
		Casas[9][4] = new Rectangle2D.Double(615, 255, 20, 15);
		Casas[10][4] = new Rectangle2D.Double(590, 270, 20, 15);
		Casas[11][4] = new Rectangle2D.Double(570, 285, 20, 15);
		Casas[12][4] = new Rectangle2D.Double(555, 305, 20, 15);
		
	}
	
	private static void long5() 
	{
		Casas[1][5] = new Rectangle2D.Double(145, 330, 18, 15);
		Casas[2][5] = new Rectangle2D.Double(125, 320, 18, 20);
		Casas[3][5] = new Rectangle2D.Double(105, 310, 18, 30);
		Casas[4][5] = new Rectangle2D.Double(80, 300, 18, 40);
		Casas[5][5] = new Rectangle2D.Double(60, 290, 18, 50);
		Casas[6][5] = new Rectangle2D.Double(35, 280, 18, 60);
		
		Casas[7][5] = new Rectangle2D.Double(675, 280, 18, 60);
		Casas[8][5] = new Rectangle2D.Double(655, 290, 18, 50);
		Casas[9][5] = new Rectangle2D.Double(630, 300, 18, 40);
		Casas[10][5] = new Rectangle2D.Double(610, 310, 18, 30);
		Casas[11][5] = new Rectangle2D.Double(590, 320, 18, 20);
		Casas[12][5] = new Rectangle2D.Double(570, 330, 18, 15);
		
	}
	
	private static void long6()
	{
		
		Casas[1][6] = new Rectangle2D.Double(145, 350, 18, 15);
		Casas[2][6] = new Rectangle2D.Double(125, 350, 18, 20);
		Casas[3][6] = new Rectangle2D.Double(105, 350, 18, 30);
		Casas[4][6] = new Rectangle2D.Double(80, 350, 18, 40);
		Casas[5][6] = new Rectangle2D.Double(60, 350, 18, 50);
		Casas[6][6] = new Rectangle2D.Double(35, 350, 18, 60);
		
		Casas[7][6] = new Rectangle2D.Double(675, 350, 18, 60);
		Casas[8][6] = new Rectangle2D.Double(655, 350, 18, 50);
		Casas[9][6] = new Rectangle2D.Double(630, 350, 18, 40);
		Casas[10][6] = new Rectangle2D.Double(610, 350, 18, 30);
		Casas[11][6] = new Rectangle2D.Double(590, 350, 18, 20);
		Casas[12][6] = new Rectangle2D.Double(570, 350, 18, 15);
	}
	
	private static void long7()
	{
		Casas[1][7] = new Rectangle2D.Double(155, 370, 20, 15);
		Casas[2][7] = new Rectangle2D.Double(135, 385, 20, 15);
		Casas[3][7] = new Rectangle2D.Double(120, 405, 20, 15);
		Casas[4][7] = new Rectangle2D.Double(105, 425, 20, 15);
		Casas[5][7] = new Rectangle2D.Double(80, 445, 20, 15);
		Casas[6][7] = new Rectangle2D.Double(55, 465, 20, 15);
		
		Casas[7][7] = new Rectangle2D.Double(650, 465, 20, 15);
		Casas[8][7] = new Rectangle2D.Double(630, 445, 20, 15);
		Casas[9][7] = new Rectangle2D.Double(615, 425, 20, 15);
		Casas[10][7] = new Rectangle2D.Double(590, 405, 20, 15);
		Casas[11][7] = new Rectangle2D.Double(570, 385, 20, 15);
		Casas[12][7] = new Rectangle2D.Double(555, 370, 20, 15);
	}
	
	private static void long8()
	{
		Casas[1][8] = new Rectangle2D.Double(180, 385, 20, 15);
		Casas[2][8] = new Rectangle2D.Double(165, 405, 20, 15);
		Casas[3][8] = new Rectangle2D.Double(155, 425, 20, 15);
		Casas[4][8] = new Rectangle2D.Double(145, 455, 20, 15);
		Casas[5][8] = new Rectangle2D.Double(135, 475, 20, 15);
		Casas[6][8] = new Rectangle2D.Double(125, 495, 20, 15);
		
		Casas[7][8] = new Rectangle2D.Double(570, 495, 20, 15);
		Casas[8][8] = new Rectangle2D.Double(560, 475, 20, 15);
		Casas[9][8] = new Rectangle2D.Double(550, 455, 20, 15);
		Casas[10][8] = new Rectangle2D.Double(540, 425, 20, 15);
		Casas[11][8] = new Rectangle2D.Double(535, 405, 20, 15);
		Casas[12][8] = new Rectangle2D.Double(530, 385, 20, 15);
	}
	
	private static void long9()
	{
		
		Casas[1][9] = new Rectangle2D.Double(200, 385, 20, 15);
		Casas[2][9] = new Rectangle2D.Double(205, 405, 20, 15);
		Casas[3][9] = new Rectangle2D.Double(210, 430, 20, 15);
		Casas[4][9] = new Rectangle2D.Double(215, 450, 20, 15);
		Casas[5][9] = new Rectangle2D.Double(220, 475, 20, 15);
		Casas[6][9] = new Rectangle2D.Double(230, 495, 20, 15);
		
		Casas[7][9] = new Rectangle2D.Double(460, 495, 20, 15);
		Casas[8][9] = new Rectangle2D.Double(470, 475, 20, 15);
		Casas[9][9] = new Rectangle2D.Double(480, 450, 20, 15);
		Casas[10][9] = new Rectangle2D.Double(490, 430, 20, 15);
		Casas[11][9] = new Rectangle2D.Double(500, 405, 20, 15);
		Casas[12][9] = new Rectangle2D.Double(510, 385, 20, 15);

	}
	
	private static void long10()
	{
		
		Casas[1][10] = new Rectangle2D.Double(220, 365, 20, 15);
		Casas[2][10] = new Rectangle2D.Double(240, 385, 20, 15);
		Casas[3][10] = new Rectangle2D.Double(255, 405, 20, 15);
		Casas[4][10] = new Rectangle2D.Double(275, 425, 20, 15);
		Casas[5][10] = new Rectangle2D.Double(295, 445, 20, 15);
		Casas[6][10] = new Rectangle2D.Double(315, 460, 20, 15);
		
		Casas[7][10] = new Rectangle2D.Double(395, 460, 20, 15);
		Casas[8][10] = new Rectangle2D.Double(415, 445, 20, 15);
		Casas[9][10] = new Rectangle2D.Double(435, 425, 20, 15);
		Casas[10][10] = new Rectangle2D.Double(455, 405, 20, 15);
		Casas[11][10] = new Rectangle2D.Double(475, 385, 20, 15);
		Casas[12][10] = new Rectangle2D.Double(490, 365, 20, 15);
		
	}
	
	private static void long11()
	{
		Casas[1][11] = new Rectangle2D.Double(235, 350, 18, 15);
		Casas[2][11] = new Rectangle2D.Double(255, 350, 18, 20);
		Casas[3][11] = new Rectangle2D.Double(275, 350, 18, 30);
		Casas[4][11] = new Rectangle2D.Double(300, 350, 18, 40);
		Casas[5][11] = new Rectangle2D.Double(325, 350, 18, 50);
		Casas[6][11] = new Rectangle2D.Double(345, 350, 18, 60);
		
		Casas[7][11] = new Rectangle2D.Double(370, 350, 18, 60);
		Casas[8][11] = new Rectangle2D.Double(390, 350, 18, 50);
		Casas[9][11] = new Rectangle2D.Double(410, 350, 18, 40);
		Casas[10][11] = new Rectangle2D.Double(435, 350, 18, 30);
		Casas[11][11] = new Rectangle2D.Double(460, 350, 18, 20);
		Casas[12][11] = new Rectangle2D.Double(480, 350, 18, 15);
	}
	
	
	/****************************************************/
	
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
	
	private void addCasas(Graphics2D g)
	{
		for(int i = 1; i < 13; i++)
		{
			for(int j = 0; j < 12; j++)
			{
				if(Casas[i][j] != null) 
				{
					g.fill(Casas[i][j]);
				}
			}
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(bkg, 0, 0, null);
		
		g2d.setColor(Color.WHITE);
		g2d.fill(RetDados);
		
		g2d.setColor(Color.BLACK);
		g2d.setFont(F1);
		g2d.drawString("Rolar Dados", 860, 140);
		
		g2d.setPaint(Color.GREEN);
		//Ellipse2D centro1 = new Ellipse2D.Double();
		//centro1.setFrameFromCenter(205,365,205+8,365+8);
		//g2d.fill(centro1);
		setDado(g2d);
		g2d.setPaint(verde);
		g2d.fill(Casas[0][0]);
		g2d.fill(Casas[13][0]);
		addCasas(g2d);
		
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

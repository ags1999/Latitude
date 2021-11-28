package model;

import static org.junit.Assert.*;
import org.junit.Test;
import model.*;
import java.awt.Color;

public class ExploradorTest {
	Tabuleiro T = new Tabuleiro();
	
	@Test
	public void criouExp()
	{
		Jogador J1 = new Jogador(Color.BLACK, 1, 0);
		Explorador ex1 = new Explorador(0,J1);
		assertNotNull("Criou novo explorador", ex1);
	}
	
	@Test
	public void verificaPos()
	{
		Jogador J1 = new Jogador(Color.BLACK, 1, 0);
		Explorador ex1 = new Explorador(0,J1);
		assertTrue(ex1.setMovimento(5, 7));
<<<<<<< HEAD
=======
		assertFalse(ex1.setMovimento(50, 70));
>>>>>>> branch 'master' of https://github.com/ags1999/Latitude.git
	}
}

package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TabuleiroTest {
	Tabuleiro T = new Tabuleiro();

	@Test
	public void retornoCasa() 
	{
		assertNotNull(T.getCasa(3,4));
	}
	
	@Test
	public void retornoTab()
	{
		assertNotNull(T.getTabuleiro());
	}

}

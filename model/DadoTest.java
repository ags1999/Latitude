package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DadoTest {
	Dado dado = new Dado();
	
	@Test
	public void valorDado() 
	{
		dado.rolaDado();
		assertNotNull("Atualizacao do valor do Dado", dado.getDado());
	}
	
	@Test
	public void corDado()
	{
		dado.rolaDado();
		assertNotNull("Atualizacao da cor do Dado", dado.getCor());
	}
	
	@Test
	public void testaRange()
	{
		dado.rolaDado();
		boolean dadoRange = (dado.getDado()>=1) && (dado.getDado()<=6);
		assertTrue("Funcao está retornando valores entre 1 e 6", dadoRange);
	}
}

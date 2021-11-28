package model;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Color;

public class JogadorTest {
	Jogador J1 = new Jogador(Color.BLACK, 1, 0);

	@Test
	public void alteraExp() {
		int num = 3;
		J1.setEXploradores(num);
		assertSame(num, J1.getExploradores());
	}
	
	@Test
	public void alteraPontos() {
		int pontos = 10;
		J1.setPontos(pontos);
		assertSame(pontos, J1.getPontos());
	}
	
	@Test
	public void alteraNum() {
		int num = 2;
		J1.setNumJogador(num);
		assertSame(num, J1.getNumJogador());
	}

}

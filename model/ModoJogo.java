package model;

class ModoJogo
{
	private static ModoJogo modo;
	public static String[] cores = {"Vermelho", "Verde", "Azul", "Preto", "Branco", "Amarelo"};
	private int modoJogo = 0;		// 1 para modo competitivo e -1 para modo em dupla
	public int numJogadores;
	private String nomeJogadores[] = new String[4];
	
	ModoJogo(int modoJ, int numJ)
	{
		this.modoJogo = modoJ;
		this.numJogadores = numJ;
	}
	
	public int getModo()
	{
		return this.modoJogo;
	}
	
	public void setModo(int modo)
	{
		this.modoJogo = modo;
	}
	
	private ModoJogo(int modo2, String[] nomes) {
		this.modoJogo = modo2;
		this.nomeJogadores = nomes;
	}
	
	public int getNumJogadores()
	{
		return this.numJogadores;
	}
	
	public String[] getJogadores() {
		return this.nomeJogadores;
	}
}

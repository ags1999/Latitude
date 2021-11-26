package model;

class ModoJogo
{
	private static ModoJogo modo;
	public static String[] cores = {"Vermelho", "Verde", "Azul", "Preto", "Branco", "Amarelo"};
	private int modoJogo = 0;
	public int numJogadores;
	private String nomeJogadores[] = new String[4];
	
	public static ModoJogo getModo(ModoJogo modoJogo, String[] nomes) {
		if (modoJogo == null)
			try {
				modoJogo = new ModoJogo(modo, nomes);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return modoJogo;
	}
	
	private ModoJogo(int modo2, String[] nomes) {
		this.modoJogo = modo2;
		this.nomeJogadores = nomes;
	}
	
	public int getModoJogo() {
		return this.modoJogo;
	}
	
	public String[] getJogadores() {
		return this.nomeJogadores;
	}
}
package model;

class Carta
{  
	private String texto;
	private int movimento;
 	private int movimento1[];
	
	public Carta(String textoCarta, int movimentoCarta)
	{
		this.texto = textoCarta;
		this.movimento = movimentoCarta;
	}
	
	public Carta(String textoCarta, int movimentoCarta[])
	{
		this.texto = textoCarta;
		this.movimento1 = movimentoCarta;
	}
  
	public String getCarta()
	{
		return texto;
	}

	public int getMovimento()
	{
		return movimento;
	}

}

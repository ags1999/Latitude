package model;

class Jogador
{
  private String nome;
  private String cor;
  private int qtdPontos, numJogador;

  public Jogador(String nomeJog, String corJog, int numJog) {
    this.nome = nomeJog;
    this.cor = corJog;
    this.numJogador = numJog;
    this.qtdPontos = 0;
  }

  public String getName() {
    return nome;
  }

  public String getColor() {
    return cor;
  }

  public int getPontos() {
    return qtdPontos;
  }

  public int getNumJogador() {
    return numJogador;
  }

  public void setNumJogador(int num) {
    this.numJogador = num;
  }

  public void setPontos(int numPontos) {
    this.qtdPontos = numPontos;
  }
}
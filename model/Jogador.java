package model;

class Jogador{

  private String cor;
  private int qtdPontos, numJogador, qtdExploradores;

  public Jogador( String corJog, int numJog, int numExploradores) {
    this.qtdExploradores = numExploradores;
    this.cor = corJog;
    this.numJogador = numJog;
    this.qtdPontos = 0;
  }

  public int getExploradores() {
    return qtdExploradores;
  }

  public void setEXploradores(int num) {
    this.qtdExploradores = num;
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
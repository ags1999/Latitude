package model;

import java.awt.Color;

class Jogador{

  private Color cor;
  private int qtdPontos = 0, numJogador, qtdExploradores = 6;
  private Explorador[] listaExploradores = new Explorador[6]; 

  Jogador( Color corJog, int numJog, int ladoInicial) 
  {
    this.cor = corJog;
    this.numJogador = numJog;
    for(int i = 0; i < 6; i++)
    {
      listaExploradores[i] = new Explorador(ladoInicial, this);
    }

  }

  int getExploradores() {
    return qtdExploradores;
  }

  void setEXploradores(int num) {
    this.qtdExploradores = num;
  }

  Color getColor() {
    return cor;
  }

  int getPontos() {
    return qtdPontos;
  }

  int getNumJogador() {
    return numJogador;
  }

  void setNumJogador(int num) {
    this.numJogador = num;
  }

  void setPontos(int numPontos) {
    this.qtdPontos = numPontos;
  }
}
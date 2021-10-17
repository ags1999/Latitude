package model;

class Tabuleiro
{
  private final int linhas = 24, colunas = 6;
  private int[][] matrizTab = new int[linhas][colunas];

  public void novoTabuleiro() {
    int i, j;
    for(i = 0; i <= linhas; i++) {
      for (j = 0; j <= colunas; j++){
        matrizTab[i][j]=0;
      }
    }
    matrizTab[1][3] = -1;
    matrizTab[3][4] = -1;
    matrizTab[4][5] = -1;
    matrizTab[7][3] = -1;
    matrizTab[9][4] = -1;
    matrizTab[10][5] = -1;
    matrizTab[13][5] = -1;
    matrizTab[14][4] = -1;
    matrizTab[16][3] = -1;
    matrizTab[19][5] = -1;
    matrizTab[20][4] = -1;
    matrizTab[22][3] = -1;
  }

  public void modificaTabuleiro(int value, int linha, int coluna){
    matrizTab[linha][coluna] = value;
  }

  public int getCasa(int linha, int coluna){
    return matrizTab[linha][coluna];
  }
}
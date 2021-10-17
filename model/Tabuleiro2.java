package model;

public class Tabuleiro2
{
  private final int linhas = 24, colunas = 6;
  private int[][] matrizTab = new int[linhas][colunas];

  public Tabuleiro2() 
  {
   for (int i = 0; i < 14; i++)
   { 
      for (int j = 0; j < 11; j++)
      {
        this.matrizTab = [i,j];
        System.out.print(matrizTab[i][j] + " ");
      }
      System.out.println();
   }
     
  }

  public void modificaTabuleiro(int value, int linha, int coluna){
    matrizTab[linha][coluna] = value;
  }

  public int getCasa(int linha, int coluna){
    return matrizTab[linha][coluna];
  }
}
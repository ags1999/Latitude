package controller;
import model.ModelAPI;
import view.*;

public class Controller
{
	
  private static Controller ctrl;
  private static boolean modoJogo;// true-competitivo, false-cooperativo
  private static int numJogadores;

	
  void novoJogo()
  {

  }

  void carregarJogo()
  {

  }

  public static void setModo(boolean modo)
  {
    modoJogo = modo;
  }

  public static void setNumJogadores(int num)
  {
    numJogadores = num;
  }

}

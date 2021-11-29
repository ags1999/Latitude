package controller;
import model.ModelAPI;
import view.*;

public class Controller
{
	
  private static Controller ctrl;
  private static boolean modoJogo;// true-competitivo, false-cooperativo
  private static int numJogadores;

	
  public static void novoJogo()
  {
	  ModelAPI.novoJogo(numJogadores, modoJogo);
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
  
  public static Controller getController()
  {
	  return ctrl;
  }
  
  public static void inicio()
  {
	  ViewAPI.inicio();
  }
  
  public static int getNumJogadorAtual()
  {
	  return ModelAPI.getJogadorAtual();
			  
  }
  
  public static Object getRolaDado(boolean tipo)
  {
	  return ModelAPI.rolaDado(tipo);
	  
  }
  
  public static boolean movimento()
  {
	  return false;
  }
  
  public static boolean getModoJogo()
  {
	  return modoJogo;
  }
  
  public static int getNumJogadores()
  {
	  return numJogadores;
  }
  
}

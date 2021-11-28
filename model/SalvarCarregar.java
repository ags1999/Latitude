package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import model.*;

class SalvarCarregar
{
	public void salvarJogo(Jogador[] jogadores, Tabuleiro T) throws IOException
	{
		File arq = new File("/src/jogadores.txt");
	      try {
	        arq.delete();
	        arq.createNewFile();

	        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
	        objOutput.writeObject(jogadores);
	        objOutput.close();

	      } catch(IOException erro) {
	          System.out.printf("Erro: %s", erro.getMessage());
	      }
	      
	      	      
	      File arq2 = new File("/src/tabuleiro.txt");
	      try {
	        arq.delete();
	        arq.createNewFile();

	        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq2));
	        objOutput.writeObject(jogadores);
	        objOutput.close();

	      } catch(IOException erro) {
	          System.out.printf("Erro: %s", erro.getMessage());
	      }
		
		//FileWriter arq = new FileWriter("/src/jogadores.txt");
		//PrintWriter gravarArq = new PrintWriter(arq);
		
		//gravarArq.printf("Jogador 1: ");
		
		//arq.close();
	      
	}
	
	public void carregarJogo(Jogador jogadores[], Tabuleiro T)
	{
		//Jogador jogadores[] = new Jogador[4]; 
		try {
			File arq = new File("/src/jogadores.txt");
	        if (arq.exists()) {
	           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
	           jogadores = (Jogador[])objInput.readObject();
	           objInput.close();
	        }
	      } catch(IOException erro1) {
	          System.out.printf("Erro: %s", erro1.getMessage());
	      } catch(ClassNotFoundException erro2) {
	          System.out.printf("Erro: %s", erro2.getMessage());
	      }
		
		//Tabuleiro T = new Tabuleiro(); 
		try {
			File arq = new File("/src/jogadores.txt");
	        if (arq.exists()) {
	           ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
	           T = (Tabuleiro)objInput.readObject();
	           objInput.close();
	        }
	      } catch(IOException erro1) {
	          System.out.printf("Erro: %s", erro1.getMessage());
	      } catch(ClassNotFoundException erro2) {
	          System.out.printf("Erro: %s", erro2.getMessage());
	      }
	}
}
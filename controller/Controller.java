package controller;
import model.ModelAPI;
import view.*;

import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Controller implements PropertyChangeListener
{
	private static Controller ctrl;
	
	private Controller()
	{
		
	}
	
	public static Controller getController()
	{
		if(ctrl == null)
		{
			ctrl = new Controller();
		}
		return ctrl;

	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	

	

}

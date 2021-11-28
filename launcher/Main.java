package launcher;


import model.ModelAPI;
import view.ViewAPI;
import controller.Controller;

class Main
{  
	
	
	public static void main(String[] args) 
	{
		
		ViewAPI view = ViewAPI.getViewAPI();
		Controller ctrl = Controller.getController();
		ModelAPI model = ModelAPI.getModelAPI();
	}
}
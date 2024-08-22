
public class Program  {
	
	public static void main(String[] args) {
		
		int[] Array = {64,13,25,22,12,11};
		int item = 22;
		Model model = new Model();
		ConsoleApp app = new ConsoleApp();
		app.SetInputs(Array, item);
		Presenter presenter = new Presenter(app, model);
		app.Start();
	
		
		
	}
	
    
    
	



	
}

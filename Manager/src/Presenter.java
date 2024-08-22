public class Presenter {
	private Model model; 
	private View view;
	
	public Presenter(View view, Model model) {
		this.model = model;
		this.view = view;
		view.SetPresenter(this);
	}
	
	public void result(int[] array, int item) {
		int[] sortedArray = model.SortArray(array);
		int res = model.FindNum(sortedArray, item);
		
		UpdateConsole(res);
		
	}
	private void UpdateConsole(int result) {
		view.GetResult(result);
	}
	
}

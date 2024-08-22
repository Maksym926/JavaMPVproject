
public class ConsoleApp implements View  {

	
	Presenter presenter;

	private int[] array;
	private int item;
	
	public void Start() {
		presenter.result(array, item);
		
	}
	public void SetPresenter(Presenter presenter) {
		this.presenter = presenter;
		
	}

	
	
	public void GetResult(int result) {
		System.out.print(result);
		
	}

	
	public void SetInputs(int[] array, int item) {
		this.array = array;
		this.item = item;
		
	}
	
}

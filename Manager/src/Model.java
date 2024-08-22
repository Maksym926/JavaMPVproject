
public class Model {
	//Selection Sort Algorithm O(n^2)
	public int[] SortArray(int[] array) {
		
		
		
		for(int i = 0; i <= array.length - 1; i++) {
			int numToSwap = array[i];
			int smallestInd = FindSmollestItem(array, i);
			array[i] = array[smallestInd];
			array[smallestInd] = numToSwap;
			
			
		}
		return array;
	}
	
	private int FindSmollestItem(int[] array, int i) {
		int smollestNum = array[i];
		int indexOfSmollestNum = i;
		for(int j = i; j <= array.length -1; j++) {
			if(array[j] < smollestNum) {
				smollestNum = array[j];
				indexOfSmollestNum = j;
			}
		}
		
		
		return indexOfSmollestNum;
	}
	public int FindNum(int[] sortedArray, int item) {
		
		int low = 0;
		int high = sortedArray.length - 1;
		while(low <= high) {
			int mid = (high + low) / 2;
			int guess = sortedArray[mid]; 
			if(guess == item) {
				return mid;
			}
			else if(guess < item) {
				low = mid + 1;
				
			}
			else {
				high = mid - 1;
			}
		}
		return 0;
	}
}

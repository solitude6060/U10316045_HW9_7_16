
public class TestTwoSort {
	//main method
	public static void main(String[] args){
		TwoSort sort = new TwoSort();
		
		//array
		int array[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		
		//sort
		sort.sort(array);
		//print
		sort.print(array);
		
	}

}

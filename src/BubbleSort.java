
public class BubbleSort {
	
	//contains both the recursive and non-recusive bubble sorts

	public static void main(String[] args) {
		int[] array = new int[]{4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] sorted = iterativeSort(array); //sorts array
		int[] recursive = recursiveSort(array, 0, 0);
		for(int i=0; i<sorted.length; i++){ //prints sorted array
			System.out.println(sorted[i] + "\t" + recursive[i]);
		}

	}
	
	public static int[] iterativeSort(int[] array){
		
		int temp;
		for(int i=0; i<array.length; i++){//iterations of sort
			for(int j=0; j<array.length-1; j++){//through each iteration
				int k = j+1;
				if(array[k] < array[j]){ //swap if in wrong order
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}return array;
		
	}//end of iterative bubble sort
	
	public static int[] recursiveSort(int[] array, int i, int swaps){
		
		int temp;
		int j = i+1;
		if(swaps==0 && j==array.length-1){ //sorted
			return array;
		}else if(j==array.length-1){ //restart when get to end
			return recursiveSort(array, 0, 0);
		}else if(array[j] < array[i]){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			swaps++;
			return recursiveSort(array, i, swaps);
		}else{
			i++;
			return recursiveSort(array, i, swaps);
		}
		
	}//end of recursive bubble sort

}

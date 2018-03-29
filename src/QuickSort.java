
public class QuickSort {

	public static void main(String[] args) {
		int[] array = new int[]{4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		sort(array); //sorts array
		for(int i=0; i<array.length; i++){ //prints sorted array
			System.out.println(array[i]);
		}
	}
	
	public static void sort(int[] array){
		quicksort(array, 1, array.length-1);
	}
	
	public static void quicksort(int[] array, int lo, int hi){
		if(lo < hi){
			int pivotIndex = partition(array, lo, hi);
			quicksort(array, lo, pivotIndex-1);
			quicksort(array, pivotIndex+1, hi);	
		}
	}
	
	public static int partition(int[] array, int lo, int hi){
		int i = 1;
		int j = hi;
		int pivot = array[lo];
		while(j>i){
			while(array[i] <= pivot){
				i++;
			}
			while(array[j] > pivot){
				j--;
			}
			if(i<j){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp2 = array[j];
		array[j] = pivot;
		array[0] = temp2;
		return j;
	}//end of partition and sort

}

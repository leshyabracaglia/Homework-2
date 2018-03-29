
public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[]{4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		sort(array); //sorts array
		for(int i=0; i<array.length; i++){ //prints sorted array
			System.out.println(array[i]);
		}
	}
	
	public static int[] sort(int[] array){
		for(int i=1; i<array.length; i++){
			int cur = array[i];
			
			int j=i;
			while(j>0 && array[j-1]>cur){
				array[j] = array[j-1];
				array[j-1] = cur;
				j--;
			}
		}return array;
	}//end of sort

}

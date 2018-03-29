
public class SelectSort {

	public static void main(String[] args) {
		int[] array = new int[]{4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		sort(array); //sorts array
		for(int i=0; i<array.length; i++){ //prints sorted array
			System.out.println(array[i]);
		}
	}
	
	public static void sort(int[] array){
		int temp;
		int counter=0;
		for(int i=0; i<array.length; i++){
			int min=array[i];
			for(int j=i+1; j<array.length; j++){
				if(array[j]<min){
					min = array[j];
					counter = j;
				}
			}temp = array[i];
			array[i] = array[counter];
			array[counter] = temp;
		}
	}//end of sort

}

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] array = new int[]{4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		sort(array); //sorts array
		for(int i=0; i<array.length; i++){ //prints sorted array
			System.out.println(array[i]);
		}

	}
	
	public static void sort(int[] array){
		int[] s1, s2;
		if(array.length==1){ //base case
			return;
		}else{
			double mid = array.length/2;
			s1 = Arrays.copyOfRange(array, 0, (int) Math.floor(mid));
			s2 = Arrays.copyOfRange(array, (int)Math.ceil(mid), array.length);
			sort(s1);
			sort(s2);
		}
		merge(s1, s2, array);
		
	}
	
	public static void merge(int[] s1, int[] s2, int[] sorted){
		int i=0;
		int j=0;
		while(j+i<sorted.length){
			if(j==s2.length){
				sorted[i+j] = s1[i];
				i++;
			}else if(i==s1.length){
				sorted[i+j] = s2[j];
				j++;
			}else if(s1[i]<s2[j]){
				sorted[i+j] = s1[i];
				i++;
			}else if(s2[j]<=s1[i]){
				sorted[i+j] = s2[j];
				j++;
			}
		}//end of while
	}
	
	public static String toString(int[] array){
		String s = "";
		for(int i=0; i<array.length; i++){
			s+=array[i] + " ";
		}return s;
	}

}

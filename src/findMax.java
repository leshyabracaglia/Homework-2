
public class findMax {

	public static void main(String[] args) {
		double[] arr = new double[]{2, 5, 11, 101, 88, 1, 65};
		System.out.println(findMaximum(arr, 0, arr.length-1));

	}
	
	public static double findMaximum(double[] array, int start, int end){
		if(start==end){
			return array[start];
		}
		int mid = (start+end)/2;
		double max1 = findMaximum(array, start, mid);
		double max2 = findMaximum(array, mid+1, end);
		
		if(max1>=max2){
			return max1;
		}else{
			return max2;
		}
	}

}

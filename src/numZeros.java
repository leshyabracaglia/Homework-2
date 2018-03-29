
public class numZeros {

	public static void main(String[] args) {
		
		for(int i=0; i<16; i++){
			System.out.println(numBinZeros(i, 0));
		}
		
	}

	public static int numBinZeros(int n, int zeros){
		if(n==0){ //base case
			return zeros; //zeros variable keeps track of number of zeros in binary
		}else if(n%2==0){ //this adds a zero to binary
			int newz = zeros+1;
			return numBinZeros(n/2, newz);
		}else{
			return numBinZeros((n-1)/2, zeros);
		}
	}
	
}

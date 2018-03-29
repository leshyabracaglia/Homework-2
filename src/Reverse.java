
public class Reverse {

	public static void main(String args[]){
		
		System.out.println(areReversed("balloon", "noollab"));
		System.out.println(areReversed("hello", "goodbye"));
		System.out.println(areReversed("Yellow", "wolley"));
		System.out.println(areReversed("y o", "yo"));
		
		
	}
	
	public static int areReversed(String x, String y){
		String reverse = "";
		for(int i=(x.length()-1); i>=0; i--){ //reverses first word
			reverse+=x.charAt(i);
		}
		
		if((reverse.toLowerCase()).equals(y.toLowerCase())){ //sees if the second word equals reverse of first
			return 1;
		}else{
			return 0;
		}
		
	}
}

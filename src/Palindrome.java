
public class Palindrome {

	public static void main(String[] args) {
		
		int answer = isPalindrome("kayak", 0, 4);
		if(answer == 1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		

	}
	
	public static int isPalindrome(String s, int start, int end){
		String x = s.toLowerCase();
		if(start==end){
			return 1;
		}else if(x.charAt(start) == x.charAt(end)){
			return isPalindrome(x, start+1, end-1);
		}else{
			return 0;
		}
	}

}

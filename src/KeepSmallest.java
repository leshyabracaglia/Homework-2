public class KeepSmallest {

	public static void main(String[] args) {
		
		String[] array = new String[]{"Other", "entries", "include", "a", "historic", "district", "in", 
				"Charlottesville", "Virginia", "cut-flower", "greenhouse", "complex"};
		
		String result = removeLong(array);
		System.out.println(result);

	}//end of main
	
	public static String removeLong(String[] s){
		String x, y, z;
		String result = "";
		
		if(!(s.length%3==0)){ //not possible if number of words isn't divisible by 3
			return null;
		}
		
		for(int i=0; i<s.length; i=i+3){
			x = s[i];
			y = s[i+1];
			z = s[i+2];
			if(x.length()<y.length()){ //xyz and xzy and zxy
				if(y.length()<=z.length()){  //xyz
					result+=s[i];
					result+=" ";
				}else if(z.length()<x.length()){ //zxy
					result+=s[i+2];
					result+=" ";
				}else{ //xzy
					result+=s[i];
					result+=" ";
				}
			}else{ //zyx and yzx and yxz
				if(y.length()>z.length()){ //zyx
					result+=s[i+2];
					result+=" ";
				}else if(z.length()>y.length() && z.length()<x.length()){ //yzx
					result+=s[i+1];
					result+=" ";
				}else{ //yxz
					result+=s[i+1];
					result+=" ";
				}
			}
		}return result;

	}//end of removeLong
}

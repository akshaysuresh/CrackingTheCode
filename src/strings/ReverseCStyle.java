package strings;

public class ReverseCStyle {
	
	public static void main(String[] args){
		String str = "Reverse me!!\0";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str){
		char[] toBeReversedArray = str.toCharArray();
		int length = toBeReversedArray.length;
		
		for(int i=0; i <= (length)/2; i++){
			char temp = toBeReversedArray[i];
			toBeReversedArray[i] = toBeReversedArray[length - i - 2];
			toBeReversedArray[length -i -2] = temp;			
		}
		return new String(toBeReversedArray);
	}
}

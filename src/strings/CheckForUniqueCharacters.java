package strings;

public class CheckForUniqueCharacters {

	public static void main(String[] args){
		String s = "Check me for uniqueness";
		System.out.println(checkUniqueness(s));
	}
	
	public static boolean checkUniqueness(String str){
		boolean[] uniqueness = new boolean[256];
		for(int i=0; i< str.length(); i++){
			int val = str.charAt(i);
			if(uniqueness[val]){
				return false;
			} else {
				uniqueness[val] = true;
			}
		}
		return true;
	} 
}

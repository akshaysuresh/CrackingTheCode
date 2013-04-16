package strings;

public class CheckAnagrams {
	
	//Method1:
	//Sort the two strings, if they are equal, they are anagrams
	
	public static void main(String[] args){
		String s1 = "bat";
		String s2 = "tab";
		
		System.out.println(checkAnagrams(s1, s2));
	}
	
	public static boolean checkAnagrams(String s1, String s2){
		//Check the length of two strings
		//get the number of unique characters in s
		if(s1.length() != s2.length()) return false;
		
		char[] s1_array = s1.toCharArray();
		int[] letters = new int[256];
		int num_of_unique_chars_s1 = 0;
		int num_of_completed_s2 = 0;
		
		for(char c : s1_array){
			if(letters[c] == 0) num_of_unique_chars_s1++;
			letters[c]++;
		}
		
		for(int i=0; i< s2.length(); i++){
			int c = s2.charAt(i);
			if(letters[c] == 0) return false;
			--letters[c];
			if(letters[c]==0){
				num_of_completed_s2++;
				if(num_of_completed_s2 == num_of_unique_chars_s1){
					return i == s2.length()-1;
				}
			}
			
		}
		
		return false;
	}

}

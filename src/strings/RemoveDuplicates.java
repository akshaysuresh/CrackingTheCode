package strings;

public class RemoveDuplicates {
	
	//This does not work if you have more than 2 duplicates
	//Need to find a way to figure out where the 0 is and print only till there
	//Ex "remmovm" will not work
	public static void main(String[] args){
		String str = "Remove odups";
		System.out.println(removeDuplicates(str));
	}
	
	private static String removeDuplicates(String str){
		//put it into a char array
		//check if its a duplicate
		
		char[] test = str.toCharArray();		
		int length = test.length;
		int tail = 1;
		
		for(int i=1; i < length ; i++){
			int j;
			for(j=0; j < tail; j++){
				if(test[i] == test[j]) break;
			}
			if(j == tail){
				test[tail] = test[i];
				tail++;
			}			
		}
		test[tail] = 0;
		return new String(test);
	}

}

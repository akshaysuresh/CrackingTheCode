package strings;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringReversal {	
	
	public static void main(String[] args){
		int no = 21, no1 = 35;
		//System.out.println("GCD = "+findGCD(no,no1));
		//generateLinkedList();
		//angleBetweenHands(1,45);
		//calculateSubString("abcdef");
		//primeFactors(no);
		//isprime(no);
		//stringReversal();		
	}

	
	private static void stringReversal() {
		
		String s = "I am a fool";
		StringBuffer temp = null;
		//ArrayList<String> a = new ArrayList<String>();
		Stack<StringBuffer> a = new  Stack<StringBuffer>();
		
		for(int i =0; i<s.length();i++)
		{
			temp = new StringBuffer();
			while( i < s.length() && s.charAt(i) != ' ')
			{	
				temp.append(s.charAt(i));
				i++;				
			}			
			a.push(temp);
		}
		
		temp = new StringBuffer();
		
		while(!a.isEmpty())
		{
			temp.append(a.pop()+" ");
		}
		
		System.out.println("\n"+temp);
	}
		
	
/*
	private static void calculateSubString(String s) {
		
		String sb = null;
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i =0;i< s.length()-1; i++)
		{
			for(int j =i+1;j<s.length();j++)
			{
				int index = i;
				sb = "";
				while(index <= j)
				{
					sb = sb + s.charAt(index);
					index++;
				}
				arr.add(sb);
			}
		}
		
		for(String a : arr)
		{
			System.out.println(a);
		}		

		System.out.println(checkPalindrome("ciaaxic"));
	
	}

	private static boolean checkPalindrome(String a) {
		
		int len = a.length()-1, i = 0;
		
		while(i<len)
		{
			if(a.charAt(i) != a.charAt(len))
				return false;
			
			i++;
			len--;
		}
		return true;
		
	}

	private static void angleBetweenHands(int hr, int min) {
		
		double hrHand =0, minHand = 0, angle = 0;
		hrHand = (hr * 60  + min)* 0.5 ;
		minHand = min * 6;
		angle = Math.abs(hrHand - minHand);
		System.out.println(angle);
		
	}

	private static void generateLinkedList() {
		int[] arr1 = {44,11,13,1,5,121}; 
		
		BinaryTree t = new BinaryTree();
		for(int i : arr1)
			t.add(i);
		
		t.display(t.root);
		t.search(t.root, 1);
		t.search(t.root, 44);
		t.search(t.root, 121);
		
		System.out.println("--------------------------");
		
		int[] arr = {1,2,3,4,5};
		LinkedList l = new LinkedList();
		
		for(int i : arr)
			l.add(i);
		
		l.getListItems();
		l.reverseList();
		System.out.println("Reversed List");
		l.getListItems();
		l.remove(3);
		System.out.println("1. New List");
		l.getListItems();
		int index  = 2;
		l.addAtIndex(index, 7);
		System.out.println("2. New List");
		l.getListItems();
	}

	private static int findGCD(int no, int no1) {		
		
		if(no1 == 0)
			return no;
		else if(no1>no)
			return findGCD(no1, no);
		else 
			return findGCD(no1, no%no1);		
	}

	public static List<Integer> primeFactors(int numbers) {
		int n = numbers; 
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

	private static boolean isprime(int no) {
				
		if(no%2 == 0)
		{	
			System.out.println("Not Prime");
			return false;
		}
		for(int i = 3;i*i<=no;i= i+2)
		{
			if(no%i == 0)
			{
				System.out.println("Not Prime");
				return false;
			}
		}
		System.out.println("Prime");
		return true;
	}*/
}


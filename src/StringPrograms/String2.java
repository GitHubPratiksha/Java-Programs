package StringPrograms;

import java.util.HashSet;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Remove duplicate value from string
		String a="ramramrammate";
		char ch[]=a.toCharArray();
		HashSet<Character> hs= new HashSet<Character>();
		for(char b:ch) {
			hs.add(b);
		}
		for(char c:hs) {
			System.out.println(c);
		}
	}

}

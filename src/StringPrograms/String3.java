package StringPrograms;

import java.util.HashMap;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print character and value count of each character
		String s="abcdTEST";
		char ch[]= s.toCharArray();
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i]));
				
			}else
				hm.put(ch[i], hm.get(ch[i]));
		}
	}

}

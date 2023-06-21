package StringPrograms;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "   HELLO ";
		String s2= "java";
		String s3="hell";
		String s4="hemloe";
		String s5="java";
		String s6="";
		
		//String Length
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//Compare To
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s4));
		
		//Concat
		System.out.println(s1.concat(s5));
		
		//isEmpty
		System.out.println(s1.isEmpty());
		System.out.println(s6.isEmpty());
		
		//Trim
		System.out.println(s1+"how are you");
		System.out.println(s1.trim()+"how are you");
		
		//toLowerCase
		System.out.println(s1.toLowerCase());
		
		//toUpperCase
		System.out.println(s2.toUpperCase());
		
		//Valueof
		int value=20;
		String str=String.valueOf(value);
		System.out.println(s1+17);
		
		//Replace
		String str1="Hello, how are you? How is your work";
		String replace=str1.replace("how", "hi");
		System.out.println(replace);
		
		//Char Sequence target, CharSequnce replacement
		String str3="Hey, welcome Pratiksha, pratiksha, how are you?";
		String str4="Pratiksha... you're welcome";
		String replaceString=str3.replace("Pratiksha", "Vipul");
		System.out.println(replaceString);
		
		//Contains
		String s= "hello, how are you?";
		System.out.println(s.contains("hello"));
		System.out.println(s.contains("how"));
		System.out.println("good");
		
		//Equals
		String string="i am good";
		String string1="I am good";
		System.out.println(s.equals(string));
		System.out.println(string.equals(string1));
		
		//Equals ignore case
		System.out.println(string.equalsIgnoreCase(string1));
		
		//To char array
		char ch[]=string.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
			}
		
		//StringGetBytes
		String bytes= "ABCD";
		byte[] b=bytes.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//endsWith
		String endswith= "Welcome home";
		System.out.println(endswith.endsWith("home"));
		System.out.println(endswith.endsWith("e"));
		System.out.println(endswith.endsWith("h"));
		
		
		
		
	}
}

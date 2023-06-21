package StringPrograms;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Split by comma
		String str= "We're, together, hey, hey, hey! Welcome";
		String[] arr=str.split(",");
		System.out.println("Number of substrings:" +arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("str[" +i+ "]:" +arr[i]);
		}
		
		//Split by white space
		String[] arr2=str.split(" ");
		System.out.println("Number of substrings:" +arr.length);
		for(int j=0;j<arr.length;j++) {
			System.out.println("str[" +j+ "]:" +arr[j]);
		}
		
		//Split by letter
		String[] arr3=str.split("W");
		System.out.println("Number of substrings:" +arr.length);
		for(int k=0;k<arr.length;k++) {
			System.out.println("str[" +k+ "]:" +arr[k]);
		}
		
		//Split by delimiters
		String[] arr4=str.split("[,.!]");
		System.out.println("Number of substring:" +arr.length);
		for(int u=0;u<arr4.length;u++) {
			System.out.println("str[" +u+ "]" +arr4[u]);
		}
	}

}

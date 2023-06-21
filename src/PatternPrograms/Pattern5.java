package PatternPrograms;

public class Pattern5 {
	
	public static void main(String[] args) {
		//Downward triangle 
		
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*"+" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("");
			}
			System.out.println(" ");
		}
	}

}

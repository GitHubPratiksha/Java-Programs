package PatternPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse payramid start pattern
		int number=4;
		
		for(int i=0;i<=number-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=number-1-i;k++) {
				System.out.print("*"+"");
			}
			System.out.println("");
		}
		
	}

}

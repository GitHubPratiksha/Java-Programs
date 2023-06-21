package PatternPrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diamond shape
		for(int i=0;i<=4;i++) {
			for(int j=4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
			
		}
		for(int i=4-1;i>=0;i--) {
			for(int j=0;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		

	}

}

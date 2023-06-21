package NumberPattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Descending order
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print(j+"");
			}
			System.out.println();
		}
	}

}

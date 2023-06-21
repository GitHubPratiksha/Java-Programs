package NumberPattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(number++ +" ");
			}
			System.out.println(" ");
		}

	}

}

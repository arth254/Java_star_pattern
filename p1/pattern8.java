
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern9(n);
	}
	public static void pattern9(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
			System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}

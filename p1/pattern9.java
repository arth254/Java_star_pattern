
public class pattern9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern10(n);
	}
	public static void pattern10(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0||j==0||i==j||i==n) {
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

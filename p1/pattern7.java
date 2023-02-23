
public class pattern7 {
	public static void main(String[] args) {
		int n =5;
		pattern8(n);
	}
	public static void pattern8(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
				}
			for(k=1;k<=i;k++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(" ");	
			}
			for(j=1;j<=(n-i);j++) {
				System.out.print("*");
				}
			
			System.out.println();
		}
	}
}

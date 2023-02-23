
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern5(n);
	}
	public static void pattern5(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			System.out.println("");
			for(j=1;j<=n-i;j++) {	
				System.out.print(" ");
				}
			for(k=1;k<=i;k++) {
				System.out.print("*");	
			}
		}
	}
}
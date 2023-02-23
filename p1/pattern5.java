
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern6(n);
	}
	public static void pattern6(int n) {
		int i,j,k;
		for(i=n;i>=1;i--) {
			System.out.println("");
			for(j=n;j>i;j--) {
				System.out.print(" ");
				}
			for(k=1;k<=i;k++) {
				System.out.print("*");	
			}
		}
	}
}

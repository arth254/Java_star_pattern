
public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt17(n);
	}
	public static void pt17(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

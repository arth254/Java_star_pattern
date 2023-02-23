
public class pattern30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt30(n);
	}
	public static void pt30(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print( i+" ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}


public class pattern28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt28(n);
	}
	public static void pt28(int n) {
		int alphabet = 65;
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
			System.out.print((char)(alphabet + j)+" ");
			}
			System.out.println("");
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print((char)(alphabet + j)+" ");
			}
			System.out.println("");
		}
	}
}

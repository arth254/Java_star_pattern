
public class pattern29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt29(n);
	}
	public static void pt29(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print( j+" ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}

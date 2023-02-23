
public class pattern26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt26(n);
	}
	public static void pt26(int n) {
		int alphabet = 65;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print((char)(alphabet + j)+" ");
			}
			System.out.println("");
		}
		
	}
}

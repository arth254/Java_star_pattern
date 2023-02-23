
public class pattern24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt24(n);
	}
	public static void pt24(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
			System.out.print(j);
			}
			System.out.println("");
		}
		
	}
}


public class pattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern3(n);
	}
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
}

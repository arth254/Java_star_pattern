
public class Patten1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern2(n);
	}
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}


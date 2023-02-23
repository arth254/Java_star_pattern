
public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt12(n);
	}
	public static void pt12(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==3||j==1||j==n) {
			System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}


public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt14(n);
	}
	public static void pt14(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i==1||i==n||j==1||j==i)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				}
			System.out.println();
		}
		
	}

}

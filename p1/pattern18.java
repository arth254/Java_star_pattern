
public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt11(n);
	}
	public static void pt11(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			for(k=1;k<=i;k++) {
				System.out.print(" ");
				}
			for(j=1;j<=(n+1)-i;j++) 
			{
				if(i==1||i==n||j==1||j==(n+1)-i)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}

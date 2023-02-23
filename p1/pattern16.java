public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt16(n);
	}
	public static void pt16(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			System.out.println("");
			for(k=(n+1)-i;k>=1;k--) {
				System.out.print(" ");	
			}
			for(j=i;j>=1;j--) {
				if(i==1||i==n||j==1||j==i)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				}
				}
			
		}
	}



public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n =5;
		//pt11(n);
	//}
	//public static void pt11(int n) {
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			//System.out.print("#");
			for(int k=1;k<=(n-i);k++) 
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				//System.out.print("+");
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

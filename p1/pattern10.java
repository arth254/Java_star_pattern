
public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt10(n);
	}
	public static void pt10(int n) {
		int i,j,k;
		for(i=0;i<=n;i++) {
			System.out.print("");
			for(k=0;k<=(n-i);k++) 
			{
				System.out.print(" ");	
			}
			for(j=0;j<i;j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
		for(i=0;i<=n;i++) {
			System.out.print("");
			
			for(j=0;j<i;j++) {
				System.out.print(" ");
				}
			for(k=0;k<=(n-i);k++) 
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}

}

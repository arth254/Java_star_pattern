
public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pt11(n);
	}
	public static void pt11(int n) {
		int i,j,k;
		for(i=0;i<=n;i++) {
			System.out.println("");
			
			for(j=0;j<i;j++) {
				System.out.print(" ");
				}
			for(k=0;k<=(n-i);k++) 
			{
				System.out.print("* ");	
			}
		}
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
		
	}

}

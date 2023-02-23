
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		pattern7(n);
	}
	public static void pattern7(int n) {
		int i,j,k;
		for(i=1;i<=n;i++) {
			System.out.print(" ");
			for(k=1;k<=(n-i);k++) 
			{
				System.out.print(" ");	
			}
			for(j=1;j<i;j++) {
				System.out.print("* ");
				}
			System.out.println();
		}
		
	}

}

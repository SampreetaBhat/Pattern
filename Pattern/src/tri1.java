import java.util.*;
public class tri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int px=n;
		int py=n;
		s.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n*2;j++) {
				if(j>=px&&j<=py) 
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			px--;
			py++;
			System.out.println();
		}

	}

}

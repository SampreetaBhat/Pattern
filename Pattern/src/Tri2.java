import java.util.Scanner;

public class Tri2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int px=1;
		int py=n*2-1;
		s.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n*2;j++) {
				if(j>=px&&j<=py) 
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			px++;
			py--;
			System.out.println();
		}


	}

}

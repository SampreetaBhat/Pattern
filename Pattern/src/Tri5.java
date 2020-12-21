import java.util.*;
public class Tri5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int z=1;
		s.close();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=z;k++) {
				System.out.print("*");
			}
			z=z+2;
			System.out.println();
		}

	}

}




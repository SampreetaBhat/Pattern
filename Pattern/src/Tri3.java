import java.util.*;
public class Tri3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print("*"+" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

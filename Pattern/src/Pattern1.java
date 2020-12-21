import java.util.*;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}

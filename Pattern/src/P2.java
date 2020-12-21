import java.util.*;
public class P2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	s.close();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==(n/2)+1||i==(n/2)+1) {
				System.out.print("*" + " ");
				
			}
			else
				System.out.print(" " +" ");
		}
		System.out.println();
	}

	}

}

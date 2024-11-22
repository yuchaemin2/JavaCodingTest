import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];

		for(int i=0; i<n; i++){
		    a[i] = i+1;
		}
		
		for(int i=0; i<m; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    x--;
		    y--;
		    
		    while(x<y){
		        int temp = a[x];
		        a[x] = a[y];
		        a[y] = temp;
		        x++;
		        y--;
		    }
		}
		
		for(int d=0; d<n; d++){
		    System.out.print(a[d]+" ");
		}
		
		sc.close();
	}
}

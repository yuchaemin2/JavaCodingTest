import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 개수 
		int m = sc.nextInt(); // 공의 개수 
		
		int[] a = new int[n]; 
		
		for(int x=0; x<m; x++){
		    int i = sc.nextInt(); // 시작 바구니 
		    int j = sc.nextInt(); // 종료 바구니 
		    int k = sc.nextInt(); // 공 번호 
		    
		    for(int y=i-1; y<j; y++){
		        a[y] = k;
		    }
		}
		
		for(int x=0;x<n;x++){
		    System.out.print(a[x]+" ");
		}
// 		System.out.print(Arrays.toString(a));
		sc.close();
	}
}

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 개수 
		int m = sc.nextInt(); // 공의 개수 
		
		int[] a = new int[n];
		
		// 배열 초기화 
		for(int i=0; i<n; i++){
		    a[i] = i+1;
		}
		
		for(int x=0; x<m; x++){
		    int i = sc.nextInt(); // 시작 바구니 
		    int j = sc.nextInt(); // 종료 바구니 

            int temp = a[i-1];
            a[i-1] = a[j-1];
            a[j-1] = temp;
		}
		
		for(int x=0;x<n;x++){
		    System.out.print(a[x]+" ");
		}

		sc.close();
	}
}

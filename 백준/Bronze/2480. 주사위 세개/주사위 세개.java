import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int total=0;
		
		if(a!=b && b!=c && c!=a){
		    int max = Math.max(a, Math.max(b, c));
		    total = max*100;
		} else if(a==b && b==c) {
		    total = 10000+a*1000;
		} else {
		    if(a==b) total = 1000+a*100;
		    else if(b==c) total = 1000+b*100;
		    else if (c==a) total = 1000+c*100;
		}
		
		System.out.print(total);
	}
}

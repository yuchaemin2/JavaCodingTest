import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    float max = 0;
	    float sum = 0;
	    
		int n = sc.nextInt();
		float[] a = new float[n];
		
		System.out.print("\n");
		
		for(int i=0; i<n; i++){
		    int m = sc.nextInt();
		    a[i] = (float)m;
		    if(a[i]>max){
		        max = a[i];
		    }
		}
		
		for(int i=0; i<n; i++){
		    a[i] = a[i]/max*100;
		    sum += a[i];
		}
		
		System.out.print(sum/n);
	}
}

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// upper part
		for(int i=0; i<n; i++){
		    for(int j=0; j<n-i-1; j++){
		        System.out.print(" ");
		    }
		    for(int k=0; k<i+1; k++){
		        System.out.print("*");
		    }
		    for(int l=0; l<i; l++){
		        System.out.print("*");
		    }
		    System.out.print("\n");
		}
		
		//down part
		for(int i=0; i<n-1; i++){
		    for(int j=0; j<i+1; j++){
		        System.out.print(" ");
		    }
		    for(int k=0; k<n-i-1; k++){
		        System.out.print("*");
		    }
		    for(int l=0; l<n-i-2; l++){
		        System.out.print("*");
		    }
		    System.out.print("\n");
		}
	}
}

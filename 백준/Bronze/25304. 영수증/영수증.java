import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int cost = sc.nextInt();
	    int count = sc.nextInt();
	    int total_cost = 0 ;
	    
	    for(int i=0; i<count; i++){
	        int price = sc.nextInt();
	        int pcs = sc.nextInt();
	        
	        total_cost += price*pcs;
	    }
	    
	    if(cost == total_cost){
	        System.out.print("Yes");
	    } else {
	        System.out.print("No");
	    }
	}
}

import java.util.Scanner;

public class Main
{
    public static boolean isPrime(int i){
        if(i<=1){
            return false;
        }
        for(int j=2; j<=Math.sqrt(i); j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum=0;
		int min=10000;
		
		for(int i=m; i<=n; i++){
		    if(isPrime(i)){
		        sum+=i;
		        if(i<min){
		            min=i;
		        }
		    }
		}
		
		if(sum>0){
		    System.out.println(sum);
		    System.out.println(min);
		}else {
		    System.out.println("-1");
		}
		
	}
}
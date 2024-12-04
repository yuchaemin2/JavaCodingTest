import java.util.Scanner;

public class Main
{
    public static boolean isPrime(int m){
        if(m <= 1){
            return false;
        } 
        for(int j=2; j<=Math.sqrt(m); j++){
            if(m%j==0){
                return false;
            }
        }
        return true; // 소수 
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		
		for(int i=0; i<n; i++){
		    int m = sc.nextInt();
		    if(isPrime(m)){
		        count++;
		    }
		}
		
		System.out.println(count);
	}
}

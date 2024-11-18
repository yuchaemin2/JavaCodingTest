import java.util.Scanner;

public class Main
{
    
    public static int revertInt(int n){
        int n2;
        
        int x = n/100;
        int y = (n%100)/10;
        int z = n%10;
        
        n2 = 100*z+10*y+x;
        
        return n2;
    }
    
	public static void main(String[] args) {
		// Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // System.out.print("a의 revert결과: "+revertInt(a));
        
        if(revertInt(a)>revertInt(b)){
            System.out.print(revertInt(a));
        }else {
            System.out.print(revertInt(b));
        }
	}
}

import java.util.Scanner;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet();
		
		for(int i=0; i<10; i++){
		    int j = sc.nextInt();
		    set.add(j%42);
		}
		
		System.out.print(set.size());
	}
}

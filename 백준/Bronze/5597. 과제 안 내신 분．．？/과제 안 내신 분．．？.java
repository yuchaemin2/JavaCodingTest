import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[30];
		
		for(int i=0; i<28; i++){
		    int s = sc.nextInt();
		    student[s-1] = s;
		}
		
		for(int i=0; i<30; i++){
		    if(student[i] == 0){
		        System.out.print(i+1+"\n");
		    }
		}
	}
}

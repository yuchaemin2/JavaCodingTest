import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] a = new int[9][9];
		int max = 0,x=0,y=0;
		
		for(int i=0; i<9; i++){
		    for(int j=0; j<9; j++){
		        a[i][j] = sc.nextInt();
		        if(a[i][j] >= max){
		            max = a[i][j];
		            x=i+1;
		            y=j+1;
		        }
		    }
		}
	
	    sc.close();	
		System.out.print(max+"\n"+x+" "+y);
	}
}

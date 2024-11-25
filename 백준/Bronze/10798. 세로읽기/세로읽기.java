import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] a = new String[5][15];
		
		for(int i=0; i<5; i++){
		    String line = sc.nextLine();
            String[] tokens = line.split("");
		    for(int j=0; j<tokens.length; j++){
		        a[i][j] = tokens[j];
		    }
		}
		
		for(int i=0; i<15; i++){
		    for(int j=0; j<5; j++){
		        if(a[j][i] != null && !a[j][i].equals(" ")){
		            System.out.print(a[j][i]);
		        }
		    }
		}
		
	    sc.close();	
	}
}

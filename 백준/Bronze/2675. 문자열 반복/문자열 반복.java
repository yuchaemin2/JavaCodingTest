import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		// Creating an object of Scanner class
         Scanner sc = new Scanner(System.in);
         
        int count = sc.nextInt();
        
        for(int k=0; k<count; k++){
            // Reading a First String Input
            int count1 = sc.nextInt();
            String str1 = sc.nextLine();
            
            for(int i=0; i<str1.length(); i++){
                for(int j=0; j<count1; j++){
                    if(i!=0){
                        String s1 = str1.substring(i,i+1);
                        System.out.print(s1);
                    }
                }
            }
            System.out.print("\n");
        }
	}
}

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		// Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim(); // trim()으로 앞 뒤 공백 제거하기 
        String equal = " ";
        int count = 1;
        
        // 입력된 str이 공백일 경우 
        if(str.isEmpty()){
            System.out.print(0);
        } else {
            for(int i=0; i<str.length(); i++){
                if(str.substring(i,i+1).equals(equal)){
                    count++;
                }
            }
            
            System.out.print(count);
        }
	}
}

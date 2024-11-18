import java.util.Scanner;

public class Main
{
    
    public static int calculateTime(char s){
        
        int time = 0 ;
        
        switch(s){
            case 'A' : case 'B' : case 'C' :
                time = 3;
                break;
            case 'D' : case 'E' : case 'F' :
                time = 4;
                break;
            case 'G' : case 'H' : case 'I' :
                time = 5;
                break;
            case 'J' : case 'K' : case 'L' :
                time = 6;
                break;
            case 'M' : case 'N' : case 'O' :
                time = 7;
                break;
            case 'P' : case 'Q' : case 'R' : case 'S' :
                time = 8;
                break;
            case 'T' : case 'U' : case 'V' :
                time = 9;
                break;
            case 'W' : case 'X' : case 'Y' : case 'Z' :
                time = 10;
                break;
            default : 
                time = 2;
        }
        
        return time;
        
        // if(s.equals('A') || s.equals('B') || s.equals('C')){
        //     time += 3;
        // }else if (s.equals('D') || s.equals('E') || s.equals('F')){
        //     time +=4;
        // }
    }
    
	public static void main(String[] args) {
		// Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        int totalTime = 0;
        
        String str = sc.nextLine().toUpperCase();;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i); // Get the character at index i
            totalTime += calculateTime(ch);
        }
        System.out.print(totalTime);
        
	}
}

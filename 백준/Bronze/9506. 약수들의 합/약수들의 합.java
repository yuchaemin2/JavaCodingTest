

import java.util.Scanner;

public class Main
{
    
    public static boolean checkPerfect(int num){
        int sum=0;
        for (int i = 1; i < num; i++) { 
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    
    public static void printNum(int num){
        for (int i = 1; i < num; i++) { 
            if (num % i == 0) {
                if(i == num/2){
                    System.out.print(i);
                }else{
                    System.out.print(i+" + ");
                }
                
            }
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100000];
		int count=0;
		
		while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            } else {
                arr[count++] = n;
            }
        }
		
		for (int i = 0; i < count; i++) {
            if (checkPerfect(arr[i])) {
                System.out.print(arr[i] + " = ");
                printNum(arr[i]);
                System.out.println();
            } else {
                System.out.println(arr[i] + " is NOT perfect.");
            }
        }
		
		sc.close();

	}
}

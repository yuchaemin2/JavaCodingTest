import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) { // Check if there is more input
            String str = sc.nextLine();
            System.out.println(str); // Print the input
        }

        sc.close(); // Close the scanner
	}
}

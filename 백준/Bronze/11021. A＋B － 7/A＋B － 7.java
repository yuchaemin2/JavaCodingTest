import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 

public class Main
{
	public static void main(String[] args) throws IOException {
	    
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
       
        int n = Integer.parseInt(bf.readLine()); //Int
        
        for(int i=1; i<=n; i++){
            String[] input = bf.readLine().split(" "); // Split the line into two integers
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            
            bw.write("Case #"+i+": "+(a+b)+"\n");
        }
        
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음
	    
	}
}

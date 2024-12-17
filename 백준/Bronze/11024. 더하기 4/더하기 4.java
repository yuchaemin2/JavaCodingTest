import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int j=0; j<n; j++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		//값들의 합을 저장 할 변수
    		int sum = 0;
    		while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
    		
    		System.out.println(sum);
		}
		
		
	}

}
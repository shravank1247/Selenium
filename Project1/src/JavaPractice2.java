import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fraction of integer i.e. 3! = 3*2*1 = 6.... formula = 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
        //String N = br.readLine(); 
        System.out.println("N is " + N);
		int sum; 
        for(int i=1; i<N; i++)
        {
            sum = sum * i;
        }
         //sum = N*(N+1)/2;
        
        System.out.println("Hi, " + sum + "."); 

	}

}

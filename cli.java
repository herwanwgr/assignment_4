import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class cli {

	public static void main (string args[]) throws UnknownHostException, IOException
	{
		int number, temp;
		Scanner sc= new Scanner(System.in);
		Socket s = new Socket("127.0.0.1","1342");
		Scanner sc1= new Scanner(s.getInputStream());
		System.out.println("Enter any number");
		number= sc.nextInt();

		PrintStream p= new PrintStream(s.getOuputStream());
		p.printlin(number);

		temp=sc1.nxtInt();
		System.out.println(temp);
		
		

	}
}
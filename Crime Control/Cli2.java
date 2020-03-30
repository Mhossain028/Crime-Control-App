package Crime_Control;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cli2 {

	public static void D() throws UnknownHostException, IOException {
		
		 Socket s=new Socket("127.0.0.1",4321);
		 Scanner sc1=new Scanner(s.getInputStream());
		 PrintStream p= new PrintStream(s.getOutputStream());
		 String temp=sc1.nextLine();
		 System.out.println(temp);


	}

}

package Crime_Control;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cli3 {

	public static void E() throws UnknownHostException, IOException {
		

		 Socket s=new Socket("127.0.0.1",8765);
		 Scanner sc1=new Scanner(s.getInputStream());
		 PrintStream p= new PrintStream(s.getOutputStream());
		 String temp=sc1.nextLine();
		 System.out.println(temp);


	}

}

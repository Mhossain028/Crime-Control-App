package Crime_Control;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ser3 {

	public static void main(String[] args) throws IOException {
		
		ServerSocket s1=new ServerSocket(8765);
		Socket ss=s1.accept();
		Scanner sc=new Scanner(ss.getInputStream());
		
		String temp="Declined the call from server.";
		
		PrintStream p=new PrintStream(ss.getOutputStream());
		p.println(temp);

	}

}

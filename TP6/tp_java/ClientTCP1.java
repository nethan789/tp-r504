import java.io.*;
import java.net.*;

public class ClientTCP1
{
	public static void main(String[] args) throws Exception
	{
		try {
			Socket socket = new Socket ("localhost", 2016);
			DataOutputStream dOut = new DataOutputStream( socket.getOutputStream() );
			dOut.writeUTF("message test");
			System.out.println("Message envoyé !");
			socket.close();
		}catch (Exception e) {
			System.out.println("Erreur !");
			e.printStackTrace();
		}
	}
}


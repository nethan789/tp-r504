import java.io.*;
import java.net.*;

public class ServerTCP3 {
	public static void main(String[] args) {
		try {
			ServerSocket socketserver = new ServerSocket(2016);
			System.out.println("Serveur statique en attente de connexions...");
			while (true) {
				Socket socket = socketserver.accept();
				System.out.println("Connexion d'un client !");
				DataInputStream dIn = new DataInputStream(socket.getInputStream());
				System.out.println("Message reçu : " + dIn.readUTF());
				socket.close(); // on ferme le client, mais pas le serveur
			}

			// socketserver.close();
		} catch (Exception e) {
			System.out.println("Erreur !");
			e.printStackTrace();
		}
	}
}

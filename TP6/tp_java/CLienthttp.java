import java.io.*;
import java.net.*;

public class Clienthttp {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java Clienthttp <hostname>");
			return;
		}

		String host = args[0];

		try {
			Socket socket = new Socket(host, 80);

			OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());

			BufferedWriter bufOut = new BufferedWriter(osw);
			BufferedReader bufIn = new BufferedReader(isr);

			String request = "GET / HTTP/1.0\r\n\r\n";
			bufOut.write(request, 0, request.length());
			bufOut.flush();

			// Lecture de la réponse ligne par ligne
			String line = bufIn.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufIn.readLine();
			}

			bufIn.close();
			bufOut.close();
			socket.close();

		} catch (IOException e) {
			System.err.println("Erreur : " + e.getMessage());
			e.printStackTrace();
		}
	}
}

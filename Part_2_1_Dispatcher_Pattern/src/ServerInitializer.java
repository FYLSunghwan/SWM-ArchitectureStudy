import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInitializer {

	public static void main(String[] args) {
		int port = 5000;
		System.out.println("Server ON :"+port);
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			Socket connection;
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

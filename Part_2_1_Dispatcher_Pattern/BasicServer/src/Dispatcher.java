import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Dispatcher {

	public void dispatch(ServerSocket serverSocket) {
		try {
			Socket socket = serverSocket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void demultiplex(Socket socket) {
		
	}
}

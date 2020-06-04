import java.io.IOException;
import java.net.ServerSocket;

public class Dispatcher {

	public void dispatch(ServerSocket serverSocket) {
		try {
			Socket socket = serverSocket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

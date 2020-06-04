import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class TestClient {

	public static void main(String[] args) {
		System.out.println("Client ON");
		
		try {
			String message;
			
			Socket socket = new Socket("127.0.0.1", 5000);
			
			// Stream은 리소스를 적게 먹는다.
			OutputStream out = socket.getOutputStream();
			
			// Header|Payload
			message = "0x5001|홍길동|22";
			out.write(message.getBytes());
			socket.close();
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

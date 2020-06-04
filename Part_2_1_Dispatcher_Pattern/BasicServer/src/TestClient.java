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
			
			// Stream�� ���ҽ��� ���� �Դ´�.
			OutputStream out = socket.getOutputStream();
			
			// Header|Payload
			message = "0x5001|ȫ�浿|22";
			out.write(message.getBytes());
			socket.close();
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

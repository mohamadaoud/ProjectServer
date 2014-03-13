
import java.io.DataOutputStream;
import java.net.ServerSocket;
 
public class ServerTest {
  public static void main(String[] args) throws Exception{
    new DataOutputStream(new ServerSocket(8080).accept().getOutputStream()).writeBytes("Hello, world!");
  }
}
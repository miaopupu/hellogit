package TestNet;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestSocket {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("����ip��ַ��" + ip);
	}
}

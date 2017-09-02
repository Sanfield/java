package COM.SERVLET.WWW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo01 {
	public static void main(String[] args) throws Exception, IOException {
		Socket s= new Socket("127.0.0.1",8080);
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("OPTIONS(GET)/HTTP/1.1");
		bw.newLine();
		bw.write("Host:127.0.0.1:8080");
		bw.newLine();
		bw.write("Content-Type:text/html");
		bw.newLine();
		bw.newLine();
		bw.flush();
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = null;
		while((str = br.readLine())!= null){
			System.out.println(str);
		}
		bw.close();
		br.close();
		s.close();
	}

}

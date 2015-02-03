package entrada.bytes.filtradas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class TestPushBackInputStream {

	public static void main(String[] args) {
		
		String s = "if(a==4)a=0;\r\n";
		
		byte buf[] = s.getBytes();
		
		ByteArrayInputStream in = new ByteArrayInputStream(buf);
		
		PushbackInputStream f = new PushbackInputStream(in);
		int c;
		try {
			while ((c = f.read()) != -1) {
				switch (c) {
				case '=':
					if ((c = f.read()) == '=')
						System.out.print(".eq.");
					else {
						System.out.print("<-");
						f.unread(c); // Retornar el byte al flujo
					}
					break;
				default:
					System.out.print((char) c);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

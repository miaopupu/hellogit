package File01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
	public static void main(String[] args) {
		try {
			File f = new File("d:/xyz/abc/def/lol2.txt");
			f.getParentFile().mkdirs();
			FileOutputStream fos = new FileOutputStream(f);
			byte[] bs = {77,78};
			fos.write(bs);
			for(byte b:bs) {
				System.out.println(b);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

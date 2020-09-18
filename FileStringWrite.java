package Myhomework;

import java.io.File;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileStringWrite {
     public static void main(String[] args) {
		File file = new File("D:"+File.separator+"tt.txt");
		
		
		Writer writer = null;
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i <1; i++) {
			buffer.append("我爱Java");
		}
		String  string = new String(buffer);
		
		char[]  ch = new char[] {'a','b','c'};
		
		
		try {
			writer = new FileWriter(file,true);
			writer.write(ch);
			writer.write(string);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

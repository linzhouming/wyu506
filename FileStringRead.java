package Myhomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileStringRead {

	public static void main(String[] args) throws IOException {

		// 字符流读入数据第一种方法
//		File  f  = new File("D:"+File.separator+"tt.txt");
//		Reader input = new FileReader(f);
//		
//		char [] ch = new char[1024];
//		int temp,len=0,i=0;
//		
//        while((temp=input.read())!=-1){
//        	ch[len]=(char)temp;
//        	len++;
//        }
//        
//        input.close();
//        System.out.println(new String(ch,0,len));
//	}

		// 字符流读入数据第二种方法
		File file = new File("D:" + File.separator + "tt.txt");
		Reader reader = null;
		char[] ch = new char[(int) file.length()];
		int temp, len, i = 0;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			while ((temp = reader.read()) != -1) {
				ch[i++] = (char) temp;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(new String(ch, 0, i));

	}
}

package Myhomework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamFile {

	public static void main(String[] args) throws IOException {
		
		//使用文件流复制myfile.txt文件为myfile_cp.txt
		FileInputStream f = new FileInputStream("D:\\myfile.txt");
        BufferedInputStream b = new BufferedInputStream(f);
        FileOutputStream fos = new FileOutputStream("D:\\myfile_cp.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        
        int len = -1;
        while((len=b.read())!=-1){
			bos.write(len);
		}
		System.out.println("复制完毕");
		b.close();
		bos.close();
	}

}

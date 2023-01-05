package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamLoneTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("input3.txt");
		FileOutputStream fos = new FileOutputStream("output3.txt", true);
		
		int i;
		try {
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				 
	} 
	
}
	

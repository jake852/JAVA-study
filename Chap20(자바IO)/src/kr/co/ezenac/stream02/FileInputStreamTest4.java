package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		
		try (FileOutputStream fos = new FileOutputStream("output3.txt",true)){
			
			fos.write(65);
			fos.write(66);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("output3.txt")){
			
			int i;
			while((i=fis.read()) != -1) 
				System.out.print((char)i);
				
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

		
	}
	
}

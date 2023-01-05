package kr.co.ezenac.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2same3 {

	public static void main(String[] args) {
		
	
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {

			int i;
			while((i = fis.read()) != -1)
				System.out.print((char)i);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("end");
	}
	
}




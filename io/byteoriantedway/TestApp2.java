package io.byteoriantedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\MANTHAN\\eclipse-workspace\\OCJP21\\OCJP21\\list.txt");
			int temp;
			while ( (temp = fin.read()) != -1)
			{	
				char value = (char)temp;
				sb.append(value);
			}
			fin.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.print("File Strin--> " + sb );

	}

}

package io.byteoriantedway;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class TestApp3 {

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
		
        String str=String.valueOf(sb);
	    byte b[]=str.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("listCopy.txt");
			fout.write(b);
			fout.close();
			System.out.println("\n File copied successfully");
		}catch(FileNotFoundException e)
		
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

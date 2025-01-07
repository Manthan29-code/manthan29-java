package io.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuilder sb = new StringBuilder();
       try {
		FileReader fr = new FileReader("C:\\Users\\MANTHAN\\eclipse-workspace\\OCJP21\\OCJP21\\royal.txt");
		int temp ;
		try {
			while ( (temp = fr.read()) != -1)
			{	
				char value = (char)temp;
				sb.append(value);
				
			}
			fr.close();
		 }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
       System.out.println("Final string --> " + sb);
	}

}

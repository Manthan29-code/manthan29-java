package Fileclass;

import java.io.File;
import java.io.IOException;

public class TestApp3 {
    // create file in directory
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fi = new File("File_group/second_file.txt");
		if(!fi.exists())
		{	

			try {
				fi.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("already exists");
		}
		System.out.println("file created succesfully");
		System.out.println(fi.getName() +" is file " + fi.isFile());
		

	}

}

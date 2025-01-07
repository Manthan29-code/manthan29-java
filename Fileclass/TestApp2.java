package Fileclass;

import java.io.File;

public class TestApp2 {
	//create a directory

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fi =new File("File_group");
		if(!fi.exists())
		{	
			fi.mkdir();
			System.out.println("directory created");
		}
		else {
			System.out.println("directory already created");
			
		}
		System.out.println(fi.getName() +"is file " + fi.isFile());
		System.out.println(fi.getName() +"is directory " + fi.isDirectory());
		

	}

}

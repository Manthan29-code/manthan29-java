package Fileclass;

import java.io.File;

public class TestApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to get information about file
		
		String[] fileName = {"list.txt" , "listcopy.txt" , "royal.txt" , "connectorModule" , "connectorModule/abstopic"};
		
		for(String file : fileName)
		{	

			File fi = new File(file);
			

	        // apply File class methods on File object
			
	        System.err.println("File name-->" + fi.getName());
	        System.err.println("File Path-->" + fi.getPath());
	        System.err.println("File Parent->" + fi.getParent());
	        System.err.println("File absolute Path-->" + fi.getAbsolutePath());
	        System.err.println("File Exist-->" + fi.exists());
	        if(fi.exists())
	        {
	        	System.err.println("File canWrite-->" + fi.canWrite());
	        	System.err.println("File canRead-->" + fi.canRead());
	        	System.err.println("File directory-->" + fi.isDirectory());
	        	System.err.println("File size in bytes-->" + fi.length());
	        }
	        System.out.println("-----------------------------------------------------------------------");
	        System.out.println("-----------------------------------------------------------------------");
	        System.out.println("-----------------------------------------------------------------------");
	        
		}
	}

}

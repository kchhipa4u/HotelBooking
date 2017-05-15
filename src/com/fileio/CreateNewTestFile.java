package com.fileio;

import java.io.File;
import java.io.IOException;

public class CreateNewTestFile {
	
	public static void main(String[] args) throws IOException {
		File f = new File("kanFile.txt");  // does not create any physical file
		System.out.println(f.exists());
		f.createNewFile();  // In current working directory
		System.out.println(f.exists());
		
		File parent = new File("D://aFolder");
		parent.mkdir();
	    File aFile = new File(parent, "aFile.txt");
	    aFile.createNewFile();
	    System.out.println(aFile);
	}

}

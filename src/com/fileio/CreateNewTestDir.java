package com.fileio;

import java.io.File;

public class CreateNewTestDir {
	
	public static void main(String[] args) {
		File f = new File("kanDir");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}

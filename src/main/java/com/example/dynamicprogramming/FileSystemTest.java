package com.example.dynamicprogramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSystemTest {
	
	private static String Home = System.getProperty("user.home");
	
	protected static void allExceptionInfile(File file){
		Path pathOutFile = Paths.get(Home+"/"+"FileSystemTest.log");
		//Path path = Paths.get(uri)
		FileInputStream fin = null;
		FileOutputStream fio = null;
		Scanner sc = null;
		//Scanner scout = null;
		try {
			 fin = new FileInputStream(file);
			 sc = new Scanner(fin);
			//FileOutputStream fio;
			 if(!(Files.exists(pathOutFile)))
			 	Files.createFile(pathOutFile);
			 fio = new FileOutputStream(new File(pathOutFile.toString()));
			 //scout = new Scanner(new File(pathOutFile.toString()));
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				if(line.contains("permission")){
					//fio.getChannel();
					//scout.("\n");
					fio.write(line.getBytes(),0,line.length());
					//fio.flush();
				}
			}
			
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				fin.close();
				fio.close();
				sc.close();
				System.out.print("Operation completed successfully.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystem fs = FileSystems.getDefault();
		Path path = fs.getPath("C:/Users/PRAVEEN/Desktop/global-groovy.log");
		FileSystemTest.allExceptionInfile(new File(path.toUri()));
	}

}

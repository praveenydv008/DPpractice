package com.example.dynamicprogramming;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.junit.Test;

public class A {
	
	private int id=1;
	
	private final B b;
	
	private static String HOME = System.getProperty("user.home");
	
	
	  A(){ this.b = null;}
	 
	
	A(B be){
		this.b=be;
	}
	
	protected void print(){
		System.out.println("Class A print is called");
	}
	
	/*
	 * @Override public int hashCode(){ return 1; }
	 */
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Test
	public void givenExistentPath_whenConfirmsFileExists_thenCorrect() {
	    Path p = Paths.get(HOME);

	    assertTrue(Files.exists(p));
	}
	
	@Test
	public void givenNonexistentPath_whenConfirmsFileNotExists_thenCorrect() {
	    Path p = Paths.get(HOME + "/inexistent_file.txt");

	    assertTrue(Files.notExists(p));
	}
	
	@Test
	public void givenDirPath_whenConfirmsNotRegularFile_thenCorrect() {
	    Path p = Paths.get(HOME);

	    assertFalse(Files.isRegularFile(p));
	}
	
	@Test
	public void givenFilePath_whenCreatesNewFile_thenCorrect() throws IOException {
	    String fileName = "myfile_" + UUID.randomUUID().toString() + ".txt";
	    Path p = Paths.get(HOME + "/" + fileName);
	    assertFalse(Files.exists(p));

	    Files.createFile(p);

	    assertTrue(Files.exists(p));
	}
	
	
	static int minimumSwaps(int[] arr) {
		
		int i =0;
        int count=0;
        int temp;
        int  n = arr.length;
        while(i<n){
            if(arr[i] != i+1){
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                count++;
            }
            else{
                i++;
            }
        }
        return count;


    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new B();
		//System.out.println(a.id);
		//a.print();
		//A a = new A();
		//a.givenExistentPath_whenConfirmsFileExists_thenCorrect();
		int[] array = {2, 3, 4, 1, 5};
		System.out.println(A.minimumSwaps(array));
		
		
	}


	public B getB() {
		return b;
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	

}

package com.example.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class B extends A{
	private int id=2;
	List<Integer> lst = new ArrayList<Integer>();
	static List l =null;
	@Override
	protected void print(){
		this.testRef(l);
		System.out.println("Class B print is called");
	}
	
	public void testRef(List l) {
		List<String> lst = new ArrayList<String>();
		lst.add("Yes");
		lst.add("no");
		Iterator<String> ltr = lst.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		A a1 = new A(b);
		a1.getB().id=10;
		
		System.out.println(a1.getB().id);
		//A a2 = new A();
		System.out.println(a1.hashCode()+" : "+b.hashCode());
		Map<String,A> map = new HashMap<String,A>();
		Map<A,String> map2 = new HashMap<A,String>();
		map.put("A",a1);
		//map.put("A",a2);
		map2.put(a1, "A");
		//map2.put(a2, "A");
		
		System.out.println(map.size()+" : "+map.get("A").hashCode());
		System.out.println(map2.size());
		b.print();	/*
		 * try { URL url = new
		 * URL("https://jsonmock.hackerrank.com/api/food_outlets?city=Denver&page=1");
		 * //make connection HttpsURLConnection urlc = (HttpsURLConnection)
		 * url.openConnection(); //urlc.connect();
		 * 
		 * //use post mode urlc.setDoOutput(true); urlc.setAllowUserInteraction(false);
		 * 
		 * //send query PrintStream ps = new PrintStream(urlc.getOutputStream());
		 * //ps.print(query); ps.close();
		 * 
		 * //get result BufferedReader br = new BufferedReader(new
		 * InputStreamReader(urlc .getInputStream())); String l = null; while
		 * ((l=br.readLine())!=null) { System.out.println(l); }
		 * 
		 * br.close(); } catch (MalformedURLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
				//Object[] arr = lst.toArray();
		//System.out.println(a.id);
	}
	
	@Override
	public String toString() {
		return "id value is";
	}
	
}

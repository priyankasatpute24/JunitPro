package com.maven.junit.junitprj;

public class StringEx {
     
	 public static boolean checkstring(String s2) {
		  String s1="hi,hello";
		  if (s1.contains(s2)) {
			  return true;
			  
		  }
		  return false;
	 }
	 
	 public static boolean checkstring1(String s2) {
		  String s1="Hello";
		  if (s1.equals(s2)) {
			  return true;
			  
		  }
		  return false;
	 }
	
	
}

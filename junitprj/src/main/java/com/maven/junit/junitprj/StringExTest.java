package com.maven.junit.junitprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringExTest {
 @Test 
 public void stringTest1() {
	  String str="are";
	  boolean result=StringEx.checkstring(str);
	  System.out.println("contains result is"+result);
	  assertEquals(true,result);
 }
   
 public void stringTest2() {
	  String str="Hello";
	  boolean result=StringEx.checkstring(str);
	  System.out.println("equals result is"+result);
	  assertEquals(true,result);
}
}

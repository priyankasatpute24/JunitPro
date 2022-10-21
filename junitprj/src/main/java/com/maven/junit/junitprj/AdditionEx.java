package com.maven.junit.junitprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionEx {
  public static  int add(int a,int b) {
	int add=a+b;
	return add;
}
  @Test 
  public void addtest() {
	  assertEquals(4,AdditionEx.add(2, 2),0);
  }
}

package com.maven.junit.junitprj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class AnnotationTest {
	
	@BeforeClass
       public static void beforeclass() {
    	   System.out.println("Before class Method");
       }
       @AfterClass
       
       public static void afterclass() {
    	   System.out.println("After class Method");
       }
       
       @Before
       public  void before() {
    	   System.out.println("Before Method");
       }
       
       @After
       public  void after() {
    	   System.out.println("After Method");
       }
       @Ignore
       public  void ignorMethod() {
    	   System.out.println("Ignore Method");
       }
       
}

package com.jdbc.collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) throws SQLException, 1 {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
      
      System.out.println("Table is created sucessfully");
      int choice;
      Student std=new Student();
      List<Student> studentList=new ArrayList<Student>();
      System.out.println("*****************Student Database System*********************");
      
      do {
    	  System.out.println("Press 1 to Insert Multiple Data into Database");
    	  System.out.println("Press 2 to Insert Single Data into Database");
    	  System.out.println("Press 3 to Update Data into Database");
    	  System.out.println("Press 4 to Select Data from Database");
    	  System.out.println("Press 5 to Delete Data from Database");
    	  System.out.println("Press 6 to Exit from Database");
    	  
    	  System.out.println("Enter your choice");
    	  choice=sc.nextInt();
    	  switch(choice) {
    	  case 1:
    		  studentList.add(new Student(101,"Priyanka","Pune","BE",25));
    		  studentList.add(new Student(102,"Sahil","Nashik","BSC",26));
    		  studentList.add(new Student(103,"Amol","Mumbai","BA",23));
    		  studentList.add(new Student(104,"Meghana","Pune","BTech",20));
    		  
    			PreparedStatement ps = conn.prepareStatement("insert into Stud_detailsvalues(?,?,?,?,?)");
    				for(Iterator<Student> iterator=studentList.iterator();iterator.hasNext();) {
    					Student s=(Student)iterator.next();
    					ps.setInt(1,s.getSid());
    					ps.setString(2, s.getSname());
    					ps.setString(3,s.getScity());
    					ps.setString(4,s.getDegree());
    					ps.setInt(5, s.getAge());
    					ps.addBatch();
    					
    				}
    				int a[]=ps.executeBatch();
    				System.out.println(Arrays.toString(a));
    				System.out.println("sucessful");
    		       break;
    		     
     
    	  }
      }while(choice!=6);
      conn.close();
	}
	}



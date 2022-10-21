package com.jdbc.collection;
import java.sql.*;

public class CallingStoreFunc {
 
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
    	//Class.forName("com.mysql.cj.jdbc.Driver");
       
       
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");
     //   String sql_string = "insert into emp1 values(?,?,?,?)";
//        CallableStatement cs=conn.prepareCall("{call GET_emp1()}");
      //  CallableStatement cs = conn.prepareCall(sql_string);
        

      // ResultSet rs= cs.executeQuery();
       
       //System.out.println("Get employee record");
//       while(rs.next()) {
//    	  // int eid=rs.getInt(1);
//    	   String firstname=rs.getString(1);
//    	  
//    	   
//    	   System.out.println("employee:"+"firstname="+firstname);
//       }
       
    	
    	/////////////////with parameter///////////////////////////////////////
    	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","root");

        String sql_string = "insert into emp1 values(?,?,?,?)";
        CallableStatement cs = conn.prepareCall(sql_string);
        
       cs.setInt(1,103);
       cs.setString(2, "Ram");
       cs.setString(3, "Jadhav");
       cs.setInt(4, 25);
      // rs.close();
       cs.execute();
       System.out.println("Uploaded successfully");
       
       
    }
}
package com.example.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestSQLDB {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PreparedStatement pstmt=null;      
	        Connection conn=null;
	        ResultSet rs=null;
	        
	        try {
	        	
	        	 
   			 
   			 
	            //1.加载驱动
	           
 	            String user="sa";//sa超级管理员
	            
//	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	            String url="jdbc:sqlserver://172.17.10.225:1433;DatabaseName=pmioa";
//	            String password="aomei110A";//密码
	           
	            
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	            String url="jdbc:sqlserver://172.16.0.247:1433;DatabaseName=pmioa";
	            String password="aomei11OA";//密码
	            
	            
	            //2.连接
	            conn=DriverManager.getConnection( url,user,password);
	            System.out.println(conn.toString());
	            System.out.println(conn.isClosed());
	            conn.close();
	            
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }finally{
	                    
	            //关闭资源,加强程序的健壮性
	            try {
	                if(rs!=null){
	                    rs.close();
	                }
	                if(pstmt!=null){
	                	pstmt.close();
	                }
	            } catch (Exception e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	}

}

package com.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aomei.util.JDBCUtil;
  
public class TestJdbc {  
   
    public static void main(String[] args) {  
        Connection conn=JDBCUtil.getConnection();  
        System.out.println(conn);  
        try {  
            PreparedStatement stmt=conn.prepareStatement("SELECT  top 100  matnr  , ntgew , umziz from vbap order by matnr desc");  
            ResultSet re=stmt.executeQuery();  
            while(re.next()){  
                String name=re.getString(1);  
                System.out.println(name);  
                  
            }  
              
              
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
      
      
  
}  

package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

   private static String user = "root";
   private static String password = "Sh@452607";
   private static String url = "jdbc:mysql://rm-uf6fblg6z6n5kx8gioo.mysql.rds.aliyuncs.com:3306/demo?characterEncoding=utf8";
   private static String className = "com.mysql.jdbc.Driver";


   public static Connection getConnection() throws SQLException {
      try {
         Class.forName(className);
      } catch (ClassNotFoundException var1) {
         var1.printStackTrace();
      }

      Connection conn = null;
      conn = DriverManager.getConnection(url, user, password);
      return conn;
   }

   public static void CloseAll(Connection conn, Statement stmt, ResultSet rs) {
      try {
         if(rs != null) {
            rs.close();
         }

         if(stmt != null) {
            stmt.close();
         }

         if(conn != null) {
            conn.close();
         }
      } catch (SQLException var4) {
         var4.printStackTrace();
      }

   }
}

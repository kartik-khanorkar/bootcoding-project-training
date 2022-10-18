package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDAO {
    public static final String TABLE_NAME ="customer_order";
    public void creatTable(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Kart@321");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Id"+rs.getString("id"));
                System.out.println("TotalAmount"+rs.getString("total_amount"));
                System.out.println("Date"+rs.getString("order_date"));
                System.out.println("Address"+rs.getString("delivery_address"));

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

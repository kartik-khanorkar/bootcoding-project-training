package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME ="order_menu_item";
    public void creatTable(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Kart@321");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Name"+rs.getString("menu_item_name"));
                System.out.println("Price"+rs.getString("total_price"));
                System.out.println("Quantity"+rs.getString("quantity"));
                System.out.println("Veg"+rs.getString("is_veg"));

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

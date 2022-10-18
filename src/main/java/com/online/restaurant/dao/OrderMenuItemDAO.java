package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME ="app_order_menu_item";
    public void creatTable(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Kart@321");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL ,"
                    + " order_id bigint ,"
                    + " quantity decimal,"
                    + " is_veg bool ,"
                    + " menu_item_name text ,"
                    + " total_price decimal ,"
                    + "CONSTRAINT app_order_menu_item_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);


            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Id"+rs.getString("id"));
                System.out.println("MenuItemName"+rs.getString("menu_item_name"));
                System.out.println("TotalPrice"+rs.getString("total_price"));
                System.out.println("Veg"+rs.getString("is_veg"));


            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

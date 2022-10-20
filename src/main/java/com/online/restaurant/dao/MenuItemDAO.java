package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME ="app_menu_item";
    private DAOService daoService;
    public MenuItemDAO(){
        //Inside Constructore
        daoService = new DAOService();
    }
    public void creatTable(){
        try{
            Connection con = daoService.getConnection();
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL ,"
                    + " vendor_id bigint ,"
                    + " menu_item_name text ,"
                    + " price decimal ,"
                    + " category text ,"
                    + " is_veg bool ,"
                    + "CONSTRAINT app_menu_item_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);


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

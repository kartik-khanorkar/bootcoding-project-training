package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VendorDAO {
    public static final String TABLE_NAME ="app_vendor";
    private DAOService daoService;
    public VendorDAO () {
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
                    + " name text ,"
                    + " address text ,"
                    + " phone_number bigint ,"
                    + " city text ,"
                    + " state text ,"
                    + " email_id text ,"
                    + " category text ,"
                    + "CONSTRAINT app_vendor_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);

            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Name"+rs.getString("name"));
                System.out.println("Address"+rs.getString("address"));
                System.out.println("Phone"+rs.getString("phone_number"));
                System.out.println("City"+rs.getString("city"));

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

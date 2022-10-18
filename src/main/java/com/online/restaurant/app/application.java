package com.online.restaurant.app;

import com.online.restaurant.customer;

import com.online.restaurant.dao.CustomerDAO;
import com.online.restaurant.dao.OrderDAO;
import com.online.restaurant.dao.OrderMenuItemDAO;
import com.online.restaurant.vendor;

import com.online.restaurant.order;

import java.util.Date;

public class application {

    public static void main(String[]args){
        customer kartik = new customer();
        kartik.setName("Kartik");
        kartik.setCity("Nagpur");
        kartik.setAddress("New nandanwan,Nagpur");
        kartik.setState("Maharashtra");
        kartik.setEmailId("kartikkhanorkar24@gmail.com");
        kartik.setPhoneNumber(7720003282L);
        System.out.println("Name:"+kartik.getName());
        System.out.println("City:"+kartik.getCity());
        System.out.println("Address:"+kartik.getAddress());
        System.out.println("State:"+kartik.getState());
        System.out.println("EmailId:"+kartik.getEmailId());
        System.out.println("Phone No:"+kartik.getPhoneNumber());

        vendor haldiram = new vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni sqare, Nagpur");
        haldiram.setCategory("Veg");
        haldiram.setPhoneNumber(7122233441L);
        haldiram.setRating("4.5");
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Restaurant Name:"+haldiram.getName());
        System.out.println("Address:"+haldiram.getAddress());
        System.out.println("Category:"+haldiram.getCategory());
        System.out.println("Phone No:"+haldiram.getPhoneNumber());
        System.out.println("Rating:"+haldiram.getRating());
        System.out.println("State:"+haldiram.getState());
        System.out.println("City:"+haldiram.getCity());

        order order = new order();
        order.setCustomer(kartik);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("102, Darshan colony,Nandanwan,Nagpur");

        System.out.println("Order Details:");
        System.out.println("Total Amount:"+order.getTotalAmount());
        System.out.println("Order Date:"+order.getOrderDate());

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.creatTable();

        OrderDAO orderDAO = new OrderDAO();
        orderDAO.creatTable();

        OrderMenuItemDAO orderMenuItemDAO = new OrderMenuItemDAO();
        orderMenuItemDAO.creatTable();




    }
}


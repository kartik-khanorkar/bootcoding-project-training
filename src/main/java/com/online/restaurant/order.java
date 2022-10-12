package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class order {
    private String orderId;
    private Double totalAmount;
    private vendor vendor;
    private customer customer;
    private String deliveryAddress;
    private List<OrderMenuItem>menuItems;
    private Date orderDate;
    private String orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public com.online.restaurant.vendor getVendor() {
        return vendor;
    }

    public void setVendor(com.online.restaurant.vendor vendor) {
        this.vendor = vendor;
    }

    public com.online.restaurant.customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.online.restaurant.customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<OrderMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}

package com.online.restaurant.utils;

import java.util.Random;

public class OTPGenerator {
    public static int getOTP(){
        final static int MAX = 999999;
        final static int MIN = 100000;

        static Random random = new Random();

        int number = random.nextInt(MAX - MIN);
        int otp = MIN + number;

        System.out.println("OTP Number = " + number);
        return number;
    }

     public static void main(String[] args){
        for(int i=0; i<100;i++){
        OTPGenerator.getOTP();
        }
     }
}

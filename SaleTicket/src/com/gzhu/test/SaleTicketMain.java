package com.gzhu.test;

public class SaleTicketMain {
    public static void main(String[] args) {
        Station Counter1=new Station("Counter1");
        Station Counter2=new Station("Counter2");
        Station Counter3=new Station("Counter3");
        Counter1.start();
        Counter2.start();
        Counter3.start();
    }

}

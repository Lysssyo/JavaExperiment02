package com.gzhu.test;

public class SaleTicketMain {
    public static void main(String[] args) {
        //设置三个售票窗口
        Station Counter1=new Station("Counter1");
        Station Counter2=new Station("Counter2");
        Station Counter3=new Station("Counter3");
        //三个窗口同时卖票
        Counter1.start();
        Counter2.start();
        Counter3.start();
    }

}

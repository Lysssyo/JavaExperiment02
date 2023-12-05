package com.gzhu.test;

public class Station extends Thread {
    //这个类的所有对象共享ticket这一数据
    static  int ticket=0;
    static boolean ticketsSoldOut = false;
    static Object obj=new Object();

    public Station(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj){
                if (ticket<100){
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket + "张票");
                }
                else{
                    if (!ticketsSoldOut) {
                        System.out.println("票卖完了！");
                        ticketsSoldOut = true;
                    }
                    break;
                }
            }
            Thread.yield();//随机一点
            //Test
        }

    }
}

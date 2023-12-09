package com.gzhu.test;

// 定义一个站点类，继承自Thread类
public class Station extends Thread {

    // 所有对象共享的卖票数据
    static int ticket = 0;  // 卖出的票数，初始化为0
    static boolean ticketsSoldOut = false;  // 是否卖光了的标志，初始化为false
    static Object obj = new Object();  // 对象锁，用于同步

    //定义一个带参的构造函数，用于新建线程的同时可以顺便把名字给赋值
    public Station(String name) {
        super(name);  // 调用Thread类的构造方法，设置线程的名称
    }

    // 线程执行的主体方法
    @Override
    public void run() {
        // 循环执行卖票的操作
        while (true) {
            // 使用 synchronized 关键字保证线程安全，锁定 obj 对象
            synchronized (obj) {
                // 如果卖的票数小于20，继续卖票
                if (ticket < 20) {
                    ticket++;  // 增加卖出的票数
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket + "张票");
                } else {
                    // 如果票卖完了且还没有标记为卖光
                    if (!ticketsSoldOut) {
                        System.out.println("票卖完了！");
                        ticketsSoldOut = true;  // 标记为卖光
                    }
                    // 退出循环，结束线程执行
                    break;
                }
            }
            Thread.yield();  // 重新分配CPU，线程重新抢CPU
        }
    }
}


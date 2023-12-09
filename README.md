## 实验18实验报告（二）题目 

### **18.1** **实验目的** 

• 熟悉 Java 图形界面的基本设计。

• 熟悉 Java 界面的菜单使用方法。

• 熟悉 Java 的多线程应用程序开发方法。

### **18.2** **实验任务** **1** 

编写 Java 应用程序，实现登陆界面

![image-20231205145338924](https://github.com/Lysssyo/JavaExperiment02/assets/111691546/f4d90b02-be97-4320-8f95-0f2729b59788)

### **18.3** **实验任务** **2** 

编写 Java 应用程序，实现Menu界面

![image-20231205145346203](https://github.com/Lysssyo/JavaExperiment02/assets/111691546/237ccd16-63b9-4297-935d-29957659cf12)

### **18.4** **实验任务** **3** 

编写一个 Java 多线程应用程序，完成三个售票窗口同时出售 20 张票。具体要求如下：

- 票数要使用同一个静态值

- 为保证不会出现卖出同一个票数，要 java 多线程同步锁

设计思路：

- 创建一个站台类 Station，继承 Thread，重写 run 方法，在 run 方法里面执行售票操作。售票要使用同步锁：即有一个站台卖这张票时，其他站台要等这张票卖完

- 创建主方法调用类
  
![image-20231205145355856](https://github.com/Lysssyo/JavaExperiment02/assets/111691546/8ffbb4ca-64a3-4290-8deb-6823267007dd)

# 代码解析

## 实验一：

​		实验一新定义一个ui类继承JFrame类，通过setSize()，setTitle()，setLocationRelativeTo()等方法设置界面，然后，创建JLabel，JTextField等组件，最后使用布局管理器GroupLayout，实现水平和垂直方向的组件布局，基本框架如图所示。

![图片1](https://github.com/Lysssyo/JavaExperiment02/assets/111691546/bbbc14ec-a262-497d-92d1-a075b1f83b5f)


## **实验二：**

​		实验二中定义了一个名为myMenu的Java类，继承自JFrame。首先，通过setSize()，setTitle()，setLocationRelativeTo()等方法设置界面。接着，通过JMenuBar创建了一个菜单栏对象，并初始化了三个主菜单选项："File"、"Format"和"Help"。在"Format"菜单下，创建了两个子选项："中文"和"进制"。

​		然后，通过jMenuBar.add()方法将菜单上的选项添加到菜单对象jMenuBar中，通过setJMenuBar(jMenuBar)方法将菜单栏对象设置到窗口中，确保菜单能够与窗口关联。最后，通过setVisible(true)显示了整个窗口，包括窗口本身、菜单栏以及各个菜单选项。另外，通过setAlwaysOnTop(true)设置窗口置顶，使其始终显示在其他窗口之上。

## 实验三：

​		实验三中，创建了一个名为Station的类，该类继承自Thread类，用于模拟一个火车站的售票窗口。每个窗口对应一个线程，通过继承 `Thread` 实现多线程。

​		Station类的每个对象包括三个静态变量：ticket表示已售票数（初始为0），ticketsSoldOut是票是否售罄的标志（初始为false，表示没有卖光），以及obj作为对象锁进行同步。

​		在run()方法中，用while无限循环模拟一直卖票的过程。在卖票的过程中，使用 synchronized关键字锁定对象obj，确保在同一时刻只有一个线程能够进入临界区，避免出现“票卖多了”，“同一张票卖了多次”，“某些票没有卖”的情况，从而保证线程安全。

​		在每次卖票后，通过Thread.yield()实现线程让步，重新分配CPU资源，让其他线程有机会抢占CPU。



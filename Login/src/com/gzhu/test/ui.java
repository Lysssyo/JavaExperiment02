package com.gzhu.test;

import javax.swing.*;
 import java.awt.*;

public class ui extends JFrame {
    public ui() {
        // 设置界面大小
        this.setSize(450, 300);

        // 设置登录界面的Title
        this.setTitle("登录");
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建用户名和密码的标签
        JLabel usernameLabel = new JLabel("用户名:");
        JLabel passwordLabel = new JLabel("密码:");

        // 创建用户名和密码的文本框
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        // 创建登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setAlignmentX(JButton.CENTER_ALIGNMENT);



        // 创建布局管理器
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // 设置水平和垂直的间隔
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // 添加组件到布局
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(usernameLabel)
                                .addComponent(passwordLabel))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(usernameField)
                                .addComponent(passwordField)
                                .addComponent(loginButton, GroupLayout.Alignment.CENTER))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(usernameLabel)
                                .addComponent(usernameField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordLabel)
                                .addComponent(passwordField))
                        .addComponent(loginButton)
        );

/*

        // 创建用户名和密码的标签
        JLabel usernameLabel = new JLabel("用户名:");
        JLabel passwordLabel = new JLabel("密码:");

        // 创建用户名和密码的文本框
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        //创建登录的按钮
        JButton loginButton = new JButton("确认");



        this.add(loginButton);
        this.add(usernameLabel);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(usernameField);

        //创建窗口布局器
        BorderLayout borderLayout=new BorderLayout();
        this.add(loginButton,borderLayout.CENTER);




*/


        // 显示所有内容
        this.setVisible(true);

        // 设置界面置顶
        this.setAlwaysOnTop(true);
    }
}


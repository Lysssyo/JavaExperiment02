package com.gzhu.test;

import javax.swing.*;
 import java.awt.*;

public class ui extends JFrame {
    public ui() {
        // 设置界面大小
        this.setSize(450, 250);

        // 设置登录界面的Title
        this.setTitle("登录");
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建用户名和密码的标签，用于管理文本
        JLabel usernameLabel = new JLabel("用户名:");
        JLabel passwordLabel = new JLabel("密码:");

        // 创建用户名和密码的文本框
        JTextField usernameField = new JTextField(20);//明文显示，宽度设置为20个字符
        JPasswordField passwordField = new JPasswordField(20);//密文显示，宽度设置为20个字符

        // 创建登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setAlignmentX(JButton.CENTER_ALIGNMENT);//将按钮的水平对齐方式设置为居中对齐

        // 创建布局管理器
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);//给隐藏容器设置布局管理器layout，后续可以通过layout管理容器的布局

        // 设置水平和垂直的间隔
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // 添加组件到布局
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)//创建一个并行组，左对齐
                                .addComponent(usernameLabel)//添加组件到组中
                                .addComponent(passwordLabel)
                        )//添加组件到组中
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(usernameField)
                                .addComponent(passwordField)
                                .addComponent(loginButton, GroupLayout.Alignment.CENTER)
                        )
        );
        //先是用户名标签和密码标签并排，然后是对应的文本字段也并排，最后是登录按钮。

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(usernameLabel)
                                .addComponent(usernameField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordLabel)
                                .addComponent(passwordField)
                        )
                        .addComponent(loginButton)
        );

        // 显示所有内容
        this.setVisible(true);

        // 设置界面置顶
        this.setAlwaysOnTop(true);
    }
}


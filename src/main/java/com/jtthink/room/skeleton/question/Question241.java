package com.jtthink.room.skeleton.question;

import com.jtthink.BackPanel;
import com.jtthink.ComponentExt.ButtonExt;
import com.jtthink.util.FunctionUtil;
import jdk.nashorn.internal.scripts.JD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question241 extends JDialog {

    public Question241(){
        init();
    }

    public void init(){


        //设置背景面板
        BackPanel panel = new BackPanel();
        this.add(panel);

        JLabel label = new JLabel("请选择此刻开关状态的正确显示");
        label.setBounds(200, 50, 200,80);
        panel.add(label);

        ImageIcon icon1 = FunctionUtil.getImage("OPEN200.png");
        ButtonExt button1 = new ButtonExt("", icon1, "CK201FZ-0"); //分闸
        button1.setBounds(50, 150, 200, 128);
        button1.setBorderPainted(false);
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        ImageIcon icon2 = FunctionUtil.getImage("CLOSE200.png");
        ButtonExt button2 = new ButtonExt("", icon2, "CK201FZ-1"); //合闸
        button2.setBounds(350, 150, 200, 128);
        button2.setBorderPainted(false);
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        this.setModal(true);
        this.setTitle("配电室1");
        this.setSize(600,400);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }




}

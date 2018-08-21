package com.jtthink;

import com.jtthink.room.RoomOneDialog;
import com.jtthink.room.RoomTwoDialog;
import com.jtthink.util.FunctionUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class MainFrame extends JFrame {


    public MainFrame(){
        init();
    }

    public void init(){

/*
        URL url = MainFrame.class.getClassLoader().getResource("456.png");
        Image image = Toolkit.getDefaultToolkit().getImage(url);
        BackPanel panel = new BackPanel();
        panel.setImage(image);
        this.add(panel);

        JButton jbutton = new JButton("hello");
        jbutton.setBounds(40, 110, 100, 30);
        jbutton.setCursor( Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) );
        jbutton.setContentAreaFilled(false);
        jbutton.setBorderPainted(false);
        panel.add(jbutton);

        //button图片
        URL url2 = Test.class.getClassLoader().getResource("789.png");
        ImageIcon icon = new ImageIcon(url2);
        JButton jbutton2 = new JButton("", icon);
        jbutton2.setBounds(300, 300, 100, 50);
        jbutton2.setBorderPainted(false);
        panel.add(jbutton2);

        */

        //设置背景面板
        BackPanel panel = new BackPanel();
        this.add(panel);

        //机房1
        ImageIcon icon1 = FunctionUtil.getImage("station10kv.png");
        JButton button1 = new JButton("", icon1);
        button1.setBounds(50, 50, 350, 450);
        button1.setBorderPainted(false);
        panel.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RoomOneDialog();
            }
        });

        //机房2
        ImageIcon icon2 = FunctionUtil.getImage("station380v.png");
        JButton button2 = new JButton("", icon2);
        button2.setBounds(400, 60, 520, 300);
        button2.setBorderPainted(false);
        panel.add(button2);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RoomTwoDialog();
            }
        });


        this.setTitle("员工操作界面");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setResizable(false);

        int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        this.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);

        this.setVisible(true);

    }

    public static void main(String[] args){
        new MainFrame();
    }


}

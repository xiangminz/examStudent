package com.jtthink.room;

import com.jtthink.BackPanel;
import com.jtthink.MainFrame;
import com.jtthink.room.skeleton.*;
import com.jtthink.util.FunctionUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RoomOneDialog extends JDialog  {


    public RoomOneDialog(){

        init();
    }

    private void init(){

        //设置背景面板
        BackPanel panel = new BackPanel();
        this.add(panel);

        //=================第一排==================
        //机柜1
        ImageIcon icon11 = FunctionUtil.getImage("212p100.png");
        JButton button11 = new JButton("", icon11);
        button11.setBounds(40, 40, 100, 283);
        button11.setBorderPainted(false);
        panel.add(button11);
        button11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel11();
            }
        });


        //机柜2
        ImageIcon icon12 = FunctionUtil.getImage("213p100.png");
        JButton button12 = new JButton("", icon12);
        button12.setBounds(140, 40, 100, 283);
        button12.setBorderPainted(false);
        panel.add(button12);
        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel12();
            }
        });


        //机柜3
        ImageIcon icon13 = FunctionUtil.getImage("214p100.png");
        JButton button13 = new JButton("", icon13);
        button13.setBounds(240, 40, 100, 283);
        button13.setBorderPainted(false);
        panel.add(button13);
        button13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel13();
            }
        });

        //机柜4
        ImageIcon icon14 = FunctionUtil.getImage("215p100.png");
        JButton button14 = new JButton("", icon14);
        button14.setBounds(340, 40, 100, 283);
        button14.setBorderPainted(false);
        panel.add(button14);
        button14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel14();
            }
        });

        //机柜5
        ImageIcon icon15 = FunctionUtil.getImage("216p100.png");
        JButton button15 = new JButton("", icon15);
        button15.setBounds(440, 40, 100, 283);
        button15.setBorderPainted(false);
        panel.add(button15);
        button15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel15();
            }
        });


        //机柜6
        ImageIcon icon16 = FunctionUtil.getImage("245p100.png");
        JButton button16 = new JButton("机柜6", icon16);
        button16.setBounds(540, 40, 100, 283);
        button16.setBorderPainted(false);
        panel.add(button16);
        button16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel16();
            }
        });

        //机柜7
        ImageIcon icon17 = FunctionUtil.getImage("2455p100.png");
        JButton button17 = new JButton("机柜7", icon17);
        button17.setBounds(630, 40, 100, 283);
        button17.setBorderPainted(false);
        panel.add(button17);
        button17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel17();
            }
        });

        //机柜8
        ImageIcon icon18 = FunctionUtil.getImage("226p100.png");
        JButton button18 = new JButton("机柜8", icon18);
        button18.setBounds(720, 40, 100, 283);
        button18.setBorderPainted(false);
        panel.add(button18);
        button18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel18();
            }
        });

        //机柜9
        ImageIcon icon19 = FunctionUtil.getImage("225p100.png");
        JButton button19 = new JButton("机柜9", icon19);
        button19.setBounds(810, 40, 100, 283);
        button19.setBorderPainted(false);
        panel.add(button19);
        button19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel19();
            }
        });

        //机柜10
        ImageIcon icon110 = FunctionUtil.getImage("224p100.png");
        JButton button110 = new JButton("机柜10", icon110);
        button110.setBounds(900, 40, 100, 283);
        button110.setBorderPainted(false);
        panel.add(button110);
        button110.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel110();
            }
        });

        //机柜11
        ImageIcon icon111 = FunctionUtil.getImage("223p100.png");
        JButton button111 = new JButton("机柜11", icon111);
        button111.setBounds(990, 40, 100, 283);
        button111.setBorderPainted(false);
        panel.add(button111);
        button111.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel111();
            }
        });

        //机柜12
        ImageIcon icon112 = FunctionUtil.getImage("222p100.png");
        JButton button212 = new JButton("机柜12", icon112);
        button212.setBounds(1080, 40, 100, 283);
        button212.setBorderPainted(false);
        panel.add(button212);
        button212.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel112();
            }
        });

        //机柜13
        ImageIcon icon113 = FunctionUtil.getImage("221p100.png");
        JButton button113 = new JButton("机柜13", icon113);
        button113.setBounds(1170, 40, 100, 283);
        button113.setBorderPainted(false);
        panel.add(button113);
        button113.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel113();
            }
        });


        //==============第二排===============
        //机柜1
        ImageIcon icon21 = FunctionUtil.getImage("49p100.png");
        JButton button21 = new JButton("", icon21);
        button21.setBounds(40, 400, 100, 283);
        button21.setBorderPainted(false);
        panel.add(button21);
        button21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel21();
            }
        });


        //机柜2
        ImageIcon icon22 = FunctionUtil.getImage("40p100.png");
        JButton button22 = new JButton("", icon22);
        button22.setBounds(140, 400, 100, 283);
        button22.setBorderPainted(false);
        panel.add(button22);
        button22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel22();
            }
        });


        //机柜3
        ImageIcon icon23 = FunctionUtil.getImage("44p100.png");
        JButton button23 = new JButton("", icon23);
        button23.setBounds(240, 400, 100, 283);
        button23.setBorderPainted(false);
        panel.add(button23);
        button23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel23();
            }
        });

        //机柜4
        ImageIcon icon24 = FunctionUtil.getImage("201p100.png");
        JButton button24 = new JButton("", icon24);
        button24.setBounds(340, 400, 100, 283);
        button24.setBorderPainted(false);
        panel.add(button24);
        button24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel24();
            }
        });

        //机柜5
        ImageIcon icon25 = FunctionUtil.getImage("2012p100.png");
        JButton button215 = new JButton("", icon25);
        button215.setBounds(440, 400, 100, 283);
        button215.setBorderPainted(false);
        panel.add(button215);
        button215.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel25();
            }
        });


        //机柜6
        ImageIcon icon216 = FunctionUtil.getImage("2022p100.png");
        JButton button216 = new JButton("机柜6", icon216);
        button216.setBounds(810, 400, 100, 283);
        button216.setBorderPainted(false);
        panel.add(button216);
        button216.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel26();
            }
        });

        //机柜7
        ImageIcon icon27 = FunctionUtil.getImage("202p100.png");
        JButton button27 = new JButton("机柜7", icon27);
        button27.setBounds(900, 400, 100, 283);
        button27.setBorderPainted(false);
        panel.add(button27);
        button27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel27();
            }
        });

        //机柜8
        ImageIcon icon28 = FunctionUtil.getImage("55p100.png");
        JButton button28 = new JButton("机柜8", icon28);
        button28.setBounds(990, 400, 100, 283);
        button28.setBorderPainted(false);
        panel.add(button28);
        button28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel28();
            }
        });

        //机柜9
        ImageIcon icon29 = FunctionUtil.getImage("50p100.png");
        JButton button29 = new JButton("机柜9", icon29);
        button29.setBounds(1080, 400, 100, 283);
        button29.setBorderPainted(false);
        panel.add(button29);
        button29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel29();
            }
        });

        //机柜10
        ImageIcon icon210 = FunctionUtil.getImage("59p100.png");
        JButton button210 = new JButton("机柜10", icon210);
        button210.setBounds(1170, 400, 100, 283);
        button210.setBorderPainted(false);
        panel.add(button210);
        button210.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Panel210();
            }
        });

/**/

        this.setModal(true);
        this.setTitle("配电室1");
        this.setSize(1500,800);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


}

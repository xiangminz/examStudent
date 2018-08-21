package com.jtthink.room.skeleton;

import com.jtthink.BackPanel;
import com.jtthink.util.FunctionUtil;

import javax.swing.*;

public class Panel25 extends JDialog {
/*

    private ButtonExt bet1;
    private ButtonExt bet2;
    private ButtonExt bet3;
*/

    public Panel25(){

        super();
        init();

    }



    public void init(){




        //设置背景面板
        BackPanel panel = new BackPanel();
        panel.setImage(FunctionUtil.getBackImage("2012p478.png"));
        this.add(panel);

       /* bet1 = new ButtonExt("", null, "splitState");
        bet1.setBounds(260, 160, 90, 30);
        bet1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bet1.setContentAreaFilled(false);
        bet1.setBorderPainted(false);
        panel.add(bet1);
        bet1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Question241();
            }
        });

        bet2 = new ButtonExt("bet2", null, "splitHand");
        bet2.setBounds(40, 40, 90, 30);
//        bet1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        bet1.setContentAreaFilled(false);
        panel.add(bet2);

        bet3 = new ButtonExt("bet3", null, "elecShow");
        bet3.setBounds(40, 100, 90, 30);
//        bet1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        bet1.setContentAreaFilled(false);
//        bet1.setBorderPainted(false);
        panel.add(bet3);*/

        this.setModal(true);
        this.setTitle("2012柜");
        this.setSize(500,800);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}

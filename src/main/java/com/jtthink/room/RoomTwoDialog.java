package com.jtthink.room;

import com.jtthink.BackPanel;
import com.jtthink.util.FunctionUtil;

import javax.swing.*;

public class RoomTwoDialog extends JDialog  {

    public RoomTwoDialog(){
        init();
    }


    private void init(){


        //设置背景面板
        BackPanel panel = new BackPanel();
        panel.setImage(FunctionUtil.getBackImage("station380p800.png"));
        this.add(panel);



        this.setModal(true);
        this.setTitle("配电室2");
        this.setSize(800,500);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}

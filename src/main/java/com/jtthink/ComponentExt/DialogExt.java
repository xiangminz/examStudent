package com.jtthink.ComponentExt;

import com.jtthink.BackPanel;

import javax.swing.*;

public abstract class DialogExt extends JDialog {

    public DialogExt(){

        super();
        init();

    }

    protected abstract void addButton(JPanel panel);

    public void init(){

        //设置背景面板
        BackPanel panel = new BackPanel();
        this.add(panel);

        addButton(panel);

        this.setModal(true);
        this.setTitle("配电室1");
        this.setSize(500,800);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }







}

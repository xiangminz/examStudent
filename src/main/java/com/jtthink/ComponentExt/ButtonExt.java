package com.jtthink.ComponentExt;

import javax.swing.*;

public class ButtonExt extends JButton {

    private String buttonTag;

    public ButtonExt(String buttonName, Icon icon, String buttonTag) {
        super(buttonName, icon);
        this.buttonTag = buttonTag;
    }

    public String getButtonTag() {
        return buttonTag;
    }

    public void setButtonTag(String buttonTag) {
        this.buttonTag = buttonTag;
    }
}

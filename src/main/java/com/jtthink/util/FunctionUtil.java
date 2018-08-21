package com.jtthink.util;

import com.jtthink.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class FunctionUtil {




    public static ImageIcon getImage(String imageName){

        URL url1 = FunctionUtil.class.getClassLoader().getResource(imageName);
        ImageIcon icon = new ImageIcon(url1);

        return icon;
    }

    public static Image getBackImage(String imageName){

        URL url = FunctionUtil.class.getClassLoader().getResource(imageName);
        Image image = Toolkit.getDefaultToolkit().getImage(url);

        return image;
    }






}

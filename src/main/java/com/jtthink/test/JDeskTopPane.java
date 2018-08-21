package com.jtthink.test;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JDeskTopPane extends JFrame {

	public static void main(String args[]) {
		JDeskTopPane frame = new JDeskTopPane();
		frame.setVisible(true);
	}

	public JDeskTopPane() {
		super();
		setTitle("Ϊ���������ӱ���ͼƬ");
		setBounds(100, 100, 570, 430);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JDesktopPane desktopPane = new JDesktopPane(); // ����һ������������
		getContentPane().add(desktopPane, BorderLayout.CENTER);   //���ͼƬ�ӵ���contentPane�����

		final JLabel backLabel = new JLabel(); // ����һ����ǩ�������
		
		URL resource = this.getClass().getResource(""); // ��ñ���ͼƬ��·��
		ImageIcon icon = new ImageIcon(resource); // ��������ͼƬ����
		
		backLabel.setIcon(icon); // ���ǩ�����ʾ����ͼƬ
		backLabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // �����������ʾλ�ü���С
		
		desktopPane.add(backLabel, new Integer(Integer.MIN_VALUE)); // ����ǩ�����ӵ�ָ������λ��
	}

}

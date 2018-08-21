package com.jtthink.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest extends JFrame {

	public static void main(String args[]) {
		JMenuTest frame = new JMenuTest();
		frame.setVisible(true);
	}

	
	//menu�Ĳ㼶��ϵ��JMenuBar JMenu JMenuItem��menu�пɼ�menu��
	public JMenuTest() {  //���캯��Ҳ��һ�ַ���
		super();
		setTitle("�����˵���");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();// �����˵�������
		setJMenuBar(menuBar);// ���˵���������ӵ�����Ĳ˵�����

		JMenu menu = new JMenu("�˵�����");// �����˵�����
		menuBar.add(menu);// ���˵�������ӵ��˵���������

		JMenuItem menuItem = new JMenuItem("�˵�������");// �����˵������
		menuItem.addActionListener(new ItemListener());// Ϊ�˵�������¼�������
		menu.add(menuItem);// ���˵��������ӵ��˵�������

		JMenu sonMenu = new JMenu("�Ӳ˵�����");// �����˵����Ӳ˵�����
		menu.add(sonMenu);// ���Ӳ˵�������ӵ��ϼ��˵�������

		JMenuItem sonMenuItem = new JMenuItem("�Ӳ˵�������");// �����Ӳ˵��Ĳ˵������
		sonMenuItem.addActionListener(new ItemListener());// Ϊ�˵�������¼�������
		sonMenu.add(sonMenuItem);// ���Ӳ˵��Ĳ˵��������ӵ��Ӳ˵�������

		JMenu menu2 = new JMenu("�˵�����2");// �����˵�����
		menuBar.add(menu2);// ���˵�������ӵ��˵���������

		JMenuItem menuItem2 = new JMenuItem("�˵�������2");// �����˵������
		menuItem2.addActionListener(new ItemListener());// Ϊ�˵�������¼�������
		menu2.add(menuItem2);// ���˵��������ӵ��˵�������

		JMenu sonMenu2 = new JMenu("�Ӳ˵�����2");// �����˵����Ӳ˵�����
		menu2.add(sonMenu2);// ���Ӳ˵�������ӵ��ϼ��˵�������

		final JMenuItem sonMenuItem2 = new JMenuItem("�Ӳ˵�������2");// �����Ӳ˵��Ĳ˵������
//		sonMenuItem2.addActionListener(new ItemListener());// Ϊ�˵�������¼�������
		sonMenuItem2.addActionListener(new ActionListener(){ //��ɲ˵��¼���д��
			public void actionPerformed(ActionEvent e) {
				System.out.println(sonMenuItem2.getText());  //�¼���Ҫʹ�õĿؼ��趨���final����
			}
		});
		sonMenu2.add(sonMenuItem2);// ���Ӳ˵��Ĳ˵��������ӵ��Ӳ˵�������
	}

	private class ItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JMenuItem menuItem = (JMenuItem) e.getSource();  //��ȡ�¼�Դ����һ���ؼ�
			System.out.println("���������ǲ˵��" + menuItem.getText());
		}
	}
}


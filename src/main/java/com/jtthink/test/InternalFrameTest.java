package com.jtthink.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.net.URL;

public class InternalFrameTest extends JFrame {

	JDesktopPane desktopPane = null;// ����һ������������

	InternalFrame pInFrame = null;// ����һ�����¹����ڲ��������

	InternalFrame rInFrame = null;// ����һ�����׹����ڲ��������

	InternalFrame tInFrame = null;// ����һ�����������ڲ��������

	public static void main(String args[]) {
		InternalFrameTest frame = new InternalFrameTest();
		frame.setVisible(true);
	}

	public InternalFrameTest() {
		super();
		setTitle("��ҵ���¹���ϵͳ");
		setBounds(100, 100, 570, 470);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �����������
		desktopPane = new JDesktopPane();// ��������������
		desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);// �����ڲ�������϶�ģʽ
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		// Ϊ���������ӱ���ͼƬ
		final JLabel backLabel = new JLabel(); // ����һ����ǩ�������
		URL resource = this.getClass().getResource(""); // ��ñ���ͼƬ��·��
		ImageIcon icon = new ImageIcon(resource); // ��������ͼƬ����
		backLabel.setIcon(icon); // ���ǩ�����ʾ����ͼƬ
		backLabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // �����������ʾλ�ü���С
		desktopPane.add(backLabel, new Integer(Integer.MIN_VALUE)); // ����ǩ�����ӵ�ָ������λ��

		// ��Ӱ�ť
		final JPanel panel = new JPanel();
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setLayout(flowLayout);
		getContentPane().add(panel, BorderLayout.NORTH);

		final JButton personnelButton = new JButton();
		personnelButton.setText("���¹���");
		personnelButton.addActionListener(new BAListener(pInFrame, "���¹���"));
		panel.add(personnelButton);

		final JButton reckoningButton = new JButton();
		reckoningButton.setText("���׹���");
		reckoningButton.addActionListener(new BAListener(rInFrame, "���׹���"));
		panel.add(reckoningButton);

		final JButton treatmentButton = new JButton();
		treatmentButton.setText("��������");
		treatmentButton.addActionListener(new BAListener(tInFrame, "��������"));
		panel.add(treatmentButton);
		//
	}

	private class BAListener implements ActionListener {

		InternalFrame inFrame;

		String title;

		public BAListener(InternalFrame inFrame, String title) {
			this.inFrame = inFrame;
			this.title = title;
		}

		public void actionPerformed(ActionEvent e) {
			
			if (inFrame == null || inFrame.isClosed()) {
				/*������ʾ�ڲ����� */
				JInternalFrame[] allFrames = desktopPane.getAllFrames();// �����������е������ڲ�����
				int titleBarHight = 30*allFrames.length;// ������������ӵ���ڲ����������
				int x = 10 + titleBarHight, y = x;// ���ô������ʾλ��
				int width = 250, height = 180;// ���ô���Ĵ�С
				inFrame = new InternalFrame(title);// ����ָ��������ڲ�����
				inFrame.setBounds(x, y, width, height);// ���ô������ʾλ�ü���С
				/*������ʾ�ڲ�������� */
				inFrame.setVisible(true);// ���ô���ɼ�
				desktopPane.add(inFrame);// ��������ӵ����������
			}
			try {
				inFrame.setSelected(true);// ѡ�д���
			} catch (PropertyVetoException propertyVetoE) {
				propertyVetoE.printStackTrace();
			}
		}
	}

	private class InternalFrame extends JInternalFrame { //������һ���ڲ�����ʵ���ڲ�����

		JButton button = new JButton("hello");
		JPanel panel = new JPanel();
		
		public InternalFrame(String title) {
			super();
			setTitle(title);// �����ڲ�����ı���
			setResizable(true);// �����������ɵ�����С
			setClosable(true);// �����ṩ�رհ�ť
			setIconifiable(true);// �����ṩͼ�껯��ť
			setMaximizable(true);// �����ṩ��󻯰�ť
			
			
			this.setContentPane(panel);
			button.setBounds(20, 20, 60, 60);
			panel.add(button);
			button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new InternalFrame("hello");
				}
			});
			
			URL resource = this.getClass().getResource(""); // ��ñ���ͼƬ��·��
			ImageIcon icon = new ImageIcon(resource); // ��������ͼƬ����
			setFrameIcon(icon);
		}
	}
}


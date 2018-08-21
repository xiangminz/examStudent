package com.jtthink;



import com.jtthink.entity.UserInfo;
import com.jtthink.httpClient.HttpConfig;
import com.jtthink.httpClient.HttpServiceImpl;
import com.jtthink.util.JsonUtil;
import com.jtthink.util.ParamUtil;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame  {

    private JButton jbtnLogin, jbtnCancel;
    private JPanel jpanel;
    private JLabel jlabelName, jLabelPass;
    private JTextField jtfName, jtfPass;
    private JFrame jframe = new JFrame();

    public LoginFrame(){
        init();
    }

    public void init(){

        jpanel = new JPanel(new BorderLayout());
        jframe.setContentPane(jpanel);

        jpanel.add(getCenterPanel(), BorderLayout.CENTER);
        jpanel.add(getSouthPanel(), BorderLayout.SOUTH);

        jframe.setTitle("员工考试系统");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 200);
        jframe.setResizable(false);

        int windowWidth = jframe.getWidth();
        int windowHeight = jframe.getHeight();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        jframe.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);

        jframe.setVisible(true);

    }

    private JPanel getCenterPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        JPanel panelUp = new JPanel(new FlowLayout());
        jlabelName = new JLabel("姓 名:");
        jtfName = new JTextField(13);
        panelUp.add(jlabelName);
        panelUp.add(jtfName);

        JPanel panelDown = new JPanel(new FlowLayout());
        jLabelPass = new JLabel("密 码:");
        jtfPass = new JTextField(13);
        panelDown.add(jLabelPass);
        panelDown.add(jtfPass);


        panel.add(panelUp);
        panel.add(panelDown);


        return panel;
    }

    private JPanel getSouthPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        jbtnLogin = new JButton("登录");
        jbtnCancel = new JButton("取消");

        jbtnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String url = ParamUtil.getConfigValue("url");
                int port = Integer.parseInt(ParamUtil.getConfigValue("port"));

                HttpConfig config = new HttpConfig();
                config.setServerIp(url);
                config.setServerPort(port);
                config.setUrl("login");

                /* get请求
                String content  = new HttpServiceImpl().get(config);
                System.out.println(content);
                */

                String user_name = jtfName.getText().trim();
                String user_pass = jtfPass.getText().trim();
                int type = 2;
                UserInfo userInfo = new UserInfo(user_name, user_pass, type);
                String reqMsg = JsonUtil.objectToJsonStr(userInfo);

                /* post请求 */
                String content  = new HttpServiceImpl().post(reqMsg, config); //true false

                if( content != null && content.equals("true") ){
                    new MainFrame();
                    jframe.dispose();
                }else{
                    JOptionPane.showMessageDialog(jframe, "密码不正确", "信息提示框",JOptionPane.WARNING_MESSAGE);

                    /* 几个信息提示框
                    JOptionPane.showMessageDialog(null, "我是普通提示框！╮(╯▽╰)╭");
                    );JOptionPane.showMessageDialog(null, "我是错误提示框！╮(╯▽╰)╭", "标题",JOptionPane.ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "我是最基本提示框！╮(╯▽╰)╭", "标题",JOptionPane.PLAIN_MESSAGE);

                    int n = JOptionPane.showConfirmDialog(null, "你会了吗?", "标题",JOptionPane.YES_NO_OPTION); //返回值为0或1

                    Object[] options ={ "必须是", "当然是" };  //自定义按钮上的文字
                    int m = JOptionPane.showOptionDialog(null, "钓鱼岛是中国的吗？", "标题",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                    Object[] obj2 ={ "路人甲", "路人乙", "路人丙" };
                    String s = (String) JOptionPane.showInputDialog(null,"请选择你的身份:\n", "身份", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "足球");

                    JOptionPane.showInputDialog(null,"请输入：\n","title",JOptionPane.PLAIN_MESSAGE);
                    */
                }

            }
        });

        jbtnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtfName.setText("");
                jtfPass.setText("");

            }
        });

        panel.add(jbtnLogin);
        panel.add(jbtnCancel);

        return panel;
    }



    public static void main(String[] args){
        new LoginFrame();
    }

}

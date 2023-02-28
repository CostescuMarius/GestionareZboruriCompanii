package View;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LoginScreen extends JLayeredPane {
    int width, height;

    private JLabel l_login_email, l_login_password,
            l_logo_company, l_company_name, l_motto, l_info,
            l_register_firstname, l_register_lastname, l_register_email, l_register_password, l_register_mobile_no, l_register_address;
    private JTextField text_email;
    private JPasswordField text_password;
    private BackgroundLogin background_login;

    private JButton b_login_interface, b_register_interface, b_login, b_register;

    public LoginScreen(int width, int height) {
        this.width = width;
        this.height = height;

        set_labels();

        set_login_info();

        set_register_info();

        set_buttons();

        add_action_buttons();
    }

    private void set_labels() {
        background_login = new BackgroundLogin(this.width, this.height);
        this.add(background_login, 1, 0);

        l_logo_company = new JLabel();
        ImageIcon background = new ImageIcon("src//Resources//logo_company.jpg");
        if (background != null) {
            l_logo_company.setIcon(background);
        }
        l_logo_company.setBounds(1100, 0, 600, 400);
        this.add(l_logo_company, 2, 0);

        l_company_name = new JLabel("MMS AirLine");
        l_company_name.setBounds(1200, 220, 150, 20);
        l_company_name.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
        l_company_name.setForeground(Color.black);
        this.add(l_company_name, 2, 0);

        l_motto = new JLabel("Embrace the Sky!");
        l_motto.setBounds(1170, 280, 250, 50);
        l_motto.setFont(new Font("Freestyle Script", Font.ITALIC, 40));
        l_motto.setForeground(Color.black);
        this.add(l_motto, 2, 0);

        l_info = new JLabel("<html>Don't have an account yet?<br/>Sign up using Register button!</html>");
        l_info.setBounds(90, 420, 500, 50);
        l_info.setFont(new Font("Arial", Font.ITALIC, 15));
        l_info.setForeground(Color.white);
        this.add(l_info, 2, 0);
    }

    private void set_register_info() {
        l_register_firstname = new JLabel();
        l_register_lastname = new JLabel();
        l_register_email = new JLabel();
        l_register_password = new JLabel();
        l_register_mobile_no = new JLabel();
        l_register_address = new JLabel();
    }

    private void set_login_info() {
        l_login_email = new JLabel("E-mail:");
        l_login_email.setBounds(70, 210, 100, 20);
        l_login_email.setFont(new Font("Arial", Font.ITALIC, 15));
        l_login_email.setForeground(Color.white);
        this.add(l_login_email, 2, 0);

        l_login_password = new JLabel("Password:");
        l_login_password.setBounds(70, 250, 100, 20);
        l_login_password.setFont(new Font("Arial", Font.ITALIC, 15));
        l_login_password.setForeground(Color.white);
        this.add(l_login_password, 2, 0);

        text_email = new JTextField();
        text_email.setBounds(170, 210, 360, 20);
        text_email.setBorder(null);
        text_email.setBackground(new Color(81, 97, 200));
        text_email.setForeground(new Color(224, 213, 240));
        this.add(text_email, 2, 0);

        text_password = new JPasswordField();
        text_password.setBounds(170, 250, 360, 20);
        text_password.setBorder(null);
        text_password.setBackground(new Color(81, 97, 200));
        text_password.setForeground(new Color(224, 213, 240));
        this.add(text_password, 2, 0);
    }

    private void set_buttons(){
        b_login_interface = new JButton("Login");
        b_login_interface.setBounds(50, 150, 75, 25);
        b_login_interface.setBackground(new Color(123, 126, 230));
        b_login_interface.setForeground(Color.white);
        this.add(b_login_interface, 2, 0);

        b_register_interface = new JButton("Register");
        b_register_interface.setBounds(125, 150, 425, 25);
        this.add(b_register_interface, 2, 0);
    }

    private void add_action_buttons() {
        b_login_interface.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                l_register_firstname.setVisible(false);
                l_register_lastname.setVisible(false);
                l_register_email.setVisible(false);
                l_register_password.setVisible(false);
                l_register_mobile_no.setVisible(false);
                l_register_address.setVisible(false);

                l_login_email.setVisible(true);
                l_login_password.setVisible(true);
                text_email.setVisible(true);
                text_password.setVisible(true);

                l_info.setText("<html>Don't have an account yet?<br/>Sign up using Register button!</html>");
            }
        });

        b_register_interface.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l_login_email.setVisible(false);
                l_login_password.setVisible(false);
                text_email.setVisible(false);
                text_password.setVisible(false);

                l_register_firstname.setVisible(true);
                l_register_lastname.setVisible(true);
                l_register_email.setVisible(true);
                l_register_password.setVisible(true);
                l_register_mobile_no.setVisible(true);
                l_register_address.setVisible(true);

                l_info.setText("<html>Do you have an account?<br/>Sign in!</html>");
            }
        });
    }
}

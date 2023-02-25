package View;


import java.awt.*;

import javax.swing.*;


public class LoginScreen extends JLayeredPane {
    int width, height;

    private JLabel l_user, l_password, l_logo_company;
    private JTextField text_user;
    private JPasswordField text_password;
    BackgroundLogin background_login;

    public LoginScreen(int width, int height) {
        this.width = width;
        this.height = height;

        set_labels();

        set_insert_username_and_password();

        //set_buttons();
    }

    private void set_labels() {
        background_login = new BackgroundLogin(this.width, this.height);
        this.add(background_login, 1, 0);

        l_user = new JLabel("Username:");
        l_user.setBounds(70, 190, 100, 20);
        l_user.setFont(new Font("Arial", Font.ITALIC, 15));
        l_user.setForeground(Color.white);
        this.add(l_user, 2, 0);

        l_password = new JLabel("Password:");
        l_password.setBounds(70, 230, 100, 20);
        l_password.setFont(new Font("Arial", Font.ITALIC, 15));
        l_password.setForeground(Color.white);
        this.add(l_password, 2, 0);

        l_logo_company = new JLabel();
        ImageIcon background = new ImageIcon("src//Resources//logo_company.jpg");
        if (background != null) {
            l_logo_company.setIcon(background);
        }
        l_logo_company.setBounds(0, 0, 600, 400);
        this.add(l_logo_company, 2, 0);
    }

    private void set_insert_username_and_password() {
        text_user = new JTextField();
        text_user.setBounds(170, 190, 170, 20);
        text_user.setBorder(null);
        text_user.setBackground(new Color(81, 97, 185));
        text_user.setForeground(new Color(224, 213, 240));
        this.add(text_user, 2, 0);

        text_password = new JPasswordField();
        text_password.setBounds(170, 230, 170, 20);
        text_password.setBorder(null);
        text_password.setBackground(new Color(81, 97, 185));
        text_password.setForeground(new Color(224, 213, 240));
        this.add(text_password, 2, 0);
    }

}

package View;


import java.awt.*;

import javax.swing.*;


public class LoginScreen extends JPanel {
    int w = this.getWidth();
    int h = this.getHeight();
    JLabel l_user;
    JLabel l_password;
    public LoginScreen() {

        this.setLayout(null);

        set_labels();
    }

    private void set_labels() {
        l_user = new JLabel("Username:");
        l_user.setBounds(20, 100, 100, 20);
        l_user.setFont(new Font("Arial", Font.BOLD, 15));
        l_user.setForeground(Color.white);
        this.add(l_user);

        l_password = new JLabel("Password:");
        l_password.setBounds(20, 130, 100, 20);
        l_password.setFont(new Font("Arial", Font.BOLD, 15));
        l_password.setForeground(Color.white);
        this.add(l_password);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        ImageIcon background = new ImageIcon("src//Resources//login_screen_image.jpg");
        if (background != null) {
            w = this.getWidth();
            h = this.getHeight();
            g.drawImage(background.getImage(), 0, 0, w, h, this);
        }

        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        g2d.fillRect(50, 110, 500, 300);
    }

}

package View;

import javax.swing.*;
import java.awt.*;

public class ApplicationWindow extends JFrame {
    LoginScreen login_screen;
    public ApplicationWindow() {
        this.setTitle("FLIGHT MANAGEMENT");

        ImageIcon icon = new ImageIcon("src//Resources//logo.jpg");
        this.setIconImage(icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1540, 830);


        login_screen = new LoginScreen(this.getWidth(), this.getHeight(), this);
        this.add(login_screen);

        this.setVisible(true);

    }

    public void login_successful() {
        login_screen.setVisible(false);
        Homepage homepage = new Homepage(this.getWidth(), this.getHeight());
        this.add(homepage);
    }
}

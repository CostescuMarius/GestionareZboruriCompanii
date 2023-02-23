package View;

import javax.swing.*;
import java.awt.*;

public class ApplicationWindow extends JFrame {
    LoginScreen login_screen = new LoginScreen();
    public ApplicationWindow() {
        this.setTitle("FLIGHT MANAGEMENT");

        ImageIcon icon = new ImageIcon("src//Resources//logo.jpg");
        this.setIconImage(icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.add(login_screen);
    }
}

package View;

import javax.swing.*;
import java.awt.*;


public class ApplicationWindow extends JFrame {
    private CardLayout cardLayout;
    private JPanel container_interfaces;
    private LoginScreen login_screen;
    private HomepageUser homepageUser;
    private ProfileUser profileUser;
    private SupportUser supportUser;
    private AdminInterface adminInterface;

    public ApplicationWindow() {
        this.setTitle("FLIGHT MANAGEMENT");

        ImageIcon icon = new ImageIcon("src//Resources//logo.jpg");
        this.setIconImage(icon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1540, 830);

        cardLayout = new CardLayout();
        container_interfaces = new JPanel(cardLayout);


        this.add(container_interfaces);

        login_screen = new LoginScreen(this.getWidth(), this.getHeight(), this);
        homepageUser = new HomepageUser(this.getWidth(), this.getHeight(), this);
        profileUser = new ProfileUser(this.getWidth(), this.getHeight(), this);
        supportUser = new SupportUser(this.getWidth(), this.getHeight(), this);
        adminInterface = new AdminInterface(this.getWidth(), this.getHeight(), this);

        //set_login_interface();

        //login_user_successful();

        login_admin_successful();

        this.setVisible(true);
    }

    public void set_login_interface() {
        container_interfaces.add(login_screen, "panel_login");
        cardLayout.show(container_interfaces, "panel_login");
    }

    public void login_user_successful() {
        container_interfaces.add(homepageUser, "panel_hpuser");
        cardLayout.show(container_interfaces, "panel_hpuser");
    }


    public void login_admin_successful() {
        container_interfaces.add(adminInterface, "panel_adminui");
        cardLayout.show(container_interfaces, "panel_adminui");
    }

    public void login_employee_successful() {

    }

    public void set_profile_interface() {
        profileUser.set_infos();
        container_interfaces.add(profileUser, "panel_profuser");
        cardLayout.show(container_interfaces, "panel_profuser");
    }

    public void set_support_user_interface() {
        //supportUser.set_infos();
        container_interfaces.add(supportUser, "panel_supuser");
        cardLayout.show(container_interfaces, "panel_supuser");
    }
}

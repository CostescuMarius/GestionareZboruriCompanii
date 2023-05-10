package View;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;


public class ApplicationWindow extends JFrame {
    private CardLayout cardLayout;
    private JPanel container_interfaces;
    private LoginScreen login_screen;
    private HomepageUser homepageUser;
    private ProfileUser profileUser;
    private SupportUser supportUser;
    private AdminInterface adminInterface;
    private EmployeeInterface employeeInterface;

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
        container_interfaces.add(login_screen, "panel_login");

        homepageUser = new HomepageUser(this.getWidth(), this.getHeight(), this);
        container_interfaces.add(homepageUser, "panel_hpuser");

        profileUser = new ProfileUser(this.getWidth(), this.getHeight(), this);
        container_interfaces.add(profileUser, "panel_profuser");

        supportUser = new SupportUser(this.getWidth(), this.getHeight(), this);
        container_interfaces.add(supportUser, "panel_supuser");

        adminInterface = new AdminInterface(this.getWidth(), this.getHeight(), this);
        container_interfaces.add(adminInterface, "panel_adminui");

        employeeInterface = new EmployeeInterface(this.getWidth(), this.getHeight(), this);
        container_interfaces.add(employeeInterface, "panel_employeeui");

        //set_login_interface();

        login_user_successful();

        //login_admin_successful();
        //login_employee_successful();

        this.setVisible(true);
    }

    public void set_login_interface() {
        cardLayout.show(container_interfaces, "panel_login");
    }

    public void login_user_successful() {
        cardLayout.show(container_interfaces, "panel_hpuser");
    }


    public void login_admin_successful() {
        cardLayout.show(container_interfaces, "panel_adminui");
    }

    public void login_employee_successful() {
        cardLayout.show(container_interfaces, "panel_employeeui");
    }

    public void set_profile_interface() {
        profileUser.set_infos();
        cardLayout.show(container_interfaces, "panel_profuser");
    }

    public void set_support_user_interface() {
        cardLayout.show(container_interfaces, "panel_supuser");
    }
}

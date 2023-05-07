package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomepageUser extends JPanel{
    private int width, height;

    private JButton bSearch, bSupport, bProfile, bLogout;
    private JLabel lconfirmlogout, linfo;
    JButton binteriorConfirm;
    boolean confirm_logout_open = false;

    private JTextField textDepart, textArrival, textData, textType;
    private JLabel ldepart, larrival, ldata, ltype;

    private ApplicationWindow fa;
    public HomepageUser(int width, int height, ApplicationWindow fa) {
        this.width = width;
        this.height = height;
        this.fa = fa;

        this.setBounds(0, 0, this.width + 1000, this.height + 1000);


        this.setLayout(null);

        set_user_interface();

        this.setVisible(true);
    }

    private void set_user_interface() {
        set_components();
        set_labels();
        add_buttons_action();
    }

    private void set_labels() {
        BackgroundHomepage background_hp = new BackgroundHomepage(this.width, this.height);
        this.add(background_hp);
    }

    private void set_components() {
        bSearch = new JButton("Search");
        bSearch.setBounds(1230, 375, 150, 30);
        bSearch.setBackground(new Color(255, 197,42));
        bSearch.setBorder(null);
        this.add(bSearch);

        bSupport = new JButton("Support");
        bSupport.setBounds(1300, 0, 100, 30);
        this.add(bSupport);

        bProfile = new JButton("Profil");
        bProfile.setBounds(1200, 0, 100, 30);
        this.add(bProfile);


        linfo = new JLabel();
        linfo.setText("<html>Profita de reducerile companiilor aeriene!<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;Rezerva acum! :)</html>");
        linfo.setForeground(Color.white);
        linfo.setFont(new Font("Times New Roman", Font.BOLD, 32));
        linfo.setBounds(520, 180, 800, 100);
        this.add(linfo);

        set_logout_interface();
        add_search_texts();
    }

    private void set_logout_interface() {
        bLogout = new JButton("Logout");
        bLogout.setBounds(1430, 0, 100, 30);
        this.add(bLogout);

        lconfirmlogout = new JLabel();
        lconfirmlogout.setBackground(Color.white);
        lconfirmlogout.setOpaque(true);
        lconfirmlogout.setBounds(550, 330, 400, 60);
        lconfirmlogout.setLayout(new BoxLayout(lconfirmlogout, BoxLayout.Y_AXIS));
        lconfirmlogout.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel lconfirmtext = new JLabel("Are you sure you want to sign out?");
        lconfirmtext.setForeground(new Color(85, 98, 254));
        lconfirmtext.setOpaque(false);
        lconfirmtext.setAlignmentX(Component.CENTER_ALIGNMENT);
        lconfirmlogout.add(lconfirmtext);

        JPanel bConfirm = new JPanel();
        bConfirm.setLayout(new FlowLayout(FlowLayout.CENTER));
        binteriorConfirm = new JButton("Confirm");
        binteriorConfirm.setBackground(Color.white);
        binteriorConfirm.setForeground(new Color(85, 98, 254));
        bConfirm.add(binteriorConfirm);
        bConfirm.setOpaque(false);
        bConfirm.setAlignmentX(Component.CENTER_ALIGNMENT);

        lconfirmlogout.add(Box.createVerticalGlue());
        lconfirmlogout.add(bConfirm);
        lconfirmlogout.add(Box.createVerticalGlue());

        this.add(lconfirmlogout);
        lconfirmlogout.setVisible(false);

        binteriorConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lconfirmlogout.setVisible(false);
                fa.set_login_interface();
            }
        });
    }

    private void add_search_texts() {
        textDepart = new JTextField();
        textDepart.setBounds(150, 380, 225, 25);

        textArrival = new JTextField();
        textArrival.setBounds(420, 380, 225, 25);

        textData = new JTextField();
        textData.setBounds(690, 380, 225, 25);

        textType = new JTextField();
        textType.setBounds(960, 380, 225, 25);

        ldepart = new JLabel("Depart");
        ldepart.setForeground(Color.white);
        ldepart.setBounds(150, 342, 225, 25);

        larrival = new JLabel("Arrival");
        larrival.setForeground((Color.white));
        larrival.setBounds(420, 342, 225, 25);

        ldata = new JLabel("Data");
        ldata.setForeground(Color.white);
        ldata.setBounds(690, 342, 225, 25);

        ltype = new JLabel("Type");
        ltype.setForeground(Color.white);
        ltype.setBounds(960, 342, 225, 25);

        this.add(textDepart);
        this.add(textArrival);
        this.add(textData);
        this.add(textType);

        this.add(ldepart);
        this.add(larrival);
        this.add(ldata);
        this.add(ltype);
    }

    private void add_buttons_action() {
        bLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!confirm_logout_open) {
                    lconfirmlogout.setVisible(true);
                    confirm_logout_open = true;
                }
                else {
                    lconfirmlogout.setVisible(false);
                    confirm_logout_open = false;
                }
            }
        });

        bProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fa.set_profile_interface();
            }
        });

        bSupport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fa.set_support_user_interface();
            }
        });
    }
}

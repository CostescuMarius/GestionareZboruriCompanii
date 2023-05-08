package View;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeInterface extends JPanel {
    private int width, height;
    private ApplicationWindow fa;

    private boolean confirm_logout_open = false;

    JPanel navbarPanel;
    JButton addCompanyButton, deleteCompanyButton, addPlaneButton, deletePlaneButton, updatePlaneButton,
            addAirportDetailsButton, deleteAirportDetailsButton, updateAirportDetailsButton, addFlightButton,
            deleteFlightButton, updateFlightButton, generateReportsButton, bLogout, binteriorConfirm, bSupport;

    JPanel addCompanyPanel, deleteCompanyPanel, addPlanePanel, updatePlanePanel, deletePlanePanel, addFlightPanel, currentPanel, updateFlightPanel, deleteFlightPanel, addAirportDetailsPanel, updateAirportDetailsPanel, deleteAirportDetailsPanel, generateReportsPanel;

    JLabel lconfirmlogout;
    public EmployeeInterface(int width, int height, ApplicationWindow fa) {
        this.width = width;
        this.height = height;
        this.fa = fa;

        this.setBounds(0, 0, this.width, this.height);
        this.setOpaque(true);

        this.setLayout(null);


        set_navbar();
        set_logout_interface();


        /*// Creăm panel-urile pentru fiecare buton
        addCompanyPanel = new JPanel(new GridLayout(2, 2));
        addCompanyPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addCompanyPanel.add(new JLabel("Name:"));
        addCompanyPanel.add(new JTextField());
        addCompanyPanel.add(new JLabel());
        addCompanyPanel.add(new JButton("Save"));

        deleteCompanyPanel = new JPanel(new GridLayout(1, 2));
        deleteCompanyPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        deleteCompanyPanel.add(new JLabel("Company:"));
        deleteCompanyPanel.add(new JComboBox<String>());

        addPlanePanel = new JPanel(new GridLayout(3, 2));
        addPlanePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addPlanePanel.add(new JLabel("Company ID:"));
        addPlanePanel.add(new JComboBox<String>());
        addPlanePanel.add(new JLabel("Capacity:"));
        addPlanePanel.add(new JTextField());
        addPlanePanel.add(new JLabel("Name:"));
        addPlanePanel.add(new JTextField());
        addPlanePanel.add(new JLabel());
        addPlanePanel.add(new JButton("Save"));

        deletePlanePanel = new JPanel(new GridLayout(1, 2));
        deletePlanePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        deletePlanePanel.add(new JLabel("Plane:"));
        deletePlanePanel.add(new JComboBox<String>());

        updatePlanePanel = new JPanel(new GridLayout(4, 2));
        updatePlanePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        updatePlanePanel.add(new JLabel("Plane:"));
        updatePlanePanel.add(new JComboBox<String>());
        updatePlanePanel.add(new JLabel("Capacity:"));
        updatePlanePanel.add(new JTextField());
        updatePlanePanel.add(new JLabel("Name:"));
        updatePlanePanel.add(new JTextField());
        updatePlanePanel.add(new JLabel());
        updatePlanePanel.add(new JButton("Update"));

        addAirportDetailsPanel = new JPanel(new GridLayout(2, 2));
        addAirportDetailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addAirportDetailsPanel.add(new JLabel("Nume Aeroport:"));
        addAirportDetailsPanel.add(new JTextField());
        addAirportDetailsPanel.add(new JLabel("Locație Aeroport:"));
        addAirportDetailsPanel.add(new JTextField());
        deleteAirportDetailsPanel = new JPanel(new GridLayout(1, 2));
        deleteAirportDetailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        deleteAirportDetailsPanel.add(new JLabel("Selectați Aeroportul:"));
        deleteAirportDetailsPanel.add(new JComboBox());

        updateAirportDetailsPanel = new JPanel(new GridLayout(3, 2));
        updateAirportDetailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        updateAirportDetailsPanel.add(new JLabel("Selectați Aeroportul:"));
        updateAirportDetailsPanel.add(new JComboBox());
        updateAirportDetailsPanel.add(new JLabel("Noul Nume Aeroport:"));
        updateAirportDetailsPanel.add(new JTextField());
        updateAirportDetailsPanel.add(new JLabel("Noua Locație Aeroport:"));
        updateAirportDetailsPanel.add(new JTextField());

        addFlightPanel = new JPanel(new GridLayout(3, 2));
        addFlightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addFlightPanel.add(new JLabel("Ziua Plecării:"));
        addFlightPanel.add(new JTextField());
        addFlightPanel.add(new JLabel("Ziua Sosirii:"));
        addFlightPanel.add(new JTextField());
        addFlightPanel.add(new JLabel("Selectați Detaliile Aeroportului:"));
        addFlightPanel.add(new JComboBox());

        deleteFlightPanel = new JPanel(new GridLayout(1, 2));
        deleteFlightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        deleteFlightPanel.add(new JLabel("Selectați Zborul:"));
        deleteFlightPanel.add(new JComboBox());

        updateFlightPanel = new JPanel(new GridLayout(3, 2));
        updateFlightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        updateFlightPanel.add(new JLabel("Selectați Zborul:"));
        updateFlightPanel.add(new JComboBox());
        updateFlightPanel.add(new JLabel("Noua Ziua Plecării:"));
        updateFlightPanel.add(new JTextField());
        updateFlightPanel.add(new JLabel("Noua Ziua Sosirii:"));
        updateFlightPanel.add(new JTextField());

// Adăugăm fiecare panel la contentPane, cu un layout BoxLayout pe direcția verticală
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(addCompanyPanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(deleteCompanyPanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(addPlanePanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(deletePlanePanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(updatePlanePanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(addAirportDetailsPanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(deleteAirportDetailsPanel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(updateAirportDetailsPanel);
        contentPane.add(addFlightPanel);
        contentPane.add(deleteFlightPanel);
        contentPane.add(updateFlightPanel);
        //contentPane.add(generateReportsPanel);

        // Setam panel-ul initial
        setInitialPanel(addCompanyPanel);

        // Adaugam panel-ul la fereastra
        add(contentPane);

*/
    }
    private void set_navbar() {
        addCompanyButton = new JButton("AddCompany");
        addCompanyButton.setBounds(0, 20, 160, 40);

        deleteCompanyButton = new JButton("DeleteCompany");
        deleteCompanyButton.setBounds(0, 70, 160, 40);

        addPlaneButton = new JButton("AddPlane");
        addPlaneButton.setBounds(0, 120, 160, 40);

        deletePlaneButton = new JButton("DeletePlane");
        deletePlaneButton.setBounds(0, 170, 160, 40);

        updatePlaneButton = new JButton("UpdatePlane");
        updatePlaneButton.setBounds(0, 220, 160, 40);

        addAirportDetailsButton = new JButton("AddAirportDetails");
        addAirportDetailsButton.setBounds(0, 270, 160, 40);

        deleteAirportDetailsButton = new JButton("DeleteAirportDetails");
        deleteAirportDetailsButton.setBounds(0, 320, 160, 40);

        updateAirportDetailsButton = new JButton("UpdateAirportDetails");
        updateAirportDetailsButton.setBounds(0, 370, 160, 40);

        addFlightButton = new JButton("AddFlight");
        addFlightButton.setBounds(0, 420, 160, 40);

        deleteFlightButton = new JButton("DeleteFlight");
        deleteFlightButton.setBounds(0, 470, 160, 40);

        updateFlightButton = new JButton("UpdateFlight");
        updateFlightButton.setBounds(0, 520, 160, 40);

        generateReportsButton = new JButton("GenerateReports");
        generateReportsButton.setBounds(0, 570, 160, 40);

        bSupport = new JButton("Support");
        bSupport.setBounds(0, 620, 160, 40);

        this.add(addCompanyButton);
        this.add(deleteCompanyButton);
        this.add(addPlaneButton);
        this.add(deletePlaneButton);
        this.add(updatePlaneButton);
        this.add(addAirportDetailsButton);
        this.add(deleteAirportDetailsButton);
        this.add(updateAirportDetailsButton);
        this.add(addFlightButton);
        this.add(deleteFlightButton);
        this.add(updateFlightButton);
        this.add(generateReportsButton);
        this.add(bSupport);
    }

    private void set_logout_interface() {
        bLogout = new JButton("Logout");
        bLogout.setBounds(20, 720, 100, 30);
        this.add(bLogout);

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
}

    /*
     * Seteaza panel-ul initial al interfetei.
     * @param panel panel-ul initial
     //
    private void setInitialPanel(JPanel panel) {
        currentPanel = panel;
        addCompanyButton.setSelected(true);
        showPanel(currentPanel);
    }

    /**
     * Afiseaza un anumit panel si ascunde celelalte.
     * @param panel panel-ul care trebuie afisat

    private void showPanel(JPanel panel) {
        addCompanyButton.setSelected(false);
        deleteCompanyButton.setSelected(false);
        addPlaneButton.setSelected(false);
        deletePlaneButton.setSelected(false);
        updatePlaneButton.setSelected(false);
        addAirportDetailsButton.setSelected(false);
        deleteAirportDetailsButton.setSelected(false);
        updateAirportDetailsButton.setSelected(false);
        addFlightButton.setSelected(false);
        deleteFlightButton.setSelected(false);
        updateFlightButton.setSelected(false);
        generateReportsButton.setSelected(false);

        currentPanel.setVisible(false);
        currentPanel = panel;
        currentPanel.setVisible(true);
    }

    /**
     * Creaza un JLabel cu un anumit text si il adauga la un panel.
     * @param panel panel-ul la care trebuie adaugat JLabel-ul
     * @param text textul JLabel-ului

    private void addLabelToPanel(JPanel panel, String text) {
        JLabel label = new JLabel(text);
        panel.add(label);
    }

    /**
     * Creaza un JTextField si il adauga la un panel.
     * @param panel panel-ul la care trebuie adaugat JTextField-ul

    private void addTextFieldToPanel(JPanel panel) {
        JTextField textField = new JTextField();
        panel.add(textField);
    }

    /**
     * Creaza un JComboBox si il adauga la un panel.
     * @param panel panel-ul la care trebuie adaugat JComboBox-ul
     * @param items elementele din JComboBox

    private void addComboBoxToPanel(JPanel panel, Object[] items) {
        JComboBox<Object> comboBox = new JComboBox<>(items);
        panel.add(comboBox);
    }

}*/


package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import corba.CORBAClient;

public class FormUrgenceUI extends JFrame {
    private JTextField chambreField;
    private JComboBox<String> typeBox;
    private JTextField declarantField;
    private CORBAClient client;

    public FormUrgenceUI(CORBAClient client) {
        this.client = client;
        setTitle("Déclarer Urgence");
        setSize(300, 250);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Type:"));
        typeBox = new JComboBox<>(new String[]{"Arrêt cardiaque","Inconscient","Chute"});
        add(typeBox);

        add(new JLabel("Chambre:"));
        chambreField = new JTextField();
        add(chambreField);

        add(new JLabel("Déclarant:"));
        declarantField = new JTextField();
        add(declarantField);

        JButton envoyerBtn = new JButton("Envoyer");
        envoyerBtn.addActionListener(e -> envoyerUrgence());
        add(envoyerBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void envoyerUrgence() {
        String type = typeBox.getSelectedItem().toString();
        String chambre = chambreField.getText();
        String declarant = declarantField.getText();
        long id = client.envoyerUrgence(type, chambre, declarant);
        JOptionPane.showMessageDialog(this, "Urgence #" + id + " envoyée !");
    }
}

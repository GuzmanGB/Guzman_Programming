package com.example;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalFileChooserUI;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        


        JFrame ventana = new JFrame("CHAMBA");
        ventana.setSize(600, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        JPanel allPanel = new JPanel();
        allPanel.setBackground(Color.LIGHT_GRAY);

        JButton proxyButton = new JButton("Proxy");
        proxyButton.setBackground(Color.GRAY);
        proxyButton.setForeground(Color.BLACK);

        JButton cookiesButton = new JButton("Cookies");
        cookiesButton.setBackground(Color.GRAY);
        cookiesButton.setForeground(Color.BLACK);

        JButton acccountButton = new JButton("Accounts");
        acccountButton.setBackground(Color.LIGHT_GRAY);
        acccountButton.setForeground(Color.BLACK);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.LIGHT_GRAY);

        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(proxyButton);
        panelSuperior.add(cookiesButton);
        panelSuperior.add(acccountButton);

        // PANEL DE NUEVO USUARIO
        JPanel newUser = new JPanel();
        JPanel infNewUser = new JPanel();

        JButton addButton = new JButton("Add");
        addButton.setBackground(Color.lightGray);
        addButton.setForeground(Color.BLACK);

        infNewUser.add(new JLabel("Account Name: "));
        infNewUser.add(new TextField());
        infNewUser.add(new JLabel("Full Name: "));
        infNewUser.add(new TextField());
        infNewUser.add(new JLabel("Password: "));
        infNewUser.add(new JPasswordField());
        infNewUser.add(new JLabel("Repeat Password: "));
        infNewUser.add(new JPasswordField());
        infNewUser.add(addButton, BorderLayout.SOUTH);

        newUser.add(infNewUser, BorderLayout.CENTER);
        // PANEL DE NUEVO USUARIO



        // PANEL DE CUENTA USUARIO
        JPanel userAccount = new JPanel();
        JPanel infUser = new JPanel();

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBackground(Color.lightGray);
        deleteButton.setForeground(Color.BLACK);

        JTable table = new JTable();
        
        

        userAccount.add(deleteButton, BorderLayout.EAST);
        userAccount.add(infUser, BorderLayout.CENTER);
        // PANEL DE CUENTA USUARIO



        JButton okButton = new JButton("Ok");
        okButton.setBackground(Color.LIGHT_GRAY);
        okButton.setForeground(Color.BLACK);

        JButton applyButton = new JButton("Apply");
        applyButton.setBackground(Color.LIGHT_GRAY);
        applyButton.setForeground(Color.BLACK);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.LIGHT_GRAY);
        cancelButton.setForeground(Color.BLACK);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.LIGHT_GRAY);

        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(okButton, BorderLayout.EAST);
        panelInferior.add(applyButton, BorderLayout.EAST);
        panelInferior.add(cancelButton, BorderLayout.EAST);



        allPanel.add(panelSuperior, BorderLayout.NORTH);
        allPanel.add(newUser, BorderLayout.CENTER);
        allPanel.add(userAccount, BorderLayout.CENTER);
        allPanel.add(panelInferior, BorderLayout.SOUTH);
       try{
 
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        
        ventana.add(allPanel);
        ventana.setVisible(true);

    }
}
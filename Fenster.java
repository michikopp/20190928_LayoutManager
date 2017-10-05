package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame{

    private JPanel jPanelNorth;
    private JPanel jPanelSouth;
    private JPanel jPanelWest;
    private JPanel jPanelEasth;
    private JPanel jPanelCenter;

    private JLabel jLabelNorth;
    private JLabel jLabelSouth;
    private JLabel jLabelWest;
    private JLabel jLabelEasth;
    private JLabel jLabelCenter;

    public Fenster(){
        super("Borderlayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        jPanelNorth = new JPanel();
        jPanelSouth = new JPanel();
        jPanelWest = new JPanel();
        jPanelEasth = new JPanel();
        jPanelCenter = new JPanel();

        jLabelNorth = new JLabel();
        jLabelSouth = new JLabel();
        jLabelWest = new JLabel();
        jLabelEasth = new JLabel();
        jLabelCenter = new JLabel();

        jLabelNorth.setText("North");
        jLabelSouth.setText("Sout");
        jLabelWest.setText("West");
        jLabelEasth.setText("East");
        jLabelCenter.setText("Center");

        jPanelNorth.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanelSouth.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanelWest.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanelEasth.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanelCenter.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jPanelNorth.add(jLabelNorth);
        jPanelSouth.add(jLabelSouth);
        jPanelWest.add(jLabelWest);
        jPanelEasth.add(jLabelEasth);
        jPanelCenter.add(jLabelCenter);
        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelSouth, BorderLayout.SOUTH);
        this.add(jPanelWest, BorderLayout.WEST);
        this.add(jPanelEasth, BorderLayout.EAST);
        this.add(jPanelCenter, BorderLayout.CENTER);

    }
}

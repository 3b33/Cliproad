package com.cliproads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

public class Cliproads {
    private JTextField textField1_1;
    private JTextField textField2_1;
    private JTextField textField3_1;
    private JTextField textField4_1;
    private JTextField textField5_1;
    private JTextField textField6_1;
    private JTextField textField7_1;
    private JTextField textField8_1;
    private JTextField textField1_2;
    private JTextField textField2_2;
    private JTextField textField3_2;
    private JTextField textField4_2;
    private JTextField textField5_2;
    private JTextField textField6_2;
    private JTextField textField7_2;
    private JTextField textField8_2;
    private JTextField tx_separator;
    private JLabel lbl_separator;
    private JTextField textField1_3;
    private JTextField textField2_3;
    private JTextField textField3_3;
    private JTextField textField4_3;
    private JTextField textField5_3;
    private JTextField textField6_3;
    private JTextField textField7_3;
    private JTextField textField8_3;
    private JTextField textField1_4;
    private JTextField textField2_4;
    private JTextField textField3_4;
    private JTextField textField4_4;
    private JTextField textField5_4;
    private JTextField textField6_4;
    private JTextField textField7_4;
    private JTextField textField8_4;
    private JLabel clipboardContentsLabel;
    private JTextPane tx_info;
    private JButton saveAsButton;
    private JComboBox cb_templates;
    private JButton deleteButton;
    private JPanel masterJPanel;
    private String road = "client1_blaablaa.png"; // this should be replaced with the actual combined string from the active cells
    private int[] activeCells = {1,2,1,2,3,2,1,0}; // 0 = cell column not in use
    private JTextField[] cellRow1 = {textField1_1,textField1_2,textField1_3,textField1_4};
    private JTextField[] cellRow2 = {textField2_1,textField2_2,textField2_3,textField2_4};
    private JTextField[] cellRow3 = {textField3_1,textField3_2,textField3_3,textField3_4};
    private JTextField[] cellRow4 = {textField4_1,textField4_2,textField4_3,textField4_4};
    private JTextField[] cellRow5 = {textField5_1,textField5_2,textField5_3,textField5_4};
    private JTextField[] cellRow6 = {textField6_1,textField6_2,textField6_3,textField6_4};
    private JTextField[] cellRow7 = {textField7_1,textField7_2,textField7_3,textField7_4};
    private JTextField[] cellRow8 = {textField8_1,textField8_2,textField8_3,textField8_4};
    private JTextField[][] cells = {cellRow1,cellRow2,cellRow3,cellRow4,cellRow5,cellRow6,cellRow7,cellRow8};

    public Cliproads() {

        textField1_1.addFocusListener(new cellClicked("1_1")); // https://stackoverflow.com/questions/10133366/how-to-clear-jtextfield-when-mouse-clicks-the-jtextfield
    }

    private class cellClicked implements FocusListener {

        private String cellLoc;


        public cellClicked(String loc) {
            this.cellLoc = loc;
        }

        @Override
        public void focusGained(FocusEvent e) {
            tx_info.setText(road);
        }
        public void focusLost(FocusEvent e) {}
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cliproads");
        frame.setContentPane(new Cliproads().masterJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

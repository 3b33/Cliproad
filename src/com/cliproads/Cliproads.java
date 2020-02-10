package com.cliproads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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


    public Cliproads() {

        textField1_1.addFocusListener(new cellClicked("1_1")); // https://stackoverflow.com/questions/10133366/how-to-clear-jtextfield-when-mouse-clicks-the-jtextfield
    }

    private class cellClicked implements FocusListener {

        private String cellLoc;
        private String road = "client1_blaablaa.png"; // this should be replaced with the actual combined string from the active cells

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

package com.example.raven.chart;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Text extends javax.swing.JPanel {
    private JLabel label;
    private JTextField textField;

    public Text(String labelText, int textFieldWidth) {
        label = new JLabel(labelText);
        textField = new JTextField(textFieldWidth);

        setLayout(new BorderLayout());  // Use BorderLayout for simplicity
        add(label, BorderLayout.WEST);  // Add the label to the west
        add(textField, BorderLayout.CENTER);  // Add the text field in the center

        // Optional: Add some padding around the components
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }

    // Method to get text from the text field
    public String getText() {
        return textField.getText();
    }

    // Method to set text in the text field
    public void setText(String text) {
        textField.setText(text);
    }

    public static void main(String[] args) {
        // Create the JFrame to hold the TextBoxPanel
        JFrame frame = new JFrame("Custom Text Box Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);

        // Create an instance of TextBoxPanel
        Text textBoxPanel = new Text("Enter your name: ", 20);

        // Add the TextBoxPanel to the frame
        frame.add(textBoxPanel);

        // Display the frame
        frame.setVisible(true);
    }
}

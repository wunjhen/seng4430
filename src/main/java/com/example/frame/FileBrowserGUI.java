package com.example.frame;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import com.example.FogIndex.FogIndexController;
import com.example.FogIndex.FogIndexModel;
import com.example.FogIndex.FogIndexView;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersController;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersModel;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersView;

public class FileBrowserGUI extends JFrame {
    
    private JButton browseButton;
    private JTextArea textArea;
    
    public FileBrowserGUI() {
        super("Software Quality Metrics");
        StringBuilder content = new StringBuilder();
        browseButton = new JButton("Browse");
        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Choose a file");
                int userSelection = fileChooser.showOpenDialog(FileBrowserGUI.this);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (
                        FileReader fileReader = new FileReader(selectedFile);
                        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            content.append(line);
                            content.append("\n");
                        }
                        String programText = content.toString();
                        // fog index
                        FogIndexView view = new FogIndexView();
                        FogIndexModel model = new FogIndexModel(programText);
                        FogIndexController controller = new FogIndexController(model, view);
                        controller.updateView();
                        // length of identifier
                        LengthOfIdentifiersModel limodel = new LengthOfIdentifiersModel(programText);
                        LengthOfIdentifiersView liview = new LengthOfIdentifiersView();
                        LengthOfIdentifiersController licontroller = new LengthOfIdentifiersController(limodel, liview);
                        licontroller.analyzeIdentifiers();
                        JOptionPane.showMessageDialog(FileBrowserGUI.this, controller.updateView() + "\n" + licontroller.analyzeIdentifiers());
                    } catch (IOException ee) {
                        ee.printStackTrace();
                    }
                    
                }
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(browseButton, BorderLayout.CENTER);
        
        add(panel);
        
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileBrowserGUI();
            }
        });
    }
}

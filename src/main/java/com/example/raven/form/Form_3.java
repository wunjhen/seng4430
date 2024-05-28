package com.example.raven.form;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.example.CyclomaticComplexityCalculator.CyclomaticComplexityCalculator;
import com.example.FanInFanOutCalculator.FanInFanOutCalculator;
import com.example.FogIndex.FogIndexController;
import com.example.FogIndex.FogIndexModel;
import com.example.FogIndex.FogIndexView;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersController;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersModel;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersView;
import com.example.NestedIf.NestedIf;
import com.example.Security.PlainTextCredentialsCheck;
import com.example.WeightedMethodPerClassCalculator.WeightedMethodPerClassCalculator;

public class Form_3 extends javax.swing.JPanel{
    public Form_3() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        body = new javax.swing.JPanel();
        menu1 = new com.example.raven.component.Menu();
        StringBuilder content = new StringBuilder();
        jButton = new javax.swing.JButton("Click Me To Upload Source Code!");
        jButton.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jButton.setForeground(new java.awt.Color(137, 137, 137));
        jButton.setBackground(new java.awt.Color(0,0,0));
        jButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setMultiSelectionEnabled(true);
                int returnValue = fileChooser.showOpenDialog(null); // Show the file chooser dialog

                // Handle the file selection
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File[] selectedFiles = fileChooser.getSelectedFiles();
                    // Do something with the selected file
                    int value1 = 0;
                    int value2 = 0;
                    int value3 = 0;
                    int value4 = 0;
                    int value5 = 0;
                    int value6 = 0;
                    int value7 = 0;
                    String programText;
                    // fog index
                    FogIndexView view;
                    FogIndexModel model;
                    FogIndexController controller = new FogIndexController();
                    // length of identifier
                    LengthOfIdentifiersModel limodel;
                    LengthOfIdentifiersView liview;
                    LengthOfIdentifiersController licontroller = new LengthOfIdentifiersController();
                    // CyclomaticComplexityCalculator
                    CyclomaticComplexityCalculator cyclomaticComplexityCalculator = new CyclomaticComplexityCalculator();;
                    // NestedIf
                    NestedIf nestedIfCount  = new NestedIf();
                    // WeightedMethodPerClassCalculator
                    WeightedMethodPerClassCalculator weightedMethodPerClassCalculator = new WeightedMethodPerClassCalculator();
                    // Fan in Fan out
                    FanInFanOutCalculator fanInFanOutCalculator = new FanInFanOutCalculator();
                    // security
                    PlainTextCredentialsCheck plainTextCredentialsCheck = new PlainTextCredentialsCheck();
                    for (File selectedFile : selectedFiles) {
                        try (
                            FileReader fileReader = new FileReader(selectedFile);
                            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                        
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                content.append(line);
                                content.append("\n");
                            }
                            programText = content.toString();
                            // fog index
                            view = new FogIndexView();
                            model = new FogIndexModel(programText);
                            controller = new FogIndexController(model, view);
                            controller.updateView();
                            // length of identifier
                            limodel = new LengthOfIdentifiersModel(programText);
                            liview = new LengthOfIdentifiersView();
                            licontroller = new LengthOfIdentifiersController(limodel, liview);
                            licontroller.analyzeIdentifiers();
                            plainTextCredentialsCheck.credentialsCheck(programText);
                            value1 = controller.updateView() + value1;
                            value2 = licontroller.analyzeIdentifiers() + value2;
                            value3 = cyclomaticComplexityCalculator.calculateCyclomaticComplexity(selectedFile) + value4;
                            value4 = nestedIfCount.countNestedIfs(selectedFile) + value4;
                            value5 = weightedMethodPerClassCalculator.calculateWeightedMethodPerClass(selectedFile) + value5;
                            value6 = fanInFanOutCalculator.FIFOCalculator(selectedFile) + value6;
                            value7 = plainTextCredentialsCheck.credentialsCheck(programText)+value7;
                        } catch (IOException ee) {
                            ee.printStackTrace();
                        }
                    }
                    controller.value=value1;
                    licontroller.value=value2;
                    cyclomaticComplexityCalculator.value=value3;
                    nestedIfCount.value=value4;
                    weightedMethodPerClassCalculator.value=value5;
                    fanInFanOutCalculator.value=value6;
                    plainTextCredentialsCheck.securityResult=value7;
                    JOptionPane.showMessageDialog(Form_3.this, "Please go to report page!");
                }
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );


        

        

    }
    private javax.swing.JButton jButton;
    private javax.swing.JPanel body;
    private com.example.raven.component.Menu menu1;
}

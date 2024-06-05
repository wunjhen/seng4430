package com.example.raven.form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;

import com.example.CyclomaticComplexityCalculator.CyclomaticComplexityCalculator;
import com.example.FanInFanOutCalculator.FanInFanOutCalculator;
import com.example.FogIndex.FogIndexController;
import com.example.LengthOfIdentifiers.LengthOfIdentifiersController;
import com.example.NestedIf.NestedIf;
import com.example.Security.PlainTextCredentialsCheck;
import com.example.WeightedMethodPerClassCalculator.WeightedMethodPerClassCalculator;
import com.example.raven.chart.ModelChart;
public class Form_1 extends javax.swing.JPanel {
    public Form_1() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init() {
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FogIndexController controller1 = new FogIndexController();
        LengthOfIdentifiersController controller2 = new LengthOfIdentifiersController();
        // CyclomaticComplexityCalculator
        CyclomaticComplexityCalculator controller3 = new CyclomaticComplexityCalculator();;
        // NestedIf
        NestedIf controller4  = new NestedIf();
        // WeightedMethodPerClassCalculator
        WeightedMethodPerClassCalculator controller5 = new WeightedMethodPerClassCalculator();
        // Fan in Fan out
        FanInFanOutCalculator controller6 = new FanInFanOutCalculator();
        roundPanel1 = new com.example.raven.swing.RoundPanel();
        roundPanel2 = new com.example.raven.swing.RoundPanel();

        

        jPanelSecurity = new javax.swing.JPanel();
        jLabelSecurity = new javax.swing.JLabel();
        progressSecurity = new com.example.raven.swing.progress.Progress();
        jPanelSecurity.setOpaque(false);
        //jLabelSecurity.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelSecurity.setForeground(new java.awt.Color(220, 220, 220));
        jLabelSecurity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSecurity.setText("Security");
        progressSecurity.setBackground(new java.awt.Color(66, 246, 84));
        progressSecurity.setForeground(new java.awt.Color(19, 153, 32));
        int result4 = (PlainTextCredentialsCheck.securityResult)*20;
        progressSecurity.setValue(result4);
        javax.swing.GroupLayout jPanelSecurityLayout = new javax.swing.GroupLayout(jPanelSecurity);
        jPanelSecurity.setLayout(jPanelSecurityLayout);
        jPanelSecurityLayout.setHorizontalGroup(
            jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSecurityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressSecurity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSecurity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSecurityLayout.setVerticalGroup(
            jPanelSecurityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSecurityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSecurity)
                .addGap(18, 18, 18)
                .addComponent(progressSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );


        jPanelMaintainability = new javax.swing.JPanel();
        jLabelMaintainability = new javax.swing.JLabel();
        progressMaintainability = new com.example.raven.swing.progress.Progress();
        jPanelMaintainability.setOpaque(false);
        jLabelMaintainability.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelMaintainability.setForeground(new java.awt.Color(220, 220, 220));
        jLabelMaintainability.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMaintainability.setText("Maintainability");
        progressMaintainability.setBackground(new java.awt.Color(186, 37, 37));
        progressMaintainability.setForeground(new java.awt.Color(241, 100, 120));
        int result1 = Math.abs((200 -controller6.value-controller5.value-controller2.value)/4);
        progressMaintainability.setValue(result1);
        javax.swing.GroupLayout jPanelMaintainabilityLayout = new javax.swing.GroupLayout(jPanelMaintainability);
        jPanelMaintainability.setLayout(jPanelMaintainabilityLayout);
        jPanelMaintainabilityLayout.setHorizontalGroup(
            jPanelMaintainabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaintainabilityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMaintainabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressMaintainability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMaintainability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMaintainabilityLayout.setVerticalGroup(
            jPanelMaintainabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaintainabilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMaintainability)
                .addGap(18, 18, 18)
                .addComponent(progressMaintainability, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        


        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        progress2 = new com.example.raven.swing.progress.Progress();
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 220, 220));
        jLabel2.setText("Final Score");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel2.setOpaque(false);
        progress2.setBackground(new java.awt.Color(66, 193, 246));
        progress2.setForeground(new java.awt.Color(26, 132, 181));
        int result2 = Math.abs((250 -controller3.value)/4);
        progress2.setValue(result2);
        jPanelReliability = new javax.swing.JPanel();
        jLabelReliability = new javax.swing.JLabel();
        progressReliability = new com.example.raven.swing.progress.Progress();
        jLabelReliability.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelReliability.setForeground(new java.awt.Color(220, 220, 220));
        jLabelReliability.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReliability.setText("Reliability");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progress2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelReliability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReliability)
                .addGap(18, 18, 18)
                .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelReliability.setOpaque(false);
        progressReliability.setBackground(new java.awt.Color(132, 66, 246));
        progressReliability.setForeground(new java.awt.Color(64, 18, 153));
        int result3 = Math.abs((200 -controller4.value+controller1.value)/4);
        progressReliability.setValue(result3);






        jLabelUsability = new javax.swing.JLabel();
        jLabelUsability.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabelUsability.setForeground(new java.awt.Color(220, 220, 220));
        jLabelUsability.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsability.setText("Readability");
        javax.swing.GroupLayout jPanelUsabilityLayout = new javax.swing.GroupLayout(jPanelReliability);
        jPanelReliability.setLayout(jPanelUsabilityLayout);
        jPanelUsabilityLayout.setHorizontalGroup(
            jPanelUsabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsabilityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressReliability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUsability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelUsabilityLayout.setVerticalGroup(
            jPanelUsabilityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsabilityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsability)
                .addGap(18, 18, 18)
                .addComponent(progressReliability, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );



        
        chart = new com.example.raven.chart.Chart();
        roundPanel1.setBackground(new java.awt.Color(51, 51, 51));

        

        

    
        

        jPanelDescription = new javax.swing.JPanel(new BorderLayout());
        jPanelDescription.setOpaque(false);
        jTextArea = new javax.swing.JTextArea (10, 30);
        String report1 ="";
        if(result1<=20){
            report1 = "Maintainability - Low: Very difficult to read, very complex code, needs refactoring.";
        }else if(result1<=40){
            report1 = "Maintainability - Moderate: Difficult to read, complex code.";
        }else if(result1<=60){
            report1 = "Maintainability - Moderate: Average difficulty, moderately complex code.";
        }else if(result1<=80){
            report1 = "Maintainability - Good: Easy to read, simple and well-structured code.";
        }else{
            report1 = "Maintainability - Very Good: Very easy to read, simple and well-structured code.";
        }

        String report2 ="";
        if(result2<=20){
            report2 = "Reliability - Low: Very high nesting, likely confusing, very high complexity, likely needs refactoring";
        }else if(result2<=40){
            report2 = "Reliability - Moderate: Moderate nesting, manageable, low complexity";
        }else if(result2<=60){
            report2 = "Reliability - Moderate: Moderate nesting, manageable, moderate complexity";
        }else if(result2<=80){
            report2 = "Reliability - Good: High nesting, potentially confusing, high complexity";
        }else{
            report2 = "Reliability - Very Good: Low nesting, easy to understand, low complexity";
        }

        String report3 ="";
        if(result3<=30){
            report3 = "Readability - It's difficult to read and understand the logical of code.";
        }else if(result3<=70){
            report3 = "Readability - Moderate, you need to read it more then once, and reference documents.";
        }else{
            report3 = "Readability - the whole structure is good, it's more easy for developer to read it.";
        }

        String report4 ="";
        if(result4<=30){
            report4 = "Security - Low: Low secure, easy to be hacked.";
        }else if(result4<=70){
            report4 = "Security - Moderate: Moderate secure, apply some mainstreamed encryption method.";
        }else{
            report4 = "Security - Very Good: High secure, difficult to break password and related algorithm.";
        }
        jTextArea.setText("Your report has been out, just shown as below:\n" +"\n"+report2+"\n"+report3+"\n"+report4+"\n"+report1);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false); 
        jTextArea.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea.setForeground(new java.awt.Color(220, 220, 220));
        jTextArea.setBorder(null);
        Font font = new Font("Serif", Font.PLAIN, 18);
        jTextArea.setFont(font);
        JScrollPane scrollPane = new JScrollPane(jTextArea);
        jPanelDescription.add(scrollPane, BorderLayout.CENTER); 




        

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelReliability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMaintainability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelReliability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSecurity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMaintainability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()
                    )

        );




        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            )
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                    )
                .addGap(10, 10, 10)
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE))
        );
        chart.addLegend("Reliability", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Usability", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Security", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Maintainability", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("Class", new double[]{result2, result3, 0, result1}));
        chart.start();
        progressSecurity.start();
        progress2.start();
        progressReliability.start();
        progressMaintainability.start();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.example.raven.chart.Chart chart;
    private javax.swing.JLabel jLabelSecurity;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelMaintainability;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelReliability;
    private javax.swing.JLabel jLabelUsability;
    private javax.swing.JPanel jPanelSecurity;
    private javax.swing.JPanel jPanelDescription;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelReliability;
    private javax.swing.JPanel jPanelMaintainability;
    private javax.swing.JTextArea jTextArea;

    private com.example.raven.swing.progress.Progress progressSecurity;
    private com.example.raven.swing.progress.Progress progress2;
    private com.example.raven.swing.progress.Progress progressReliability;
    private com.example.raven.swing.progress.Progress progressMaintainability;
    private com.example.raven.swing.RoundPanel roundPanel1;
    private com.example.raven.swing.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables
}
